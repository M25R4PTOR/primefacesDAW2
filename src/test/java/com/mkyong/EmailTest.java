package com.mkyong;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EmailTest {

	private Email prueba;

	@Before
	public void inicializar() {
		prueba = new Email("Manuel", "gmail");
	}

	@Test
	public void pruebaGetterSetterLombokUsuario() throws Exception {
		assertThat(prueba.getUsuario(), equalTo("Manuel"));
	}

	@Test
	public void pruebaGetterSetterLombokDominio() throws Exception {
		assertThat(prueba.getDominio(), equalTo("gmail"));
	}

	@Test
	public void deberiaSerIguales() throws Exception {
		Email emailA = new Email("usuarioA", "dominioA");
		Email emailB = new Email("usuarioA", "dominioA");

		assertThat(emailA, is(emailB));
	}
}
