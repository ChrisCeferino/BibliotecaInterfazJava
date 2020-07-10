/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.LibroCategoria;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class LibroCategoriaDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarLibroCategoria(LibroCategoria p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO LibroCategoria(libro_serie,categoria_id)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getIdLibro());
            st.setInt(2,p.getIdCateg());           
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarLibroCategoria(LibroCategoria p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM LibroCategoria WHERE libro_serie=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdLibro());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<LibroCategoria> getLibrosCategorias(){
        List<LibroCategoria> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT libro_serie,categoria_id from LibroCategoria";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                LibroCategoria s = new LibroCategoria();
                s.setIdLibro(rs.getInt(1));
                s.setIdCateg(rs.getInt(2));
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
