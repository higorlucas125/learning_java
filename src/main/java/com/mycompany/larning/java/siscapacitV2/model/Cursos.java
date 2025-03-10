package com.mycompany.larning.java.siscapacitV2.model;


import com.mycompany.larning.java.projetopratico_v2.reuso.ServidorPublico;

import java.util.LinkedList;
import java.util.List;

public class Cursos {

    private int idcurso;
    private String nome;
    private String foto;
    private String formarealizacao;
    private String ofertante;
    private int vagas;
    private double valor;
    private String site;
    private String situacao;

    private List<ServidorPublico> servidorPublicos = new LinkedList<>();

    public Cursos() {
    }

    public Cursos(int idcurso, String nome, String foto, String formarealizacao, String ofertante, int vagas, double valor, String site, String situacao) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.foto = foto;
        this.formarealizacao = formarealizacao;
        this.ofertante = ofertante;
        this.vagas = vagas;
        this.valor = valor;
        this.site = site;
        this.situacao = situacao;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFormarealizacao() {
        return formarealizacao;
    }

    public void setFormarealizacao(String formarealizacao) {
        this.formarealizacao = formarealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "idcurso=" + idcurso +
                ", nome='" + nome + '\'' +
                ", foto='" + foto + '\'' +
                ", formarealizacao='" + formarealizacao + '\'' +
                ", ofertante='" + ofertante + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                ", site='" + site + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
