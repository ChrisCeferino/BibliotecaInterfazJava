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
public class DireccionTrabajador {
    int id,TrabajadorRut;

    public DireccionTrabajador() {
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrabajadorRut() {
        return TrabajadorRut;
    }

    public void setTrabajadorRut(int TrabajadorRut) {
        this.TrabajadorRut = TrabajadorRut;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.TrabajadorRut;
    }
}
