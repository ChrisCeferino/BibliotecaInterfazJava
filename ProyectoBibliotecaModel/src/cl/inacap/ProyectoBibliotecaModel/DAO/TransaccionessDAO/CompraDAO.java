/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;


import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.Compra;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class CompraDAO {
    private DBUtils dbutils =  new DBUtils();
    //Metodos
    
    public void ingresarCompra(Compra p){
        //personas.add(p);
        
        
        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Compra(id,Distribuidor_rut,Trabajador_Rut,Factura_folio)"
                    + " VALUES(?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1,p.getId());
            st.setInt(2, p.getDistribuidorRut());
            st.setInt(3, p.getTrabajadorRut());
            st.setInt(4, p.getFolioFact());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        }finally{
            //4 desconectar DB
            dbutils.desconectar();
        }
        
        
        
    }
    
    public void eliminarCompra(Compra p){
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Compra WHERE id=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getId());
            st.executeUpdate();
        } catch (Exception e) {
            
        }finally{
            dbutils.desconectar();
        }
    }
    
    public List<Compra> getCompras(){
        List<Compra> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT id,Distribuidor_rut,Trabajador_Rut,Factura_folio from Compra";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Compra s = new Compra();
                s.setId(rs.getInt(1));
                s.setDistribuidorRut(rs.getInt(2));
                s.setTrabajadorRut(rs.getInt(3));
                s.setFolioFact(rs.getInt(4));
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
