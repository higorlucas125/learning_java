package com.mycompany.larning.java.siscapacitV2.dao;

import com.mycompany.larning.java.siscapacitV2.model.ServidorPublico;

public class Temporario extends ServidorPublico {

    private static final int VALOR_HORA_EXTRA = 30;
    private String contrato;
    private double salario;

    public Temporario(String contrato, double salario, int matricula, String nome){
        super(matricula, nome);
        this.contrato = contrato;
        this.salario = salario;
    }

    public String getContrato() {
        return contrato;
    }

  public final double calcularSalarioHorasExtra(int horasTrabalhadas){
        double salarrioMensal = 0;

        salarrioMensal = salarrioMensal +  horasTrabalhadas*VALOR_HORA_EXTRA;

        return (this.salario + salarrioMensal);
  }
}
