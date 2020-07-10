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
public class LibroVenta {
    int idLibro,idVenta;

    public LibroVenta() {
    }

    

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    @Override
    public String toString(){
        return this.idLibro + " " + this.idVenta;
    }
}
