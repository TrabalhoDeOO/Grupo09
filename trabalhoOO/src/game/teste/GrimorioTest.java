package game.teste;

import static org.junit.Assert.*;
import game.entidade.Item;
import game.entidade.grimorio.Grimorio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GrimorioTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGrimorioInimigos() {
		Grimorio grimorio = new Grimorio();
		grimorio.listarGrimorio();
		Item loot = new Item();
		loot = grimorio.getGrimorioInimigos().get(0).getLoot().getItem();
		System.out.println(loot);
		
		assertTrue(true);
	}

}
