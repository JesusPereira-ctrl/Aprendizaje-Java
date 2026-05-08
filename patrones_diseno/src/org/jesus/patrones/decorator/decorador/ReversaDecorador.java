package org.jesus.patrones.decorator.decorador;

import org.jesus.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador {
    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(this.texto.darFormato());
        return sb.reverse().toString();
    }
}
