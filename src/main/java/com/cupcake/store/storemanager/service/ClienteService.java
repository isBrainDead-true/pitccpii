package com.cupcake.store.storemanager.service;

import com.cupcake.store.storemanager.model.Cliente;
import com.cupcake.store.storemanager.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente addCliente(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id){
        this.clienteRepository.deleteById(id);
    }

    public Optional<Cliente> getClienteById(Long id){
        return clienteRepository.findById(id);
    }

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }



}
