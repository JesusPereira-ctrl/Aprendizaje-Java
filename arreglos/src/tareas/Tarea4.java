package tareas;

public class Tarea4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5, 5, 6, 7};
        int[] contador = new int[a.length];

        int concurrencia = 0;
        int concurrencia2 = 0;

        for (int i = 0; i < contador.length; i++) {
            contador[a[i]]++;
        }

        int maximaConcurrencia = 0;
        int masRepetido = 0;

        for (int i = 0; i < a.length; i++) {
            if (contador[i] > maximaConcurrencia) {
                maximaConcurrencia = contador[i];
                masRepetido = i;
            }
        }

        System.out.println("masRepetido = " + masRepetido);
        System.out.println("maximaConcurrencia = " + maximaConcurrencia);
    }
}
