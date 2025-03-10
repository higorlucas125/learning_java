package com.mycompany.larning.java.siscapacitV2.dao;

import com.mycompany.larning.java.siscapacitV2.model.ServidorPublico;

public class Comissionado extends ServidorPublico {

    private double comissao;
    private double salarioFixo;

    public Comissionado(double comissao, double salarioFixo, int matricula, String nome){
        super(matricula, nome);
        this.comissao = comissao;
        this.salarioFixo = salarioFixo;
        super.setSalario(this.comissao + this.salarioFixo);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
