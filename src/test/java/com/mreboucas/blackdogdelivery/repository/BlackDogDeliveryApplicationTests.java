package com.mreboucas.blackdogdelivery.repository;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Marcelo Reboucas - marceloreboucas10@gmail.com - 30 de jan de 2020 as
 *         15:21:29
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlackDogDeliveryApplicationTests {

	/**
	 * Obj mvc usado em todos os testes
	 */
	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	@Before
	private void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testHome() throws Exception {
		String URL1 = "/api";
		System.out.println(this.mvc.perform(get(URL1)).andDo(print()));
		this.mvc.perform(get(URL1)).andExpect(status().isOk()).andExpect(content().string(containsString("clientes")));
	}

	@Test
	public void findItem2() throws Exception {
		String URL5 = "/api/itens/2";
		System.out.println(this.mvc.perform(get(URL5)).andDo(print()));
		this.mvc.perform(get(URL5)).andExpect(status().isOk()).andExpect(jsonPath("preco", equalTo(30.0)));
	}

	@Test
	public void cadastraNovoPedido() throws Exception {
		String URL4 = "/rest/pedido/novo/1/1,2";
		System.out.println(this.mvc.perform(get(URL4)).andDo(print()));
		this.mvc.perform(get(URL4)).andExpect(status().isOk()).andExpect(jsonPath("valorTotal", is(57.0)))
				.andExpect(jsonPath("pedido", greaterThan(3)))
				.andExpect(jsonPath("mensagem", equalTo("Pedido efetuado com sucesso")));
	}

}
