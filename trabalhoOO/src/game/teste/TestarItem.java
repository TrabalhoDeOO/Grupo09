package game.teste;

import static org.junit.Assert.*;
import game.entidade.Item;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestarItem {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("testando a classe item");
	}

	@Test
	public void testGetNomeItem() {
		Item item = new Item("Poção", 001,"+20 HP");
		assertEquals(item.getNomeItem(), "Poção");
		
	}

	@Test
	public void testGetCodItem() {
		Item item = new Item("Poção", 001,"+20 HP");
		assertEquals(item.getCodItem(), 001);
		
	}

}
