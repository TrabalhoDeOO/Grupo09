package game.teste;

import static org.junit.Assert.*;
import game.entidade.Vestimenta;
import game.entidade.Item;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VestimentaTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetBonusV() {
		Vestimenta asprika = new Vestimenta("Asprika", 1001, 20, 1);
		assertEquals(asprika.getBonus(),20);

	}

	@Test
	public void testGetCodItem() {
		Item asprika = new Vestimenta("Asprika", 1001, 20, 1);
		assertEquals(asprika.getCodItem(),1001);
	}

}
