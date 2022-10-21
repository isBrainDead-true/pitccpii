package com.cupcake.store.storemanager;

import com.cupcake.store.storemanager.model.Authority;
import com.cupcake.store.storemanager.model.UserApp;
import com.cupcake.store.storemanager.service.JpaUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@AllArgsConstructor
public class Init implements CommandLineRunner {

    private final JpaUserDetailsService service;

    @Override
    public void run(String... args) throws Exception {
        UserApp usuario = new UserApp();
        usuario.setPassword("admin");
        usuario.setUsername("admin");
        Set<Authority> roles = new HashSet<Authority>();
        Authority role = new Authority();
        role.setRole("USER");
        usuario.setAuthorities(roles);
        service.create(usuario);

    }
}
