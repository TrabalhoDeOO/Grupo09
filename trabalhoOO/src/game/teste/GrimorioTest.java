package game.teste;

import static org.junit.Assert.*;
import game.entidade.Item;
import game.entidade.grimorio.Grimorio;
import game.entidade.grimorio.GrimorioItens;

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
		
		for(int i=0;i<50;i++)
			grimorio = new Grimorio();
		
		grimorio.listarGrimorio();
		
		grimorio.listarTudo();
		
		grimorio.getGrimorioInimigos().get(5).listarLoot();
		
		int lvl;
		Item loot = new Item();
		loot = grimorio.getGrimorioInimigos().get(8).getLoot().getItem();
		System.out.println(loot.descricao());
		System.out.println(grimorio.getGrimorioInimigos().get(9).descricao());
		lvl = grimorio.getGrimorioInimigos().get(0).getLvl();
		
		grimorio.getGrimorioInimigos().get(5).listarLoot();
		
		assertEquals(lvl,1);
	}
	
	@Test
	public void testGetGrimorioItens() {
		GrimorioItens grimorio = new GrimorioItens();
		grimorio.listarGrimorioItem();
		
		System.out.println(grimorio.getGrimorioItens().size());
		
		assertEquals(1,1);
	}

}
