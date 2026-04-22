package org.jesus.poointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
                        PaginableRepositorio<T>, CrudRespositorio<T>, ContableRepositorio {
}
