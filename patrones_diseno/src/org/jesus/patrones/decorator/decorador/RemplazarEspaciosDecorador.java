package org.jesus.patrones.decorator.decorador;

import org.jesus.patrones.decorator.Formateable;

public class RemplazarEspaciosDecorador extends TextoDecorador {
    public RemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.texto.darFormato().replace(" ", "_");
    }
}
