package com.mycompany.larning.java.siscapacitV2.model;

public class Telefone {
    private String tipoTelefone;
    private String numero;

    public Telefone(String tipoTelefone, String numero) {
        this.tipoTelefone = tipoTelefone;
        this.numero = numero;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tipoTelefone='" + tipoTelefone + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
