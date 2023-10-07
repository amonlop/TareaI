package com.example;

import java.util.Date;

class Factura extends DocTributario {

    public Factura(String numero, String rut, Date fecha, Direccion direccion) {
        super(numero, rut, fecha, direccion);
    }
    
}
