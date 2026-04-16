package tareas;

import java.util.Scanner;

public class SistemaEstanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de gasolina en litros actual");

        int litrosActuales = s.nextInt();

        String mensaje = litrosActuales == 70
                ? "Estanque lleno"
                : litrosActuales >= 60 && litrosActuales < 70
                  ? "Estanque casi lleno"
                  : litrosActuales >= 40 && litrosActuales < 60
                    ? "Estanque 3/4"
                    : litrosActuales >= 35 && litrosActuales < 40
                      ? "Medio Estanque"
                      : litrosActuales >= 20 && litrosActuales < 35
                        ? "Suficiente" : "Insuficiente";

        System.out.println(mensaje);
    }
}
