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
public class LibroCompra {
    int idLibro,idCompra;

    public LibroCompra() {
    }

    

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    @Override
    public String toString(){
        return this.idCompra + " " + this.idLibro;
    }
    
}
