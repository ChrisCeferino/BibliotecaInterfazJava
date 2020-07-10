/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.DetalleArr;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class DetalleArrDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarDetalleArr(DetalleArr p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO DetalleArr(libro_serie,arriendo_id)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdLibro());
            st.setInt(2, p.getIdArr());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarDetalleArr(DetalleArr p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM DetalleArr WHERE libro_serie=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getIdLibro());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<DetalleArr> getDetalleArrs(){
        List<DetalleArr> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT libro_serie,arriendo_id from DetalleArr";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DetalleArr s = new DetalleArr();
                s.setIdLibro(rs.getInt(1));
                s.setIdArr(rs.getInt(2));
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
