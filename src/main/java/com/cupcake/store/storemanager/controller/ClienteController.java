package com.cupcake.store.storemanager.controller;

import com.cupcake.store.storemanager.model.Cliente;
import com.cupcake.store.storemanager.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("v1/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping("/all")
    public ResponseEntity getAll(){
        List<Cliente> clientes = this.clienteService.getAll();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteCliente(@PathVariable("id") Long id){
        this.clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public ResponseEntity getClient(@PathVariable("id") Long id){
        Optional<Cliente> clienteEncontrado = this.clienteService.getClienteById(id);
        return new ResponseEntity<>(clienteEncontrado, HttpStatus.OK);
    }

    @PostMapping("new")
    public ResponseEntity addCliente(@RequestBody Cliente cliente){
        Cliente novoCliente = clienteService.addCliente(cliente);
        return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity updateCliente(@RequestBody Cliente cliente){
        Cliente clienteAtualizado = clienteService.updateCliente(cliente);
        return new ResponseEntity<>(clienteAtualizado, HttpStatus.OK);
    }

    public ResponseEntity getClienteById(@RequestParam("id") Long id){
        Optional<Cliente> clienteEncontrado = this.clienteService.getClienteById(id);
        return new ResponseEntity<>(clienteEncontrado, HttpStatus.OK);
    }


}
