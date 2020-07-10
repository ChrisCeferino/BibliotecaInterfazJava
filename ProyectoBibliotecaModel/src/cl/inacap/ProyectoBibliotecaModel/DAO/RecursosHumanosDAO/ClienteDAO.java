/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.RecursosHumanosDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos.Cliente;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garniosxd
 */
public class ClienteDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarCliente(Cliente p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Cliente(rut,nombre,apellidoMaterno,apellidoPaterno,fechaNac,estado)"
                    + " VALUES(?,?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getRut());
            st.setString(2, p.getNombre());
            st.setString(3, p.getApeMat());
            st.setString(4, p.getApePat());
            st.setString(5, p.getFechNac());
            st.setString(6, p.getEstado());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarCliente(Cliente p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Cliente WHERE rut=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getRut());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Cliente> getClientes(){
        List<Cliente> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT rut,nombre,apellidoMaterno,apellidoPaterno,fechaNac,estado from Cliente";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Cliente s = new Cliente();
                s.setRut(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setApeMat(rs.getString(3));
                s.setApePat(rs.getString(4));
                s.setFechNac(rs.getString(5));
                s.setEstado(rs.getString(6));
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
