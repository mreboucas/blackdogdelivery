package com.mreboucas.blackdogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mreboucas.blackdogdelivery.entity.Pedido;

/**
 * @author Marcelo Reboucas - marceloreboucas10@gmail.com - 10 de jan de 2020 as
 *         13:55:42
 */

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}