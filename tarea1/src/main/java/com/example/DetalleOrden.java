package com.example;
class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(Articulo articulo, int cantidad) {
        this.cantidad=cantidad;
        this.articulo=articulo;
    }
    public String tostring(){
        return "articulo: "+this.articulo.getNombre() +", cantidad: "+this.cantidad;
    }
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
