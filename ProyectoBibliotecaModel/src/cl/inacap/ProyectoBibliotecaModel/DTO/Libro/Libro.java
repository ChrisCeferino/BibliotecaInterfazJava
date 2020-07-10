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
public class Libro {

    int idSerie, isbn;
    String titulo;
    int npag, precio;
    String año, estado;
    int id_Editorial;

    public Libro() {
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_Editorial() {
        return id_Editorial;
    }

    public void setId_Editorial(int id_Editorial) {
        this.id_Editorial = id_Editorial;
    }

    @Override
    public String toString() {
        return "Serie:"+ this.idSerie + " " + this.titulo + " " + this.precio;
    }

}
