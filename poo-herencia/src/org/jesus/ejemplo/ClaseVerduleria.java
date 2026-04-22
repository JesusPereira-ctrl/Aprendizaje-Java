package org.jesus.ejemplo;

import org.jesus.tarea.verduleria.*;

public class ClaseVerduleria {
    static void main(String[] args) {
        Producto[] productos = {
                new Lacteo("Leche", 2000.0, 2, 100),
                new Lacteo("Yoghurt", 500.0, 10, 100),
                new Fruta("Manzana", 50.0, 100.0, "Verde"),
                new Fruta("Manzana", 100.0, 100.0, "Roja"),
                new Limpieza("Mr. Músculo", 200.0, "Cloro"),
                new Limpieza("Quiz", 150.0, "Lavalozas"),
                new NoPerecible("Cereales", 200.0, 2, 200),
                new NoPerecible("Chandelle", 150.0, 2, 150),
        };

        for (Producto producto : productos) {
            System.out.println("==========================================");
            System.out.println(producto);
        }
    }
}
