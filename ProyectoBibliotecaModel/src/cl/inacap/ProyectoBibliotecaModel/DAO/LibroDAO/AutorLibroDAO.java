/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.AutorLibro;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class AutorLibroDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarAutorLibro(AutorLibro p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO AutorLibro(autor_id,libro_serie)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getIdAutor());
            st.setInt(2,p.getIdLibro());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarAutorLibro(AutorLibro p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM AutorLibro WHERE autor_id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdAutor());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<AutorLibro> getAutorLibros(){
        List<AutorLibro> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT autor_id,libro_serie from AutorLibro";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                AutorLibro s = new AutorLibro();
                s.setIdAutor(rs.getInt(1));
                s.setIdLibro(rs.getInt(2));
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
