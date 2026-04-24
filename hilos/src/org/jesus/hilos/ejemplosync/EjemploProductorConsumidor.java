package org.jesus.hilos.ejemplosync;

import org.jesus.hilos.ejemplosync.runnable.Consumidor;
import org.jesus.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main() {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
