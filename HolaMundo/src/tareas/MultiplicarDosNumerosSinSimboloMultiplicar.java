package tareas;

public class MultiplicarDosNumerosSinSimboloMultiplicar {
    public static void main(String[] args) {
        int num1 = 46;
        int num2 = 7;
        int resultado = 0;

        int i = 0;

        while (i < num2) {
            resultado += num1;
            i++;
        }
        System.out.println(num1 + " * " + num2 + " = " + resultado);
    }
}
