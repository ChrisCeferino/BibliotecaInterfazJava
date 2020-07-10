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
public class Factura {

    int folio, precioNeto, precioTotal, costoIva;
    String fechaCompra,horaCompra;
    int iva, tipoDePagoID;

    public Factura() {
    }

    public int getIva() {
        return iva;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(int precioNeto) {
        this.precioNeto = precioNeto;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(int costoIva) {
        this.costoIva = costoIva;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = horaCompra;
    }

    public int getTipoDePagoID() {
        return tipoDePagoID;
    }

    public void setTipoDePagoID(int tipoDePagoID) {
        this.tipoDePagoID = tipoDePagoID;
    }

    @Override
    public String toString() {
        return this.folio + " " + this.precioTotal + " " + this.tipoDePagoID;
    }

}
