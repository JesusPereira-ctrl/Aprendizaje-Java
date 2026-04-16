package tareas;

import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de notas a evaluar");
        int totalNotasGeneral = s.nextInt();
        int totalNotasMayores5 = 0;
        int totalNotasInferiores4 = 0;
        int totalNotas1 = 0;

        double mayores5 = 0;
        double inferiores4 = 0;
        double notas1 = 0;
        double notas = 0;

        System.out.println("Ingrese el valor de las notas (1.0 - 7.0)");

        for (int i = 0; i < totalNotasGeneral; i++) {
            double nota = s.nextDouble();

            if (nota <= 0.9) {
                System.out.println("Error, finalizando el programa");
                System.exit(0);
            }

            if (nota > 5) {
                mayores5 += nota;
                totalNotasMayores5++;
            } else if (nota < 4 && nota > 1.9) {
                inferiores4 += nota;
                totalNotasInferiores4++;
            } else if (nota >= 1 && nota <= 1.9) {
                notas1 += nota;
                totalNotas1++;
            }
            notas += nota;
        }

        double promedioMayores5 = totalNotasMayores5 == 0 ? 0 : mayores5 / totalNotasMayores5;
        double promedioInferiores4 = totalNotasInferiores4 == 0 ? 0 : inferiores4 / totalNotasInferiores4;
        double promedioNotas1 = totalNotas1 == 0 ? 0 : notas1 / totalNotas1;

        double promedioTotal = notas / totalNotasGeneral;

        System.out.println("Promedio de notas mayores a 5 = " + promedioMayores5);
        System.out.println("Promedio de notas inferiores a 4 = " + promedioInferiores4);
        System.out.println("Promedio de notas 1 = " + promedioNotas1);

        System.out.println("El promedio total de todas las notas es = " + promedioTotal);
    }
}
