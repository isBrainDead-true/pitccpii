package com.cupcake.store.storemanager.model;

import java.util.Date;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(Long id, String matricula, Endereco endereco) {
        super(id, matricula, endereco);
    }

    public Gerente(Long id, String nome, String telefone, String email, Date dataDeNascimento, String rg, String cpf, String matricula, Endereco endereco) {
        super(id, nome, telefone, email, dataDeNascimento, rg, cpf, matricula, endereco);
    }
}
