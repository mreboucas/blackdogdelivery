package com.mreboucas.blackdogdelivery.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import com.mreboucas.blackdogdelivery.entity.Cliente;

/**
 * @author Marcelo Reboucas - marceloreboucas10@gmail.com - 10 de jan de 2020 as
 *         13:53:52
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteRepositoryTest {
	
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Test
	public void buscaClientesCadastrados() {
		Page<Cliente> clientes = this.clienteRepository.findAll();
		assertThat(clientes.getTotalElements()).isGreaterThan(1L);
	}
	
	
	

}