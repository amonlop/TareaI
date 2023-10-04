package com.example;

import java.util.ArrayList;
import java.util.Date;

class OrdenCompra {
    private ArrayList<OrdenCompra> OrdenCompra;
    private ArrayList<Pago> pagos;
    private DocTributario docTributario;
    private Cliente cliente;
    private Date fecha;
    private String estado;

    public OrdenCompra(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
