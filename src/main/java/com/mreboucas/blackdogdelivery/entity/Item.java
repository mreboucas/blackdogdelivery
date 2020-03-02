package com.mreboucas.blackdogdelivery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @author Marcelo Reboucas - marceloreboucas10@gmail.com - 10 de jan de 2020 as
 *         13:59:05
 */

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Length(min = 2, max = 30, message = "O tamanho do nome deve ser entre {min} e {max}caracteres")
	private String nome;

	@NotNull
	@Min(value = 20, message = "O valor mínimo deve ser {value} reais")
	private Double preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Item(Long id,
			@NotNull @Length(min = 2, max = 30, message = "O tamanho do nome deve ser entre {min} e {max}caracteres") String nome,
			@NotNull @Min(value = 20, message = "O valor mínimo deve ser {value} reais") Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
}