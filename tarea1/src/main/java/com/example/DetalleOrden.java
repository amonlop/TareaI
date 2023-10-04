package com.example;

class DetalleOrden {
    private int cantidad;

    public DetalleOrden() {

    }

    //con IVA
    public float calcPrecio() {
        return 1f; //no es este resultado, es solo pa q no marque error
    }

    public float calcPrecioSinIVA() {
        return 1f;
    }

    public float calcIVA() {
        return 1f;
    }

    public float calcPeso() {
        return 1f;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
