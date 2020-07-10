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
public class TipoDePago {
    int idPago;
    String desc_Pag;

    public TipoDePago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDesc_Pag() {
        return desc_Pag;
    }

    public void setDesc_Pag(String desc_Pag) {
        this.desc_Pag = desc_Pag;
    }
    @Override
    public String toString(){
        return this.idPago + " " + this.desc_Pag;
    }
}
