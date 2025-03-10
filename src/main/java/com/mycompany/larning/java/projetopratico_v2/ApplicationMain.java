package com.mycompany.larning.java.projetopratico_v2;

import com.mycompany.larning.java.projetopratico_v2.reuso.Cursos;
import com.mycompany.larning.java.projetopratico_v2.reuso.Dependente;
import com.mycompany.larning.java.projetopratico_v2.reuso.ServidorPublico;
import com.mycompany.larning.java.projetopratico_v2.reuso.Telefone;

public class ApplicationMain {

    public static void main(String[] args) {
        ServidorPublico servidorPublico = new ServidorPublico(1, "foto", "nome", "cargo", "orgao", "lotacao", "email", 1000.0, "acoes");
        Cursos cursos = new Cursos(2, "nome", "foto", "formarealizacao", "ofertante", 10, 100.0, "site", "situacao");
        Dependente dependente = new Dependente("nome", "cpf", "genero", 10);
        Telefone telefone = new Telefone("tipoTelefone", "numero");
        servidorPublico.setCursos(cursos);
        servidorPublico.setDependentes(dependente);
        servidorPublico.setTelefones(telefone);

//        System.out.println(servidorPublico.getCursos());
    }
}
