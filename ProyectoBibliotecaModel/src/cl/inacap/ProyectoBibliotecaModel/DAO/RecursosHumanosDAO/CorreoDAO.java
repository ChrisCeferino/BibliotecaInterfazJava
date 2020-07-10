/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.RecursosHumanosDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos.Correo;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class CorreoDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarCorreo(Correo p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO correo(id,nombre,cliente_rut,Trabajador_Rut,Distribuidor_rut)"
                    + " VALUES(?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.setString(2, p.getNombre());
            st.setInt(3, p.getClienteRut());
            st.setInt(4, p.getTrabajadorRut());
            st.setInt(5, p.getDistribuidorRut());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarCorreo(Correo p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Correo WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Correo> getCorreos(){
        List<Correo> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,nombre,cliente_rut,trabajador_rut,distribuidor_rut from Correo";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Correo s = new Correo();
                s.setId(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setClienteRut(rs.getInt(3));
                s.setTrabajadorRut(rs.getInt(4));
                s.setDistribuidorRut(rs.getInt(5));
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
