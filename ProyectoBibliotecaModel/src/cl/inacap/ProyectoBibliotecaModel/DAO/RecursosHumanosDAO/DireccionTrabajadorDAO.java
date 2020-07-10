/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.RecursosHumanosDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos.DireccionTrabajador;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class DireccionTrabajadorDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarDireccionTrabajador(DireccionTrabajador p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO DireccionTrabajador(direccion_id,trabajador_rut)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.setInt(2, p.getTrabajadorRut());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarDireccionTrabajador(DireccionTrabajador p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM DireccionTrabajador WHERE direccion_id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<DireccionTrabajador> getDireccionTrabajadores(){
        List<DireccionTrabajador> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT direccion_id,trabajador_rut from DireccionTrabajador";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DireccionTrabajador s = new DireccionTrabajador();
                s.setId(rs.getInt(1));
                s.setTrabajadorRut(rs.getInt(2));
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
