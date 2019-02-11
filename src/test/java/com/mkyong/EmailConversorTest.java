package com.mkyong;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import javax.faces.component.UIComponent;
import javax.faces.convert.ConverterException;

import org.junit.Test;

public class EmailConversorTest {

	private EmailConversor conversor;
	private EmailConversor conversorSpy;
	private UIComponent componente;

	// ROTO
	// @Before
	// public void inicializar() {
	// Map<String, Object> atributos = new HashMap();
	// conversor = new EmailConversor();
	// conversorSpy = spy(conversor);
	// componente = mock(UIComponent.class);
	//
	// atributos.put("separador", "@");
	//
	// when(componente.getAttributes()).thenReturn(atributos);
	// }
	//
	// @Before
	// public void inicializar() {
	// conversor = new EmailConversor();
	// conversorSpy = spy(conversor);
	// componente = mock(UIComponent.class);
	//
	// doReturn
	// }

	@Test
	public void dadoUnaCadenaDevuelveObjetoEmailCorrespondiente() throws Exception {
		Email ejemplo = (Email) conversor.getAsObject(null, null, "manuel@gmail.com");

		assertThat(ejemplo.getUsuario(), equalTo("manuel"));
		assertThat(ejemplo.getDominio(), equalTo("gmail.com"));
	}

	@Test(expected = ConverterException.class)
	public void dadoUnaCadenaSinArrobaLanzarExcepcion() throws Exception {
		conversor.getAsObject(null, null, "manuelgmail.com");
	}

	@Test
	public void dadoUnValorNuloDebeDevolverNull() throws Exception {
		Email ejemplo = (Email) conversor.getAsObject(null, null, null);

		assertThat(ejemplo, is(nullValue()));
	}

	@Test(expected = ConverterException.class)
	public void dadoUnaCadenaVaciaLanzarExcepcion() throws Exception {
		conversor.getAsObject(null, null, "");
	}

	@Test
	public void dadoUnObjetoEmailDevuelveRepresentacionComoCadena() throws Exception {
		Email email = new Email("manuel", "gmail.com");
		String res = conversor.getAsString(null, null, email);
		assertThat(res, is("manuel@gmail.com"));
	}

	@Test
	public void dadoUnObjetoEmailNuloDevuelveNulo() throws Exception {
		String res = conversor.getAsString(null, null, null);

		assertThat(res, is(nullValue()));
	}

	@Test(expected = ConverterException.class)
	public void dadoUnObjetoNoEmailLanzaExcepcion() throws Exception {
		conversor.getAsString(null, null, 5);
	}
}