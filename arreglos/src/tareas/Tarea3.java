package tareas;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[7];
        int total = a.length;

        for (int i = 0; i < total; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }

        int promedioTotal = 0,
                promedioPositivos = 0,
                promedioNegativos = 0,
                totalCeros = 0,
                totalNegativos = 0,
                totalPositivos = 0;

        for (int i = 0; i < total; i++) {
            if (a[i] == 0) {
                totalCeros += 1;
            } else if (a[i] > 0) {
                promedioPositivos += a[i];
                totalPositivos += 1;
            } else if (a[i] < 0) {
                promedioNegativos += a[i];
                totalNegativos += 1;
            }

            promedioTotal += a[i];
        }

        promedioTotal /= total;
        promedioPositivos = totalPositivos == 0 ? 0 : promedioPositivos / totalPositivos;
        promedioNegativos = totalNegativos == 0 ? 0 : promedioNegativos / totalNegativos;

        System.out.println("promedioTotal = " + promedioTotal);
        System.out.println("promedioPositivos = " + promedioPositivos);
        System.out.println("promedioNegativos = " + promedioNegativos);
        System.out.println("totalCeros = " + totalCeros);
    }
}
