package com.ibm.crud.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ibm.crud.Entity.Cliente;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {




}
