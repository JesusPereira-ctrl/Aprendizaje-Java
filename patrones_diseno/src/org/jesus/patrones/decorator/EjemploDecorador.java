package org.jesus.patrones.decorator;

import org.jesus.patrones.decorator.decorador.MayusculaDecorador;
import org.jesus.patrones.decorator.decorador.RemplazarEspaciosDecorador;
import org.jesus.patrones.decorator.decorador.ReversaDecorador;
import org.jesus.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andrés!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
