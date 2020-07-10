/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.TipoDePago;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class TipoDePagoDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarTipoPago(TipoDePago p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO tipopago(id,descripcion)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdPago());
            st.setString(2, p.getDesc_Pag());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarTipoPago(TipoDePago p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM tipopago WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdPago());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<TipoDePago> getTiposPagos(){
        List<TipoDePago> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,descripcion from tipopago";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                TipoDePago s = new TipoDePago();
                s.setIdPago(rs.getInt(1));
                s.setDesc_Pag(rs.getString(2));
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
