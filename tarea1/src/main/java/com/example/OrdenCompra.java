package com.example;

public class DetalleOrden {
    private Date fecha;
    private String estado;

    public DetalleOrden(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

    public DetalleOrden(Date fecha, String estado) {
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
