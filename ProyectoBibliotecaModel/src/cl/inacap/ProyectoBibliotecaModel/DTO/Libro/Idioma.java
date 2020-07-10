/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DTO.Libro;

/**
 *
 * @author Garnios
 */
public class Idioma {

    int idIdioma;
    String nombIdioma, descIdioma, estado;

    public Idioma() {
    }

    public int getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNombIdioma() {
        return nombIdioma;
    }

    public void setNombIdioma(String nombIdioma) {
        this.nombIdioma = nombIdioma;
    }

    public String getDescIdioma() {
        return descIdioma;
    }

    public void setDescIdioma(String descIdioma) {
        this.descIdioma = descIdioma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.nombIdioma + " " + this.idIdioma;
    }
}
