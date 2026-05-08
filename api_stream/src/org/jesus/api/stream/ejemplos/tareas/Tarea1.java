package org.jesus.api.stream.ejemplos.tareas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Tarea1 {
    public static void main(String[] args) {
        AtomicInteger generador = new AtomicInteger(1);
        Double resultado = Stream.generate(generador::getAndIncrement).limit(100)
                .filter(n -> n % 10 != 0)
                .map(n -> Double.valueOf(n) / 2)
                .reduce(0.0, Double::sum);

        System.out.println("Resultado: " + resultado);
    }
}
