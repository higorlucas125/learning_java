package com.mycompany.larning.java.siscapacitV2.model;

import java.util.LinkedList;
import java.util.List;

public class ServidorPublico {

    private int matricula;
    private String foto;
    private String nome;
    private String cargo;
    private String orgao;
    private String lotacao;
    private String email;
    private double salario;
    private String acoes; // Supondo que as ações sejam uma lista de strings, como um exemplo


    //Reuso - Associação
    private List<Cursos> cursos;

    //Reuso - Agregação
    private List<Dependente> dependentes;

    //Reuso - Composição
    private List<Telefone> telefones;


    // Construtor


    public ServidorPublico() {
    }

    public ServidorPublico(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public ServidorPublico(int matricula, String foto, String nome, String cargo, String orgao, String lotacao, String email, double salario, String acoes) {
        this.matricula = matricula;
        this.foto = foto;
        this.nome = nome;
        this.cargo = cargo;
        this.orgao = orgao;
        this.lotacao = lotacao;
        this.email = email;
        this.salario = salario;
        this.acoes = acoes;
        this.cursos = new LinkedList<>();
        this.dependentes = new LinkedList<>();
        this.telefones = new LinkedList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAcoes() {
        return acoes;
    }

    public void setAcoes(String acoes) {
        this.acoes = acoes;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(Cursos curso) {
        this.cursos.add(curso);
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(Dependente dependente) {
        this.dependentes.add(dependente);
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone telefone) {
        this.telefones.add(telefone);
    }
}

