package com.cupcake.store.storemanager.service;

import com.cupcake.store.storemanager.model.Pedido;
import com.cupcake.store.storemanager.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    public Optional<Pedido> getPedidoById(Long id){
        return this.pedidoRepository.findById(id);
    }

    public Pedido addPedido(Pedido pedido){
        return this.pedidoRepository.save(pedido);
    }

    public Pedido updatePedido(Pedido pedido){
        return this.pedidoRepository.save(pedido);
    }

    public void deletePedido(Long id){
        this.pedidoRepository.deleteById(id);
    }

    public List<Pedido> getAll(){
        return this.pedidoRepository.findAll();
    }




}

