/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Editorial;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class EditorialDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarEditorial(Editorial p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Editorial(id,nombre,descripcion,estado)"
                    + " VALUES(?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getId());
            st.setString(2, p.getNombre());
            st.setString(3, p.getDesc());
            st.setString(4, p.getEstado());           
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarEditorial(Editorial p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Editorial WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Editorial> getEditoriales(){
        List<Editorial> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,nombre,descripcion,estado from Editorial";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Editorial s = new Editorial();
                s.setId(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setDesc(rs.getString(3));
                s.setEstado(rs.getString(4));
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
