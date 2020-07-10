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
public class Correo {

    int id;
    String nombre;
    int trabajadorRut, clienteRut, distribuidorRut;

    public Correo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String toString(){
        return this.id + " " + this.nombre;
    }

}
