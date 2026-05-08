package org.jesus.patrones.decorator.decorador;

import org.jesus.patrones.decorator.Formateable;

public abstract class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
