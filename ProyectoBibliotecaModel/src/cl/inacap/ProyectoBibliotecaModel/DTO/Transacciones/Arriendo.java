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
public class Arriendo {
    int id, costoTotal;
    String fechaArri,fechaDevEntr,fechaDevReal;
    int diasRetraso,multa, iva, tipoPago, clienteRut,trabajadorRut;

    public Arriendo() {
    }

    public String getFechaDevReal() {
        return fechaDevReal;
    }

    public void setFechaDevReal(String fechaDevReal) {
        this.fechaDevReal = fechaDevReal;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFechaArri() {
        return fechaArri;
    }

    public void setFechaArri(String fechaArri) {
        this.fechaArri = fechaArri;
    }

    public String getFechaDevEntr() {
        return fechaDevEntr;
    }

    public void setFechaDevEntr(String fechaDevEntr) {
        this.fechaDevEntr = fechaDevEntr;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getClienteRut() {
        return clienteRut;
    }

    public void setClienteRut(int clienteRut) {
        this.clienteRut = clienteRut;
    }

    public int getTrabajadorRut() {
        return trabajadorRut;
    }

    public void setTrabajadorRut(int trabajadorRut) {
        this.trabajadorRut = trabajadorRut;
    }
    @Override
    public String toString(){
        return this.id + " " + this.costoTotal + " " + this.tipoPago;
    }
}
