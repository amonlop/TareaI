package com.example;

import java.util.Date;

class Efectivo extends Pago {

    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
    }

    public float calcDevolucion(OrdenCompra orden) {
        float precio = orden.calcPrecio();
        return getMonto() - precio;
    }
}
