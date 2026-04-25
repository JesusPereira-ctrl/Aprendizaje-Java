package org.jesus.java8.lambda.tareas.tarea1.format.string;

public class FormatString {

    public String formatearString(String valor, Cleareable expresion) {
        return expresion.eliminarEspaciosComasPuntos(valor);
    }
}
