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
public class Boleta {

    int folio, precioNeto, precioIVA, costoIVA;
    String FechaVenta,HoraVenta;
    int iva, tipoPagoID;

    public Boleta() {
    }

    public int getIva() {
        return iva;
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

    public int getPrecioIVA() {
        return precioIVA;
    }

    public void setPrecioIVA(int precioIVA) {
        this.precioIVA = precioIVA;
    }

    public int getCostoIVA() {
        return costoIVA;
    }

    public void setCostoIVA(int costoIVA) {
        this.costoIVA = costoIVA;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getHoraVenta() {
        return HoraVenta;
    }

    public void setHoraVenta(String HoraVenta) {
        this.HoraVenta = HoraVenta;
    }


    public int getTipoPagoID() {
        return tipoPagoID;
    }

    public void setTipoPagoID(int tipoPagoID) {
        this.tipoPagoID = tipoPagoID;
    }

    @Override
    public String toString() {
        return this.folio + " " + this.precioNeto + " " + this.tipoPagoID;
    }
}
