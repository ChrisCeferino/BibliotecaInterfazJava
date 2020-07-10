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
public class DetalleArr {
    int idLibro, idArr;

    public DetalleArr() {
    }

    
    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdArr() {
        return idArr;
    }

    public void setIdArr(int idArr) {
        this.idArr = idArr;
    }
    @Override
    public String toString(){
        return this.idArr + " " + this.idLibro;
    }
}
