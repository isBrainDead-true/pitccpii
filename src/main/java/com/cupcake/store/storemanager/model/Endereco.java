package com.cupcake.store.storemanager.model;

public class Endereco {
    private String rua;
    private String numeroDaCasa;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(){

    }

    public Endereco(String rua, String numeroDaCasa, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numeroDaCasa = numeroDaCasa;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(String numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
