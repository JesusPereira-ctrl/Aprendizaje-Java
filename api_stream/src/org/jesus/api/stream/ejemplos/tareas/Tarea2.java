package org.jesus.api.stream.ejemplos.tareas;

import java.util.ArrayList;
import java.util.List;

public class Tarea2 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(23);
        numeros.add(5234);
        numeros.add(45);
        numeros.add(64);
        numeros.add(42);

        Integer maximo = numeros.stream()
                .reduce(0, Integer::max);

        System.out.println("Numero Maximo: " + maximo);
    }
}
