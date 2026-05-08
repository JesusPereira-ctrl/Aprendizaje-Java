package org.jesus.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable {
    private List<String> repositorio = new ArrayList<>();

    public void crearUsuario(String usuario) {
        this.repositorio.add(usuario);
        this.notifyObservers(usuario);
    }
}
