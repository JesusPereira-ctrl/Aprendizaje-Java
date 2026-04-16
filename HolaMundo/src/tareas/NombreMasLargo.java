package tareas;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombreMasLargo;

        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primera persona");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercera persona");

        nombreMasLargo = nombreCompleto1;

        nombreMasLargo = nombreMasLargo.split(" ")[0].length() > nombreCompleto2.split(" ")[0].length()
                ? nombreMasLargo
                : nombreCompleto2;

        nombreMasLargo = nombreMasLargo.split(" ")[0].length() > nombreCompleto3.split(" ")[0].length()
                ? nombreMasLargo
                : nombreCompleto3;

        String mensaje = nombreMasLargo + " tiene el nombre mas largo.";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
