package game.teste;

import static org.junit.Assert.*;
import game.entidade.Consumivel;
import game.entidade.Item;
//import game.entidade.Item;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestarItem {

	@Before
	public void setUp() throws Exception {
		System.out.println("Testando Item");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando Item");
	}

	@Test
	public void testGetNomeItem() {
		Item item = new Item();
		item = new Item("item", 1);
		item = new Item("Item",1,1);
		
		item.setNomeItem("Item2");
		item.setCodItem(2);
		item.setValor(2);
		
		item.criarDescricao("oioi");
		int bon = item.getBonus();
		System.out.println(item+"\nBonus: "+bon+"\nValor: "+item.getValor()+item.descricao());
		
		assertEquals(item.getNomeItem(), "Item2");
	}

	@Test
	public void testGetCodItem() {
		Consumivel potion = new Consumivel("Poção", 001, 20, 1);
		assertEquals(potion.getCodItem(), 001);

	}

}
