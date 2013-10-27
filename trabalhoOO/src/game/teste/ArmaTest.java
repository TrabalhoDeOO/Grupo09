package game.teste;

import static org.junit.Assert.*;
import game.entidade.Arma;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArmaTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}
	@Test
	public void testGetBonusA() {
		Arma espada = new Arma("Excalibur",123,5);
		assertEquals(espada.getBonus(),5);
	}

}
