package com.mycompany.larning.java.projectpratico.factory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.larning.java.projectpratico.model.Cursos;

import java.io.File;
import java.util.List;

public class ConstrutorCursos implements Construtores {
    private File file;

    @Override
    public <T> List<T> construir() {
        try {
            file = new File("src/main/java/com/mycompany/larning/java/projectpratico/data/cursos.json");
            ObjectMapper objectMapper = new ObjectMapper();
            return (List<T>) objectMapper.readValue(file, new TypeReference<List<Cursos>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
