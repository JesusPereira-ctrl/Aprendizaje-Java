package tareas;

import java.util.Scanner;

public class MatrizFormaSilla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz:");

        int tamaño = s.nextInt();

        if (tamaño <= 0) {
            System.err.println("Debe ingresar un numero mayor a 0");
            System.exit(-1);
        }

        int[][] matriz = new int[tamaño][tamaño];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || i == ((matriz.length - 1) / 2)) {
                    matriz[i][j] = 1;
                } else if (j == matriz.length - 1 && i > (matriz.length - 1) / 2) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
