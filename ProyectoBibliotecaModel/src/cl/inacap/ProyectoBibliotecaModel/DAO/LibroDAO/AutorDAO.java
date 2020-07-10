/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Autor;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class AutorDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarAutor(Autor p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO autor(id,Nombre,ApellidoMaterno,ApellidoPaterno,Estado)"
                    + " VALUES(?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getId());
            st.setString(2, p.getNombre());
            st.setString(3, p.getApeMat());
            st.setString(4, p.getApePat());
            st.setString(5, p.getEstado());           
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarAutor(Autor p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Autor WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Autor> getAutores(){
        List<Autor> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,Nombre,ApellidoMaterno,ApellidoPaterno,Estado from Autor";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Autor s = new Autor();
                s.setId(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setApeMat(rs.getString(3));
                s.setApePat(rs.getString(4));
                s.setEstado(rs.getString(5));
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
