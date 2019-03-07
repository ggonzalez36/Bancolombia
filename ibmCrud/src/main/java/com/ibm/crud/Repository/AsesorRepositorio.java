package com.ibm.crud.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.crud.Entity.AsesorBancario;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface AsesorRepositorio extends JpaRepository<AsesorBancario, Long> {

}
