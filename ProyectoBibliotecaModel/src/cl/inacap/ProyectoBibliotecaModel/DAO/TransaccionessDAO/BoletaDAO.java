/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.TransaccionessDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones.Boleta;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class BoletaDAO {

    private DBUtils dbutils = new DBUtils();
    //Metodos

    public void ingresarBoleta(Boleta p) {
        //personas.add(p);

        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO boleta(folio,PrecioNeto,PrecioIva,CostoIva,FechaVenta,HoraVenta,Iva,TipoPago_id)"
                    + " VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getFolio());
            st.setInt(2, p.getPrecioNeto());
            st.setInt(3, p.getPrecioIVA());
            st.setInt(4, p.getCostoIVA());
            st.setString(5, p.getFechaVenta());
            st.setString(6, p.getHoraVenta());
            st.setInt(7, p.getIva());
            st.setInt(8, p.getTipoPagoID());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        } finally {
            //4 desconectar DB
            dbutils.desconectar();
        }

    }

    public void eliminarBoleta(Boleta p) {
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Boleta WHERE folio=? ";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getFolio());
            st.executeUpdate();
        } catch (Exception e) {

        } finally {
            dbutils.desconectar();
        }
    }

    public List<Boleta> getBoletas() {
        List<Boleta> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT folio,precioNeto,precioIva,costoIva,fechaVenta,horaVenta,Iva,tipoPago_id from Boleta order by folio asc";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Boleta s = new Boleta();
                s.setFolio(rs.getInt(1));
                s.setPrecioNeto(rs.getInt(2));
                s.setPrecioIVA(rs.getInt(3));
                s.setCostoIVA(rs.getInt(4));
                s.setFechaVenta(rs.getString(5));
                s.setHoraVenta(rs.getString(6));
                s.setIva(rs.getInt(7));
                s.setTipoPagoID(rs.getInt(8));
                list.add(s);
            }
            rs.close();

        } catch (Exception e) {
            list = null;
        } finally {
            dbutils.desconectar();
            return list;
        }

    }
}
