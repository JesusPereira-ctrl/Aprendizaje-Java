package org.jesus.poointerfaces.imprenta;

import org.jesus.poointerfaces.imprenta.modelo.*;
import static org.jesus.poointerfaces.imprenta.modelo.Genero.*;
import static org.jesus.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"),
                "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
            .addExperiencia("Oracle DBA")
            .addExperiencia("Spring Framework")
            .addExperiencia("Desarrollador fullstack")
            .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Patrones de diseños: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });

        System.out.println(TEXTO_DEFECTO);
    }
}
