package org.jesus.patrones.factory.producto;

import org.jesus.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana() {
        super();
        this.nombre = "Pizza Italiana New York";
        this.masa = "Masa gruesa";
        this.salsa = "Salsa de tomate italiano carne";
        this.ingredientes.add("Queso Mozzarella");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Jamon");
        this.ingredientes.add("Choricillo");
        this.ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos grandes");
    }
}
