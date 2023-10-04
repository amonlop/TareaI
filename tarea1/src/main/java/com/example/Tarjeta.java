package com.example;

import java.util.Date;

class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto, Date fecha) {
        super(monto, fecha);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
}
