package com.mycompany.larning.java.projectpratico.services;

import java.util.List;

public interface Service {

    List<Object> adicionarObjeto(Object objeto);
    <T> List<T> listarTodosOsObjetos();
    Object buscarObjeto(int id);
    void alterarObjeto(int id, Object objeto);
    void excluirObjeto(int id);
    double calculaFolha();

}
