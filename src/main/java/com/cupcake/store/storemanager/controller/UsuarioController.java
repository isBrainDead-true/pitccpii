package com.cupcake.store.storemanager.controller;

import com.cupcake.store.storemanager.model.UserApp;
import com.cupcake.store.storemanager.service.JpaUserDetailsService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users")
@AllArgsConstructor
public class UsuarioController {

    private final JpaUserDetailsService  service;

    @PostMapping("/new")
    public ResponseEntity<UserApp> salvar(@RequestBody UserApp usuario){
        UserApp user = service.create(usuario);
        return new ResponseEntity<UserApp>(user, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserApp>> getAll(){
        List<UserApp> usuarios = service.getAll();
        return new ResponseEntity<List<UserApp>>(usuarios, HttpStatus.OK);
    }



}
