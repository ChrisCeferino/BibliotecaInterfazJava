/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DTO.Transacciones;

/**
 *
 * @author Garnios
 */
public class Venta {

    int id, folioBoleta, trabajadorRut, clienteRut;

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolioBoleta() {
        return folioBoleta;
    }

    public void setFolioBoleta(int folioBoleta) {
        this.folioBoleta = folioBoleta;
    }

    public int getTrabajadorRut() {
        return trabajadorRut;
    }

    public void setTrabajadorRut(int trabajadorRut) {
        this.trabajadorRut = trabajadorRut;
    }

    public int getClienteRut() {
        return clienteRut;
    }

    public void setClienteRut(int clienteRut) {
        this.clienteRut = clienteRut;
    }

    @Override
    public String toString() {
        return this.id + " " + this.folioBoleta;
    }
}
