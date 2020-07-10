/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Libro;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class LibroDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarLibro(Libro p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Libro(serie,isbn,titulo,npag,precio,anio,estado,editorial_id)"
                    + " VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getIdSerie());
            st.setInt(2, p.getIsbn());
            st.setString(3, p.getTitulo());
            st.setInt(4, p.getNpag());
            st.setInt(5, p.getPrecio());
            st.setString(6, p.getAño());
            st.setString(7,p.getEstado());
            st.setInt(8, p.getId_Editorial());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarLibro(Libro p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Libro WHERE serie=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdSerie());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Libro> getLibros(){
        List<Libro> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT serie,isbn,titulo,npag,precio,anio,estado,editorial_id from Libro";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Libro s = new Libro();
                s.setIdSerie(rs.getInt(1));
                s.setIsbn(rs.getInt(2));
                s.setTitulo(rs.getString(3));
                s.setNpag(rs.getInt(4));
                s.setPrecio(rs.getInt(5));
                s.setAño(rs.getString(6));
                s.setEstado(rs.getString(7));
                s.setId_Editorial(rs.getInt(8));
                list.add(s);
            }
            rs.close();
            
                
        } catch (Exception e) {
            list=null;
        }finally{
            dbutils.desconectar();
            return list;
        }
        
    }
}
