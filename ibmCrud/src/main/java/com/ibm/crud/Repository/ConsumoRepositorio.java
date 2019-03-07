package com.ibm.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.crud.Entity.Consumo;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConsumoRepositorio extends JpaRepository<Consumo, Long>  {
	
	

}
