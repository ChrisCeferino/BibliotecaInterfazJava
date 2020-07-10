/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBibliotecaModel.DTO.RecursosHumanos;

/**
 *
 * @author Garnios
 */
public class DireccionCliente {
    int id,clienteRut;

    public DireccionCliente() {
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteRut() {
        return clienteRut;
    }

    public void setClienteRut(int clienteRut) {
        this.clienteRut = clienteRut;
    }
    @Override
    public String toString(){
        return this.id + " " + this.clienteRut;
    }
}
