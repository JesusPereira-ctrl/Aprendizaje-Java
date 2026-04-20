package org.jesus.app.hogar;

import org.jesus.app.jardin.Perro;

import static org.jesus.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
