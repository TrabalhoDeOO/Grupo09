package game.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import game.entidade.Arma;
import game.entidade.Criar;
import game.entidade.NPC;
import game.entidade.Item;
import game.entidade.Vestimenta;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CriarTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetItem() {
		
		Item espada;
		Item escudo;
		Item cajado;
		Criar criar = new Criar(1234);
		
		espada = criar.criarItem(1234, 1234, "Arma", "Angra Mainyu",1113, 10);
		escudo = criar.criarItem(1234, 1234, "Vestimenta", "Ahura Madza",1114, 10);
		cajado = criar.criarItem(1234, 1234, "Arma", "Vareta",15, 25);
		
		ArrayList<Item> itens = new ArrayList<Item>();
		
		itens.add(espada);
		itens.add(escudo);
		itens.add(cajado);
		
		assertEquals(itens,criar.getItem());		
	}
	
	@Test
	public void testGetNPC() {
		
		NPC guide;
		NPC banco;
		NPC ladra;
		
		Criar criar = new Criar(1234);
		
		guide = criar.criarNPC(1234, 1234, "Guia",1,1);
		banco = criar.criarNPC(1234, 1234, "Banqueiro",2,2);
		ladra = criar.criarNPC(1234, 1234, "Arruaceira",3,1);
		
		ArrayList<NPC> npc = new ArrayList<NPC>();
		
		npc.add(guide);
		npc.add(banco);
		npc.add(ladra);
		
		assertEquals(npc,criar.getNPC());
		
	}

}
