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
public class Compra {

    int id, distribuidorRut, trabajadorRut, folioFact;

    public Compra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistribuidorRut() {
        return distribuidorRut;
    }

    public void setDistribuidorRut(int distribuidorRut) {
        this.distribuidorRut = distribuidorRut;
    }

    public int getTrabajadorRut() {
        return trabajadorRut;
    }

    public void setTrabajadorRut(int trabajadorRut) {
        this.trabajadorRut = trabajadorRut;
    }

    public int getFolioFact() {
        return folioFact;
    }

    public void setFolioFact(int folioFact) {
        this.folioFact = folioFact;
    }

    @Override
    public String toString() {
        return this.id + " " + this.folioFact;
    }

}
