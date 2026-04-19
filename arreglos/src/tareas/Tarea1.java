package tareas;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
            a[i] = i + 1;
        }
        System.out.println();

        for (int i = 0; i < a.length / 2; i++) {
            int primero = a[i];
            int ultimo = a[a.length - 1 - i];

            if (i == a.length / 2 - 1) {
                System.out.print(ultimo + ", ");
                System.out.print(primero);
                break;
            }

            System.out.print(ultimo + ", ");
            System.out.print(primero + ", ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.println("Para el indice " + i + " valor: " + a[i]);
        }
    }
}
