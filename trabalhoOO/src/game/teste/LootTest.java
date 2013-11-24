package game.teste;

import static org.junit.Assert.*;
import game.entidade.InimigoEvento;
import game.entidade.Item;
import game.entidade.Loot;
import game.entidade.grimorio.Grimorio;
import game.entidade.grimorio.GrimorioItens;
import game.framework.ObjectId;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LootTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando Teste de Loot");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando Teste de Loot");
	}

	@Test
	public void testGetConchas() {
		GrimorioItens gri = new GrimorioItens();
		Grimorio gri2 = new Grimorio();
		InimigoEvento in = new InimigoEvento(ObjectId.InimigoT);
		Item item = gri.getGrimorioItens().get(36);
		Loot loot = new Loot(5,item);
		loot.setConchas(15);
		assertEquals(loot.getConchas(),15);
	}

	@Test
	public void testGetInimigo() {
		GrimorioItens gri = new GrimorioItens();
		Grimorio gri2 = new Grimorio();
		InimigoEvento in = gri2.getGrimorioInimigos().get(13);
		Item item = gri.getGrimorioItens().get(36);
		Loot loot = new Loot(5,item);
		item = gri.getGrimorioItens().get(26);
		loot.setInimigo(in);
		loot.setItem(item);
		loot.listarLoot();
		assertEquals(loot.getInimigo(),in);
		assertEquals(loot.getItem(),item);
	}

}
