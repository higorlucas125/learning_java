package com.mycompany.larning.java.projectpratico.model;

import com.mycompany.larning.java.projectpratico.annotations.EntityId;
import com.mycompany.larning.java.projectpratico.annotations.Sum;

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
    private List<String> cursos;
    private String acoes; // Supondo que as ações sejam uma lista de strings, como um exemplo

    // Construtor

    public ServidorPublico() {
    }

    public ServidorPublico(int matricula, String foto, String nome, String cargo, String orgao, String lotacao, String email, double salario, List<String> cursos, String acoes) {
        this.matricula = matricula;
        this.foto = foto;
        this.nome = nome;
        this.cargo = cargo;
        this.orgao = orgao;
        this.lotacao = lotacao;
        this.email = email;
        this.salario = salario;
        this.cursos = cursos;
        this.acoes = acoes;
    }

    // Getters e Setters
    @EntityId
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

    @Sum
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    public String getAcoes() {
        return acoes;
    }

    public void setAcoes(String acoes) {
        this.acoes = acoes;
    }

    // Método toString para visualização
    @Override
    public String toString() {
        return "ServidorPublico{" +
                "matricula=" + matricula +
                ", foto='" + foto + '\'' +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", orgao='" + orgao + '\'' +
                ", lotacao='" + lotacao + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", cursos=" + cursos +
                ", acoes=" + acoes +
                '}';
    }
}

