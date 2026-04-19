package tareas;

public class Tarea2 {
    public static void main(String[] args) {
        int[] a = {14, 33, 15, 36, 78, 21, 43};

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            max = max > a[i] ? max : a[i];
        }

        System.out.println("max = " + max);
    }
}
