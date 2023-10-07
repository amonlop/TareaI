package com.example;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //doctributario
        // Crear 5 productos diferentes
        Articulo producto1 = new Articulo(1.0f, "Producto 1", "Descripción 1", 10.0f);
        Articulo producto2 = new Articulo(0.5f, "Producto 2", "Descripción 2", 15.0f);
        Articulo producto3 = new Articulo(2.0f, "Producto 3", "Descripción 3", 20.0f);
        Articulo producto4 = new Articulo(0.3f, "Producto 4", "Descripción 4", 8.0f);
        Articulo producto5 = new Articulo(1.5f, "Producto 5", "Descripción 5", 12.0f);

        Direccion d1 = new Direccion("Los angeles 2022");
        Direccion d2 = new Direccion("Calle melipas 3221");
        Direccion d3 = new Direccion("Calle sin nombre 455");
        Direccion d4 = new Direccion("Calle los héroes 42355");

 
        // Crear 2 compradores
        Cliente comprador1 = new Cliente("11111111-1", "Comprador 1", d1);
        Cliente comprador2 = new Cliente("22222222-2", "Comprador 2",d2);

        DocTributario doc1 = new Factura("222333", "11111113-1", new Date(), d3);
        DocTributario doc2 = new Factura("11122", "12123213-1", new Date(), d4);
        DocTributario doc3 = new Factura("123232", "7777778-1", new Date(), d4);

        // Crear 3 órdenes de venta
        ArrayList<DetalleOrden> detallesOrden1 = new ArrayList<>();
        detallesOrden1.add(new DetalleOrden(producto1, 2));
        detallesOrden1.add(new DetalleOrden(producto2, 3));
        OrdenCompra orden1 = new OrdenCompra(new Date(), "Pendiente", detallesOrden1, doc1);

        ArrayList<DetalleOrden> detallesOrden2 = new ArrayList<>();
        detallesOrden2.add(new DetalleOrden(producto3, 1));
        detallesOrden2.add(new DetalleOrden(producto4, 4));
        OrdenCompra orden2 = new OrdenCompra(new Date(), "En proceso", detallesOrden2, doc2);

        ArrayList<DetalleOrden> detallesOrden3 = new ArrayList<>();
        detallesOrden3.add(new DetalleOrden(producto5, 5));
        OrdenCompra orden3 = new OrdenCompra(new Date(), "Entregada", detallesOrden3, doc3);

        // Asociar órdenes de compra a compradores
        comprador1.getOrdenesCompra().add(orden1);
        comprador1.getOrdenesCompra().add(orden2);
        comprador2.getOrdenesCompra().add(orden3);

        // Crear 4 pagos
        Pago pago1 = new Efectivo(50.0f, new Date());
        Pago pago2 = new Tarjeta(30.0f, new Date());
        Pago pago3 = new Transferencia(25.0f, new Date());
        Pago pago4 = new Efectivo(15.0f, new Date());

        // Asociar pagos a órdenes de compra
        orden1.getPagos().add(pago1);
        orden2.getPagos().add(pago2);
        orden2.getPagos().add(pago3);
        orden3.getPagos().add(pago4);

        // Imprimir información de productos
        System.out.println("Información de productos:");
        System.out.println(producto1.tostring());
        System.out.println(producto2.tostring());
        System.out.println(producto3.tostring());
        System.out.println(producto4.tostring());
        System.out.println(producto5.tostring());

        // Imprimir información de compradores y sus órdenes de compra
        System.out.println("\nInformación de compradores:");
        System.out.println("Comprador 1: " + comprador1.getNombre());
        for (OrdenCompra orden : comprador1.getOrdenesCompra()) {
            System.out.println(" - Orden de compra: " + orden.getFecha() + ", Estado: " + orden.getEstado());
        }

        System.out.println("Comprador 2: " + comprador2.getNombre());
        for (OrdenCompra orden : comprador2.getOrdenesCompra()) {
            System.out.println(" - Orden de compra: " + orden.getFecha() + ", Estado: " + orden.getEstado());
        }

        // Imprimir información de pagos y sus tipos
        System.out.println("\nInformación de pagos:");
        System.out.println("Pago 1 - Tipo: " + pago1.getClass().getSimpleName() + ", Monto: " + pago1.getMonto());
        System.out.println("Pago 2 - Tipo: " + pago2.getClass().getSimpleName() + ", Monto: " + pago2.getMonto());
        System.out.println("Pago 3 - Tipo: " + pago3.getClass().getSimpleName() + ", Monto: " + pago3.getMonto());
        System.out.println("Pago 4 - Tipo: " + pago4.getClass().getSimpleName() + ", Monto: " + pago4.getMonto());
    }
}
