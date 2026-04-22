package org.jesus.ejemplo;

import org.jesus.tarea.empresa.Gerente;

public class ClaseEmpresa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jesus", "Pereira", "123456789-0", "calle 123", 200.0, 1, 300.0);

        gerente.aumentarRemuneracion(19);

        System.out.println(gerente);
    }
}
