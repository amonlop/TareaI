package com.example;
class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(Articulo articulo, int cantidad) {
        this.cantidad=cantidad;
        this.articulo=articulo;
    }
    public String tostring(){
        return "Artículo: "+this.articulo.getNombre() +", cantidad: "+this.cantidad;
    }
    public float calcPrecio() {
        return (articulo.getPrecio()*1.19f*cantidad);
    }

    public float calcPrecioSinIVA() {
        return articulo.getPrecio()*cantidad;
    }

    public float calcIVA() {
        return articulo.getPrecio()*0.19f*cantidad;
    }

    public float calcPeso() {
        return articulo.getPeso()*cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
