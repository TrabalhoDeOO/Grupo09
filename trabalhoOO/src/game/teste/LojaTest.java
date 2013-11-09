package game.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import game.entidade.Arma;
import game.entidade.Consumivel;
import game.entidade.Item;
import game.entidade.Loja;
import game.entidade.Player;
import game.framework.ObjectId;

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
		Loja lojinha = new Loja("Chef", "Armas");
		ObjectId id;
		Player player = new Player("Bob", "homem", 15, 60, 60 , ObjectId.Player);
		player.addDinheiro(10);
		Arma arma = new Arma("Angra",1015,200,15);
		player.adicionaItem(arma);
		System.out.println(player.getArma());
		System.out.println(player.getStatus());
		
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
		
		lojinha.venderItem(player);
		
		System.out.println("Player Conchas "+player.getConcha());
		player.listarMochila();
		
		lojinha.comprarItem(player);
		System.out.println((player.getArma()==null)?"null":player.getArma());
		System.out.println(player.getStatus());
		
		assertEquals(lojinha.getItens(),itens);
		
		
	}
	
	
}
