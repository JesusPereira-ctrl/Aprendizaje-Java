package org.jesus.java8.lambda.tareas.tarea1;

import org.jesus.java8.lambda.tareas.tarea1.format.string.Cleareable;
import org.jesus.java8.lambda.tareas.tarea1.format.string.FormatString;

public class ExpresionLambdaQueElimineEspaciosComasPuntos {
    public static void main(String[] args) {

        FormatString formatString = new FormatString();

        Cleareable eliminarEspaciosComasPuntos = valor -> {
            String[] stringArr = valor.split("");
            String resultado = "";

            for (String caracter : stringArr) {
                if (caracter.equals(" ") || caracter.equals(",") || caracter.equals(".")) {
                    continue;
                }
                resultado = resultado.concat(caracter);
            }

            return resultado.toUpperCase();
        };

        System.out.println(formatString.formatearString(" Hola. Mundo, como, estas,", eliminarEspaciosComasPuntos));
    }
}
