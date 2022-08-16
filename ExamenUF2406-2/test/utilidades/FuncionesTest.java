package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {
	 private static Funciones f;
	 
	 @BeforeAll
	 static void inicializarFunciones() {
		 f = new Funciones();
	 }
	 
	@Test
	void devuelveCentralTest() {
		assertEquals(5, f.devuelveCentral(5,1,9), "El número central de los números 5,1 y 9 es el número 5");
		assertEquals(1, f.devuelveCentral(-5,1,9), "El número central de los números -5,1 y 9 es el número 1");
		assertEquals(-1, f.devuelveCentral(5,-9,-1), "El número central de los números 5,-9 y -1 es el número -1");
	}
	@Test
	void esBisiestoTest() {
		assertTrue(f.esBisiesto(2020),"El número debe devolver true");
		assertFalse(f.esBisiesto(1990), "El número debe devolver false");
		assertFalse(f.esBisiesto(2100), "El número debe devolver false");
		assertTrue(f.esBisiesto(1660),"Debe saltar una excepción contempleada");
		assertFalse(f.esBisiesto(2502),"Debe saltar una excepción contempleada");
	}
}
