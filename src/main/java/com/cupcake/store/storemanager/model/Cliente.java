package com.cupcake.store.storemanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cliente extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCliente;

    public Cliente(Long id, String numeroCliente) {
        this.id = id;
        this.numeroCliente = numeroCliente;
    }

    public Cliente(){

    }

    public Cliente(String nome, String telefone, String email, Date dataDeNascimento, String rg, String cpf, Long id, String numeroCliente) {
        super(nome, telefone, email, dataDeNascimento, rg, cpf);
        this.id = id;
        this.numeroCliente = numeroCliente;
    }

    public Cliente(String nome, String telefone, String email, String cpf, Long id, String numeroCliente) {
        super(nome, telefone, email, cpf);
        this.id = id;
        this.numeroCliente = numeroCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
