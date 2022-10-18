package com.cupcake.store.storemanager.controller;

import com.cupcake.store.storemanager.model.Cliente;
import com.cupcake.store.storemanager.model.Funcionario;
import com.cupcake.store.storemanager.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("v1/funcionario")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService){
        this.funcionarioService = funcionarioService;
    }

    @PostMapping("new")
    public ResponseEntity addFuncionario(@RequestBody Funcionario funcionario ){
        Funcionario novoFuncionario = this.funcionarioService.addFuncionario(funcionario);
        return new ResponseEntity<>(novoFuncionario, HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<List<Funcionario>> getAll(){
        List<Funcionario> funcionarios = this.funcionarioService.getAll();
        return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity deleFuncionario(@PathVariable("id") Long id){
        this.funcionarioService.deleteFuncionario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public ResponseEntity getFuncionarioById(@PathVariable("id") Long id){
        Optional<Funcionario> funcionarioEncontrado = this.funcionarioService.getFuncionarioById(id);
        return new ResponseEntity<>(funcionarioEncontrado, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateCliente(@RequestBody Funcionario funcionario){
        Funcionario funcionarioAtualizado = funcionarioService.updateFuncionario(funcionario);
        return new ResponseEntity<>(funcionarioAtualizado, HttpStatus.OK);
    }


}
