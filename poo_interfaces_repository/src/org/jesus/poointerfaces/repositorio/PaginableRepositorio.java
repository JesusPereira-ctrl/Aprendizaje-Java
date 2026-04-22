package org.jesus.poointerfaces.repositorio;

import org.jesus.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
