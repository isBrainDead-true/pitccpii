package com.cupcake.store.storemanager.model;

import java.util.Date;

public class Pedido {

    private Long id;
    private Cliente cliente;
    private Atendente atendente;
    private Gerente gerente;
    private Date dataDaCompra;

    public Pedido(Long id, Cliente cliente, Atendente atendente, Gerente gerente, Date dataDaCompra) {
        this.id = id;
        this.cliente = cliente;
        this.atendente = atendente;
        this.gerente = gerente;
        this.dataDaCompra = dataDaCompra;
    }

    public Pedido(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }
}
