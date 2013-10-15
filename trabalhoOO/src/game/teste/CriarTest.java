package game.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import game.entidade.Criar;
import game.entidade.NPC;
import game.entidade.Item;

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
		
		Item espada = new Item("Angra Mainyu",1113);
		Item escudo = new Item("Ahura Madza",1114);
		Item cajado = new Item("Vareta",15);
		Criar criar = new Criar(1234);
		
		criar.criarItem(1234, 1234, "Armamento", espada);
		criar.criarItem(1234, 1234, "Armamento", escudo);
		criar.criarItem(1234, 1234, "Armamento", cajado);
		
		ArrayList<Item> itens = new ArrayList<Item>();
		
		itens.add(espada);
		itens.add(escudo);
		itens.add(cajado);
		
		assertEquals(itens,criar.getItem());		
	}
	
	@Test
	public void testGetNPC() {
		
		NPC guide = new NPC("Guia",1,1);
		NPC banco = new NPC("Banqueiro",2,2);
		NPC ladra = new NPC("Arruaceira",3,1);
		
		Criar criar = new Criar(1234);
		
		criar.criarNPC(1234, 1234, guide);
		criar.criarNPC(1234, 1234, banco);
		criar.criarNPC(1234, 1234, ladra);
		
		ArrayList<NPC> npc = new ArrayList<NPC>();
		
		npc.add(guide);
		npc.add(banco);
		npc.add(ladra);
		
		assertEquals(npc,criar.getNPC());
		
	}

}
