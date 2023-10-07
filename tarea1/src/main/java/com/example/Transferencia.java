package com.example;

import java.util.Date;

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(float monto, Date fecha) {
        super(monto, fecha);
    }

    public String toString() {
        return "Banco: " + this.banco + ", Número de cuenta: " + this.numCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
}
