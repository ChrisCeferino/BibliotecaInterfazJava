/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Garnios
 */
public class DBUtils {

    //
    private final String usuario = "asd123";
    private final String password = "asd123";
    private final String servidor = "localhost";
    private final String baseDatos = "biblioteca";
    private Connection conexion;

    //
    public boolean conectar() {
        boolean resultado;
        try {
            //1 agregar class Driver del motor
            Class.forName("com.mysql.jdbc.Driver");
            //2 Utilizar DriverManager
            //api del conexion:motor://servidor:puerto/basedatos
            String url = "jdbc:mysql://" + servidor + ":3306/" + baseDatos;
            this.conexion = DriverManager.getConnection(url, usuario, password);
            return resultado = true;
        } catch (Exception e) {
            return resultado = false;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void desconectar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
        }

    }

}
