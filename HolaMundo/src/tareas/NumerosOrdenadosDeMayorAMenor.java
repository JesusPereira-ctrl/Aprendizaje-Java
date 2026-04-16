package tareas;

import java.util.Scanner;

public class NumerosOrdenadosDeMayorAMenor {
    public static void main(String[] args) {
        int mayor;
        int menor;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = s.nextInt();

        System.out.println("Ingrese el primer numero");
        int num2 = s.nextInt();

        mayor = num1 > num2 ? num1 : num2;
        menor = num1 < num2 ? num1 : num2;

        System.out.println("Ordenados de mayor a menor = " + mayor + " " + menor);
    }
}
