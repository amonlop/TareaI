package com.example;

import java.util.Date;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    private OrdenCompra OrdenCompra;

    public DocTributario(String numero, String rut, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
