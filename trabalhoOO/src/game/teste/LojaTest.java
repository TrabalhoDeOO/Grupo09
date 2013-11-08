package game.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import game.entidade.Consumivel;
import game.entidade.Item;
import game.entidade.Loja;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LojaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetItens() {
		Loja lojinha = new Loja("Chef", "Comidas");
		Consumivel comida = new Consumivel("Bolo", 100, 5, 1);
		Consumivel comida2 = new Consumivel("Pao", 101, 2, 1);
		Consumivel comida3 = new Consumivel("Torta", 102, 6, 1);
		Consumivel comida4 = new Consumivel("Rocambole", 103, 6, 1);
		Consumivel comida5 = new Consumivel("Pastel", 104, 7, 1);
		ArrayList<Item> itens = new ArrayList<Item>();
		itens.add(comida);
		itens.add(comida2);
		itens.add(comida3);
		itens.add(comida4);
		itens.add(comida5);
		lojinha.adicionaItem(comida);
		lojinha.adicionaItem(comida2);
		lojinha.adicionaItem(comida3);
		lojinha.adicionaItem(comida4);
		lojinha.adicionaItem(comida5);
		lojinha.criarDescricao("lojinha da hora");
		lojinha.listarItens();
		itens.remove(4);
		assertEquals(lojinha.getItens(),itens);
	}
	
	
}
