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
		Arma espada = new Arma();
		espada = new Arma("Excalibur",123,3,10000);
		espada.setBonusA(5);
		espada.setCodItem(321);
		espada.setNomeItem("Excaliburr");
		espada.setValor(1000);
		espada.criarDescricao("Espada Mistica");
		System.out.println(espada.descricao()+"\n"+espada.getNomeItem()+espada.getCodItem()+
				espada.getBonus()+espada.getValor()+"\n"+espada);
		assertEquals(espada.getBonus(),5);
	}

}
