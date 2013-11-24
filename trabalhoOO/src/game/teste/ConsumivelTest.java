package game.teste;

import static org.junit.Assert.*;
import game.entidade.Consumivel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConsumivelTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando Consumivel");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando Consumivel");
	}

	@Test
	public void testGetBonus() {
		Consumivel cons = new Consumivel();
		cons = new Consumivel("Consumivel",10,2,2);
		cons.setBonusC(4);
		cons.setCodItem(12);
		cons.setNomeItem("Cons");
		cons.setValor(3);
		cons.criarDescricao("Test");
		System.out.println(cons.descricao());
		System.out.println(cons.getNomeItem()+cons.getCodItem()+cons.getBonus()+
				cons.getValor()+"\n"+cons.toString());
		assertEquals(4,cons.getBonus());
	}

}
