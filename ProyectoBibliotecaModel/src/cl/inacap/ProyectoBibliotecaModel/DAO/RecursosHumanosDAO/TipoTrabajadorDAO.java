/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.RecursosHumanosDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos.TipoTrabajador;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class TipoTrabajadorDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarTipoTrabajador(TipoTrabajador p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO tipotrabaj(id,TipoTrabaj)"
                    + " VALUES(?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.setString(2, p.getDescTipo());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarTipoTrabajador(TipoTrabajador p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM tipotrabaj WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<TipoTrabajador> getTipoTrabajadores(){
        List<TipoTrabajador> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,tipoTrabaj from tipotrabaj";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                TipoTrabajador s = new TipoTrabajador();
                s.setId(rs.getInt(1));
                s.setDescTipo(rs.getString(2));
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
