package com.example;

import java.util.ArrayList;

class Direccion {
    private String Direccion;
    
    public Direccion (String A){
        Direccion=A;
    }
    public String getDIR() {
        return Direccion;
    }
    public void setDIR (String A) {
        this.Direccion=A;
    }
    public String toString () {
        return "Dirección: " +this.Direccion;
    }

}
