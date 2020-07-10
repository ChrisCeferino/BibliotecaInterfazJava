/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.LibroVenta;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class LibroVentaDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarLibroVenta(LibroVenta p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO LibroVenta(libro_serie,venta_id)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdLibro());
            st.setInt(2, p.getIdVenta());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarLibroVenta(LibroVenta p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM LibroVenta WHERE libro_serie=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdLibro());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<LibroVenta> getLibroVentas(){
        List<LibroVenta> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT libro_serie,venta_id from LibroVenta";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                LibroVenta s = new LibroVenta();
                s.setIdLibro(rs.getInt(1));
                s.setIdVenta(rs.getInt(2));
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
