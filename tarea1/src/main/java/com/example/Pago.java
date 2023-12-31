package com.example;

import java.util.Date;

abstract class Pago {
    private float monto;
    private Date fecha;

    public Pago(float monto, Date fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    public String toString() {
        return "Monto: " + this.monto + ", fecha" + this.fecha.toString();
    }
    
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
