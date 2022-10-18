package com.cupcake.store.storemanager.service;

import com.cupcake.store.storemanager.model.Funcionario;
import com.cupcake.store.storemanager.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {


    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario addFuncionario(Funcionario funcionario){
        return this.funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> getAll(){
        return this.funcionarioRepository.findAll();
    }

    public Funcionario updateFuncionario(Funcionario funcionario){
        return this.funcionarioRepository.save(funcionario);
    }

    public void deleteFuncionario(Long id){
        this.funcionarioRepository.deleteById(id);
    }

    public Optional<Funcionario> getFuncionarioById(Long id){
        return funcionarioRepository.findById(id);
    }





}
