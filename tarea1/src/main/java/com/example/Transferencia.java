package main.java.com.example;

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia() {

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
