package tareas;

public class Tarea5 {
    public static void main(String[] args) {
        int[] arreglo = {4, 3, 4, 6, 6, 1, 4, 5, 4, 1, 1};
        int[] contador = new int[arreglo.length];

        for (int i = 0; i < contador.length; i++) {
            contador[arreglo[i]]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < contador[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
