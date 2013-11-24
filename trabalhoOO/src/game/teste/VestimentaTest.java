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
		Vestimenta asprika = new Vestimenta();
		asprika = new Vestimenta("asprika", 1001, 18, 1);
		asprika.setBonus(20);
		asprika.setCodItem(1002);
		asprika.setNomeItem("Asprika");
		asprika.setValor(1001);
		asprika.criarDescricao("Manto Divino");
		
		System.out.println(asprika+"\n"+asprika.descricao());
		
		assertEquals(asprika.getBonus(),20);
		assertEquals(asprika.getNomeItem(),"Asprika");
		assertEquals(asprika.getValor(),1001);
		assertEquals(asprika.getCodItem(),1002);
	}

}
