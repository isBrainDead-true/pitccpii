package com.cupcake.store.storemanager.controller;

import com.cupcake.store.storemanager.model.Pedido;
import com.cupcake.store.storemanager.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("v1/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @PostMapping("/new")
    public ResponseEntity addPedido(@RequestBody Pedido pedido){
        Pedido novoPedido = this.pedidoService.addPedido(pedido);
        return new ResponseEntity(novoPedido, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getPedido(@PathVariable("id") Long id){
        return new ResponseEntity(this.pedidoService.getPedidoById(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updatePedido(@RequestBody Pedido pedido){
        Pedido pedidoAtualizado = this.pedidoService.updatePedido(pedido);
        return new ResponseEntity(pedidoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePedido(@PathVariable("id") Long id){
        this.pedidoService.deletePedido(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pedido>> getAll(){
        List<Pedido> pedidos = this.pedidoService.getAll();
        return new ResponseEntity<>(pedidos, HttpStatus.OK);
    }


}
