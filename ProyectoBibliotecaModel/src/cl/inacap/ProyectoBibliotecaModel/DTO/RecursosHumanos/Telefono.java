/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos;

/**
 *
 * @author Garnios
 */
public class Telefono {

    int id, numero, trabajadorRut, clienteRut, distribuidorRut;

    public Telefono() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public int getDistribuidorRut() {
        return distribuidorRut;
    }

    public void setDistribuidorRut(int distribuidorRut) {
        this.distribuidorRut = distribuidorRut;
    }

    @Override
    public String toString() {
        return this.id + " " + this.numero;
    }
}
