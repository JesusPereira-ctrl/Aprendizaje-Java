package org.jesus.patrones.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar() {
        System.out.println("Preparando " + this.nombre);
        System.out.println("seleccionando la masa " + this.masa);
        System.out.println("Agregando la salsa " + this.salsa);
        System.out.println("Agregando ingredientes:");
        this.ingredientes.forEach(System.out::println);
    }

    public abstract void cocinar();

    public abstract void cortar();

    public void empaquetar() {
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
