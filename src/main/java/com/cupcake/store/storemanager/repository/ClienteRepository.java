package com.cupcake.store.storemanager.repository;

import com.cupcake.store.storemanager.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
