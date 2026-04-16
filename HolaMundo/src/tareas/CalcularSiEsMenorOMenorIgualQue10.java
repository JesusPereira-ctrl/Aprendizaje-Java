package tareas;

import java.util.Scanner;

public class CalcularSiEsMenorOMenorIgualQue10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar");

        int cantidad = s.nextInt();

        int[] numeros = new int[cantidad];

        System.out.println("Ingrese " + cantidad + " números");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }

        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            menor = menor < numeros[i] ? menor : numeros[i];
        }

        System.out.println("El numero menor es = " + menor);

        if (menor < 10) {
            System.out.println("El numero menor es menor que 10");
        } else {
            System.out.println("El numero menor es igual o mayor que 10");
        }
    }
}
