package com.mreboucas.blackdogdelivery.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mreboucas.blackdogdelivery.entity.Cliente;

/**
 * @author Marcelo Reboucas - marceloreboucas10@gmail.com - 10 de jan de 2020 as
 *         13:53:52
 */

@Repository
public interface ClienteRepository  extends CrudRepository<Cliente, Long> {
	
	
	Page<Cliente> findAll();
	
	Cliente findByNome(String nome);

	Page<Cliente> findByNomeContainingAllIgnoringCase(@Param("nome") String nome,Pageable pageable);

	Cliente findByNomeAllIgnoringCase(@Param("nome") String nome);

	
	

}