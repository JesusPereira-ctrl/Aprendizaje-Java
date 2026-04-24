package org.jesus.hilos.tarea;

import java.util.concurrent.TimeUnit;

public class AlfanumericoTarea implements Runnable {
    private final Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
            switch (this.tipo) {
                case NUMERO -> {
                    for (int i = 1; i < 10; i++) {
                        System.out.println(i);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
                case LETRA -> {
                    for (char i = 'A'; i <= 'Z'; i++) {
                        System.out.println(i);
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
            }
        } catch (InterruptedException ex) {
        }
    }
}
