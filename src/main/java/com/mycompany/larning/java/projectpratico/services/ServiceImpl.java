package com.mycompany.larning.java.projectpratico.services;

import com.mycompany.larning.java.projectpratico.annotations.EntityId;
import com.mycompany.larning.java.projectpratico.annotations.Sum;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {

    private List<Object> objetos;

    private List<Method> getAnnotatedMethods(Class<?> clazz, Class<?> annotation) {
        return Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent((Class<? extends Annotation>) annotation))
                .collect(Collectors.toList());
    }

    public <T> ServiceImpl (List<T> objetos) {
        this.objetos = (List<Object>) objetos;
    }

    @Override
    public List<Object> adicionarObjeto(Object objeto) {
        this.objetos.add(objeto);
        return this.objetos;
    }

    @Override
    public <T> List<T> listarTodosOsObjetos() {
        return (List<T>) this.objetos;
    }

    @Override
    public Object buscarObjeto(int id) {
        return this.objetos.stream()
                .flatMap(obj -> getAnnotatedMethods(obj.getClass(),EntityId.class).stream()
                        .map(method -> new AbstractMap.SimpleEntry<>(obj, method)))
                .filter(entry -> {
                    try {
                        return entry.getValue().invoke(entry.getKey()).equals(id);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                })
                .map(AbstractMap.SimpleEntry::getKey) // Retornamos o objeto original
                .findFirst()
                .orElse("Objeto não encontrado");
    }

    @Override
    public void alterarObjeto(int id, Object objeto) {
        Object alterarObjeto = this.buscarObjeto(id);
        if(alterarObjeto != null){
            this.objetos.remove(alterarObjeto);
            this.objetos.add(objeto);
        }
    }

    @Override
    public void excluirObjeto(int id) {
        Object excluirObjeto = this.buscarObjeto(id);
        if(excluirObjeto != null){
            this.objetos.remove(excluirObjeto);
        }
    }

    @Override
    public double calculaFolha() {
      return this.objetos.stream()
              .flatMap(obj -> getAnnotatedMethods(obj.getClass(), Sum.class)
                      .stream()
                      .map(method -> new AbstractMap.SimpleEntry<>(obj,method)))
              .mapToDouble(entry -> {
                  try {
                      return (double) entry.getValue().invoke(entry.getKey()); // Invoca o método e obtém o valor
                  } catch (Exception e) {
                      e.printStackTrace();
                      return 0;
                  }
              }).sum();
    }
}
