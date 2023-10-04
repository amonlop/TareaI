package com.example;

import java.util.ArrayList;
import java.util.Date;

class OrdenCompra {
    private ArrayList<DetalleOrden> detalleOrdenes;
    private ArrayList<Pago> pagos;
    private DocTributario docTributario;
    private Cliente cliente;
    private Date fecha;
    private String estado;

    public OrdenCompra(Date fecha, String estado, ArrayList<DetalleOrden> detalleOrdenes) {
        this.fecha = fecha;
        this.estado = estado;
        this.detalleOrdenes=detalleOrdenes;
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
        public float calcPrecioSinIVA(){
        float aux=0;
        for (int i = 0; i < detalleOrdenes.size(); i++) {
            aux=aux+this.detalleOrdenes.get(i).calcPrecioSinIVA();
        }
        return aux;
    }
    public float calcIVA(){
        float aux=0;
        for (int i = 0; i < detalleOrdenes.size(); i++) {
            aux=aux+this.detalleOrdenes.get(i).calcIVA();
        }
        return aux;
    }
    public float calcPrecio(){
        float aux=0;
        for (int i = 0; i < detalleOrdenes.size(); i++) {
            aux=aux+this.detalleOrdenes.get(i).calcPrecio();
        }
        return aux;
    }
    public float calcPeso(){
        float aux=0;
        for (int i = 0; i < detalleOrdenes.size(); i++) {
            aux=aux+this.detalleOrdenes.get(i).calcPeso();
        }
        return aux;
    }
}
