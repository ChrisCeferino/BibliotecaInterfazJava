/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DAO.RecursosHumanosDAO;

import cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos.Trabajador;
import cl.inacap.ProyectoBibliotecaModel.utils.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Garnios
 */
public class TrabajadorDAO {

    private DBUtils dbutils = new DBUtils();
    //Metodos

    public void ingresarTrabajador(Trabajador p) {
        //personas.add(p);

        try {
            //1 Conectar BD
            dbutils.conectar();
            //2 Crear INSERT
            String sql = "INSERT INTO Trabajador(rut,nombre,apellidoMaterno,apellidoPaterno,fechaContrato,tipoTrabaj_id)"
                    + " VALUES(?,?,?,?,?,?)";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getRut());
            st.setString(2, p.getNombre());
            st.setString(3, p.getApeMat());
            st.setString(4, p.getApePat());
            st.setString(5, p.getFechContra());
            st.setInt(6, p.getTipoTrabajadorID());
            //3 Ejecutar Query
            st.executeUpdate();
        } catch (Exception e) {
        } finally {
            //4 desconectar DB
            dbutils.desconectar();
        }

    }

    public void eliminarTrabajador(Trabajador p) {
        try {
            this.dbutils.conectar();
            String sql = "DELETE FROM Trabajador WHERE rut=?";
            PreparedStatement st = dbutils.getConexion().prepareStatement(sql);
            st.setInt(1, p.getRut());
            st.executeUpdate();
        } catch (Exception e) {

        } finally {
            dbutils.desconectar();
        }
    }

    public List<Trabajador> getTrabajadores() {
        List<Trabajador> list = new ArrayList<>();
        // 1 Conectar
        try {
            this.dbutils.conectar();
            String sql = "SELECT rut,nombre,apellidoMaterno,apellidoPaterno,fechaContrato,tipoTrabaj_id from Trabajador";
            PreparedStatement st = this.dbutils.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Trabajador s = new Trabajador();
                s.setRut(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setApeMat(rs.getString(3));
                s.setApePat(rs.getString(4));
                s.setFechContra(rs.getString(5));
                s.setTipoTrabajadorID(rs.getInt(6));
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
