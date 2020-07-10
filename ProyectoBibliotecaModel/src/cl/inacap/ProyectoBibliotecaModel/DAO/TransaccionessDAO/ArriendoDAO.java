/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.Arriendo;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class ArriendoDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarArriendo(Arriendo p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Arriendo(id,CostoTotal,FechaArr,FechaDevEntrega,FechaDevReal,DiasRetraso,Multa,Iva,TipoPago_id,Trabajador_Rut,Cliente_rut)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getId());
            st.setInt(2, p.getCostoTotal());
            st.setString(3, p.getFechaArri());
            st.setString(4, p.getFechaDevEntr());
            st.setString(5, p.getFechaDevReal());
            st.setInt(6, p.getDiasRetraso());
            st.setInt(7, p.getMulta());
            st.setInt(8, p.getIva());
            st.setInt(9, p.getTipoPago());
            st.setInt(10, p.getTrabajadorRut());
            st.setInt(11, p.getClienteRut());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarArriendo(Arriendo p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Arriendo WHERE id=? order by id asc";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Arriendo> getArriendos(){
        List<Arriendo> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,CostoTotal,FechaArr,FechaDevEntrega,FechaDevReal,DiasRetraso,Multa,Iva,TipoPago_id,Trabajador_Rut,Cliente_rut from Arriendo";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Arriendo s = new Arriendo();
                s.setId(rs.getInt(1));
                s.setCostoTotal(rs.getInt(2));
                s.setFechaArri(rs.getString(3));
                s.setFechaDevEntr(rs.getString(4));
                s.setFechaDevReal(rs.getString(5));
                s.setDiasRetraso(rs.getInt(6));
                s.setMulta(rs.getInt(7));
                s.setIva(rs.getInt(8));
                s.setTipoPago(rs.getInt(9));
                s.setTrabajadorRut(10);
                s.setClienteRut(rs.getInt(11));
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
