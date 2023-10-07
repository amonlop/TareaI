package com.example;

import java.util.ArrayList;

class Cliente {
    private String rut;
    private String nombre;
    private Direccion direccion;
    private ArrayList<OrdenCompra> ordenesCompra;

    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.ordenesCompra = new ArrayList<>();
    }
    public ArrayList<OrdenCompra> getOrdenesCompra() {
        return ordenesCompra;
    }
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
