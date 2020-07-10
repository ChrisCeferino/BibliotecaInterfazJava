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
public class Distribuidor {

    int rut;
    String nombre, fechaIn, Estado;
    int direccionID;

    public Distribuidor() {
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getDireccionID() {
        return direccionID;
    }

    public void setDireccionID(int direccionID) {
        this.direccionID = direccionID;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.rut + " " + this.direccionID;
    }
}
