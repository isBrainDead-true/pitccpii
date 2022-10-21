package com.cupcake.store.storemanager.repository;

import com.cupcake.store.storemanager.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

}
