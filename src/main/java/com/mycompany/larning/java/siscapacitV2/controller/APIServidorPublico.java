package com.mycompany.larning.java.siscapacitV2.controller;

import com.mycompany.larning.java.siscapacitV2.model.ServidorPublico;

public interface APIServidorPublico {

     void adicionarServidorPublico();
      void listarServidoresPublicos();
      void listarServidorPublico(int matricula);
      void alterarServidorPublico(ServidorPublico servidorPublico);
      void excluirServidorPublico(int matricula);
      void calcularFolhaServidoresPublicos();
      void adicionarCursoServidorPublico(int matricula, int idcurso);
      void excluirCursoServidorPublico(int matricula, int idcurso);
      void listarCursosServidorPublico(int matricula);

}
