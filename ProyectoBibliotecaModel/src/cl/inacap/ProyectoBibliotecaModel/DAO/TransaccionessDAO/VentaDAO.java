/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.Venta;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class VentaDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarVenta(Venta p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Venta(id,Cliente_rut,Trabajador_Rut,Boleta_folio)"
                    + " VALUES(?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getId());
            st.setInt(2, p.getClienteRut());
            st.setInt(3, p.getTrabajadorRut());
            st.setInt(4, p.getFolioBoleta());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarVenta(Venta p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Venta WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Venta> getVentas(){
        List<Venta> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,cliente_rut,trabajador_rut,boleta_folio from Venta";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Venta s = new Venta();
                s.setId(rs.getInt(1));
                s.setClienteRut(rs.getInt(2));
                s.setTrabajadorRut(rs.getInt(3));
                s.setFolioBoleta(rs.getInt(4));
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
