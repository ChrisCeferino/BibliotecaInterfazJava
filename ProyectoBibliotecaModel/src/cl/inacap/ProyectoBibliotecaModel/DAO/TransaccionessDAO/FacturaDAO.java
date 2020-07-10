/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.Factura;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class FacturaDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarFactura(Factura p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO factura(folio,PrecioNeto,PrecioTotal,CostoIva,fechaCompra,HoraCompra,Iva,TipoPago_id)"
                    + " VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getFolio());
            st.setInt(2, p.getPrecioNeto());
            st.setInt(3, p.getPrecioTotal());
            st.setInt(4, p.getCostoIva());
            st.setString(5, p.getFechaCompra());
            st.setString(6, p.getHoraCompra());
            st.setInt(7, p.getIva());
            st.setInt(8, p.getTipoDePagoID());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarFactura(Factura p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Factura WHERE folio=? ";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getFolio());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Factura> getFacturas(){
        List<Factura> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT folio,precioNeto,precioTotal,costoIva,fechaCompra,horaCompra,Iva,tipoPago_id from Factura";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Factura s = new Factura();
                s.setFolio(rs.getInt(1));
                s.setPrecioNeto(rs.getInt(2));
                s.setPrecioTotal(rs.getInt(3));
                s.setCostoIva(rs.getInt(4));
                s.setFechaCompra(rs.getString(5));
                s.setHoraCompra(rs.getString(6));
                s.setIva(rs.getInt(7));
                s.setTipoDePagoID(rs.getInt(8));
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
