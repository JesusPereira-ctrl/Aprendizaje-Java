package org.jesus.java8.lambda.tareas.tarea2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class TareaMasRepetido {
    public static void main(String[] args) {

        Function<String, HashMap<String, Integer>> contarMasRepetidas = frase -> {
            List<String> palabras = Arrays.asList(frase.split(" "));
            HashMap<String, Integer> contador = new HashMap<>();

            for (String palabra : palabras) {
                if (contador.containsKey(palabra)) {
                    Integer valorActual = contador.get(palabra);
                    contador.replace(palabra, ++valorActual);
                } else {
                    contador.put(palabra, 1);
                }
            }

            return contador;
        };

        HashMap<String, Integer> contarRepetidas = contarMasRepetidas.apply("hola que que que que tal que tal nombre es pepe hola mi nombre es juan quien eres tu hola");

        String llaveMasRepetida = "";

        for (String key : contarRepetidas.keySet()) {
            llaveMasRepetida = contarRepetidas.get(key) > contarRepetidas.getOrDefault(llaveMasRepetida, 0) ? key : llaveMasRepetida;
        }

        for (String key : contarRepetidas.keySet()) {
            if (key.equals(llaveMasRepetida)) {
                System.out.println("Palabra mas repetida: " + key + " => " + contarRepetidas.get(key));
                break;
            }
        }
    }
}
