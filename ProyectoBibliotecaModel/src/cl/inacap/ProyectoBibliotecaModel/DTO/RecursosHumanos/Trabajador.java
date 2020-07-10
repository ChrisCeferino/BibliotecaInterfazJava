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
public class Trabajador {
    int rut;
    String nombre,apeMat,apePat,fechContra;
    int tipoTrabajadorID;

    public Trabajador() {
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

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getFechContra() {
        return fechContra;
    }

    public void setFechContra(String fechContra) {
        this.fechContra = fechContra;
    }

    public int getTipoTrabajadorID() {
        return tipoTrabajadorID;
    }

    public void setTipoTrabajadorID(int tipoTrabajadorID) {
        this.tipoTrabajadorID = tipoTrabajadorID;
    }
    @Override
    public String toString(){
        return this.nombre + " " + this.apePat + " " + this.rut;
    }
}
