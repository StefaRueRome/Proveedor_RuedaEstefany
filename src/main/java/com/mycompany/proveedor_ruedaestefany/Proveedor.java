/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proveedor_ruedaestefany;

/**
 *
 * @author Estefany Rueda
 */
public class Proveedor {

    String nombre;
    String ciudad;
    int numeroArticulos;

    public Proveedor(String nombre, String ciudad, int numeroArticulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroArticulos = numeroArticulos;
    }

    public Proveedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroArticulos() {
        return numeroArticulos;
    }

    public void setNumeroArticulos(int numeroArticulos) {
        this.numeroArticulos = numeroArticulos;
    }

}
