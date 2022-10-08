package com.cupcake.store.storemanager.model;

import java.util.Date;

public class Confeiteiro extends Funcionario{

    public Confeiteiro() {

    }

    public Confeiteiro(Long id, String matricula, Endereco endereco) {
        super(id, matricula, endereco);
    }

    public Confeiteiro(Long id, String nome, String telefone, String email, Date dataDeNascimento, String rg, String cpf, String matricula, Endereco endereco) {
        super(id, nome, telefone, email, dataDeNascimento, rg, cpf, matricula, endereco);
    }
}

