package org.jesus.patrones.decorator.decorador;

import org.jesus.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {
    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.texto.darFormato().toUpperCase();
    }
}
