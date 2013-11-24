package game.teste;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

//import game.entidade.Arma;
import game.entidade.Criar;
import game.entidade.Inimigo;
import game.entidade.InimigoEvento;
import game.entidade.InimigoPlataforma;
import game.entidade.Loja;
import game.entidade.Loot;
import game.entidade.NPC;
import game.entidade.Item;
import game.entidade.Player;
import game.entidade.grimorio.Grimorio;
import game.framework.ObjectId;
//import game.entidade.Vestimenta;

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
		Item comida;
		Item etc;
		Criar criar = new Criar(1234);
		criar.setSenha(1235);
		System.out.println(criar.getSenha());
		
		espada = criar.criarItem("Arma", "Angra Mainyu",1113, 10,10000);
		escudo = criar.criarItem("Vestimenta", "Ahura Madza",1114, 10,10000);
		cajado = criar.criarItem("Arma", "Vareta",15, 25,10000);
		comida = criar.criarItem("Consumivel", "Maça", 10, 5, 3);
		etc = criar.criarItem("Misc", "Pedra", 28, 0, 0);
		
		ArrayList<Item> itens = new ArrayList<Item>();
		
		criar.setItem(itens);
		
		itens.add(espada);
		itens.add(escudo);
		itens.add(cajado);
		itens.add(comida);
		itens.add(etc);
		
		assertEquals(itens,criar.getItem());		
	}
	
	@Test
	public void testGetNPC() {
		
		NPC guide;
		NPC banco;
		NPC ladra;
		
		Criar criar = new Criar(1234);
		
		guide = criar.criarNPC("Guia",1,1);
		banco = criar.criarNPC("Banqueiro",2,2);
		ladra = criar.criarNPC("Arruaceira",3,1);
		
		ArrayList<NPC> npc = new ArrayList<NPC>();
		
		criar.setNPC(npc);
		
		npc.add(guide);
		npc.add(banco);
		npc.add(ladra);
		
		assertEquals(npc,criar.getNPC());
		
	}
	
	@Test
	public void testGetMonstro() {
		ArrayList<Inimigo> monstros = new ArrayList<Inimigo>();
		Criar criar = new Criar();
		criar = new Criar(1234);
		Player player = new Player(ObjectId.Player);
		
		Item espada;		
		espada = criar.criarItem("Arma", "Angra Mainyu",1113, 10,10000);
		
		criar.setPlayer(player);
		criar.setMonstro(monstros);
		
		Grimorio gri = new Grimorio();
		InimigoEvento in = gri.getGrimorioInimigos().get(17);
		
		player = criar.criarPlayer("Bob", "Homem", 1, 0, 0, ObjectId.Player);
		player = criar.criarPlayer("Bob", "Alien", 1, 0, 0, ObjectId.Player);
		
		monstros.add(in);
		in = gri.getGrimorioInimigos().get(12);
		monstros.add(in);
		in = gri.getGrimorioInimigos().get(10);
		monstros.add(in);
		
		InimigoPlataforma in3 = (InimigoPlataforma) criar.CriarMonstro("Many1", "a", "Mammoth", 1, 0);
		in = (InimigoEvento) criar.CriarMonstro("Many2", "b", "Mammoth", 1, 0);
		
		criar.listarInimigo();
		
		criar.CriarLoot(5, espada, (Inimigo)in);
		
		Inimigo in2 = in;
		
		assertNotSame(criar.getPlayer(),null);
		assertThat(criar.getMonstro(),hasItem(in2));
	}
	
	@Test
	public void testGetLoja() {
		Criar criar = new Criar();
		criar = new Criar(1234);
		Loja loja;
		ArrayList<Loja> lojas = new ArrayList<Loja>();
		
		criar.setLoja(lojas);
		
		loja = criar.criarLoja("Padeiro", "Comidas");
		loja = criar.criarLoja("Ferreiro", "Armas");
		
		criar.listarloja();
		

		assertThat(criar.getLoja(),is(lojas));
	}
	

}
