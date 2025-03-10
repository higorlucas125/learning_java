package com.mycompany.larning.java.siscapacitV2.controller;

import com.mycompany.larning.java.siscapacitV2.model.Cursos;

public interface APICurso {

    void adicionarCurso();
    void listarCurso();
    void listarCurso(int idCusro);
    void alterarCurso(Cursos Curso);
    void excluirCurso(int idCusro);
    void adicionarServidorCurso(int idCusro, int matricula);
    void excluirServidorCurso(int idCusro, int matricula);
    void listarServidorCurso(int idCusro);
}
