/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.RecursosHumanosDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos.Distribuidor;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class DistribuidorDAO {
     private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarDistribuidor(Distribuidor p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Distribuidor(rut,nombre,añoIn,estado,direccion_id)"
                    + " VALUES(?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getRut());
            st.setString(2, p.getNombre());
            st.setString(3, p.getFechaIn());
            st.setString(4, p.getEstado());
            st.setInt(5, p.getDireccionID());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarDistribuidor(Distribuidor p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Distribuidor WHERE rut=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getRut());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Distribuidor> getDistribuidores(){
        List<Distribuidor> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT rut,nombre,añoIn,estado,direccion_id from Distribuidor";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Distribuidor s = new Distribuidor();
                s.setRut(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setFechaIn(rs.getString(3));
                s.setEstado(rs.getString(4));
                s.setDireccionID(rs.getInt(5));
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
