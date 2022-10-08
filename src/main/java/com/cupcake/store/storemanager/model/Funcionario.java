package com.cupcake.store.storemanager.model;

import java.util.Date;

public class Funcionario extends Pessoa {

    private Long id;
    private String matricula;

    private Endereco endereco;

    public Funcionario(){

    }

    public Funcionario(Long id, String matricula, Endereco endereco) {
        this.id = id;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public Funcionario(Long id, String nome, String telefone, String email, Date dataDeNascimento, String rg, String cpf, String matricula, Endereco endereco) {
        super(nome, telefone, email, dataDeNascimento, rg, cpf);
        this.id = id;
        this.matricula = matricula;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
