package tareas;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA_CHILE = 0.19;

        System.out.println("Ingrese el nombre o description de la factura:");

        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto 1:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del producto 2:");
        double precio2 = scanner.nextDouble();

        double total = precio1 + precio2;
        double impuesto = total * IVA_CHILE;
        double totalConImpuesto = total + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de "
                + total + " , con un impuesto de " + impuesto + " y el monto después de impuesto es de "
                + totalConImpuesto);

        scanner.close();
    }
}
