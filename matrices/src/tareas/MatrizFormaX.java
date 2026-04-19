package tareas;

import java.util.Scanner;

public class MatrizFormaX {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz:");
        int tamaño = s.nextInt();

        if (tamaño <= 0) {
            System.err.println("Debe ingresar un numero mayor a 0");
            System.exit(-1);
        }

        String[][] matriz = new String[tamaño][tamaño];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || (i == matriz.length - 1 - i || j == matriz.length - 1 - i)) {
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
