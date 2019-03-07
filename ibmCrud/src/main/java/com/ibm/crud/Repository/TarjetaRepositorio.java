package com.ibm.crud.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.ibm.crud.Entity.Tarjeta;

@RepositoryRestResource
public interface TarjetaRepositorio extends JpaRepository<Tarjeta,Long> {

}
