package com.mkyong;

import javax.faces.validator.ValidatorException;

import org.junit.Before;
import org.junit.Test;

public class EmailValidatorTest {

	private EmailValidator prueba;
	private final String correoCorrecto = "algo@algo.com";
	private final String correoIncorrecto = "algoalgoalgo";

	@Before
	public void inicializar() {
		prueba = new EmailValidator();
	}

	@Test(expected = ValidatorException.class)
	public void deberiaLanzarExcepcionCorreoPatronPorDefecto() throws Exception {
		// 1. Inicialización

		// 2. Entrenamiento

		// 3. Prueba
		prueba.validate(null, null, correoIncorrecto);
		// 4. Comprobación
	}

	@Test(expected = ValidatorException.class)
	public void deberiaLanzarExcepcionCorreoPatronNuevo() throws Exception {
		// 1. Inicialización

		// 2. Entrenamiento
		prueba.setPatron("[\\w\\.-]*[a-zA-Z0-9_]@[\\w\\.-]*[a-zA-Z0-9]\\.(com|net|org|edu)");
		// 3. Prueba
		prueba.validate(null, null, correoIncorrecto);
		// 4. Comprobación
	}

	@Test
	public void deberiaValidarCorreoCorrectoPatronPorDefecto() throws Exception {
		// 1. Inicialización
		// 2. Entrenamiento

		// 3. Prueba
		prueba.validate(null, null, correoCorrecto);
		// 4. Comprobación
	}

	@Test
	public void deberiaValidarCorreoCorrectoPatronNuevo() throws Exception {
		// 1. Inicialización
		// 2. Entrenamiento
		prueba.setPatron("[\\w\\.-]*[a-zA-Z0-9_]@[\\w\\.-]*[a-zA-Z0-9]\\.(com|net|org|edu)");
		// 3. Prueba
		prueba.validate(null, null, correoCorrecto);
		// 4. Comprobación
	}

	@Test
	public void comprobarValidadorConCorreoNulo() throws Exception {
		// 1. Inicialización
		// 2. Entrenamiento
		// 3. Prueba
		prueba.validate(null, null, null);
		// 4. Comprobación
	}

}