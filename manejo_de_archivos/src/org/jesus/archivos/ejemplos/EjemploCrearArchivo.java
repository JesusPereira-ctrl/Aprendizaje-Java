package org.jesus.archivos.ejemplos;

import org.jesus.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "/home/jesus/Documentos/Aprendizaje-Java/archivo/java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}
