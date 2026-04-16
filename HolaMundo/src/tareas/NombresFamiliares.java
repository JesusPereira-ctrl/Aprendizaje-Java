package tareas;

import java.util.Scanner;

public class NombresFamiliares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        System.out.println("Ingrese el de 3 integrantes de la familia separado por espacios");

        String[] integrantes = scanner.nextLine().split(" ");

        for (int i = 0; i < integrantes.length; i++) {
            String segundaLetraCapitalizada = integrantes[i].substring(1, 2).toUpperCase();
            String ultimasDosLetras = integrantes[i].substring(integrantes[i].length() - 2);
            integrantes[i] = segundaLetraCapitalizada + "." + ultimasDosLetras;

            if (i == integrantes.length - 1) {
                resultado.append(integrantes[i]);
                continue;
            }

            resultado.append(integrantes[i]).append("_");
        }

        System.out.println("resultado = " + resultado);
    }
}
