package org.jesus.poointerfaces.repositorio;

import org.jesus.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRespositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
