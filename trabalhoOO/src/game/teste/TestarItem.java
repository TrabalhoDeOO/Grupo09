package game.teste;

import static org.junit.Assert.*;
import game.entidade.Consumivel;
//import game.entidade.Item;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestarItem {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando a classe Consumivel");
	}

	@Test
	public void testGetNomeItem() {
		Consumivel potion = new Consumivel("Poção", 001, 20);
		assertEquals(potion.getNomeItem(), "Poção");
		
	}

	@Test
	public void testGetCodItem() {
		Consumivel potion = new Consumivel("Poção", 001, 20);
		assertEquals(potion.getCodItem(), 001);

	}

}
