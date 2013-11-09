package game.teste;

import static org.junit.Assert.*;
import game.entidade.Arma;
import game.entidade.Item;
import game.entidade.Player;
import game.entidade.grimorio.Grimorio;
import game.entidade.grimorio.GrimorioItens;
import game.framework.ObjectId;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestarPlayer {

	@Before
	public void setUp() throws Exception {
		System.out.println("Testando...\n");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizado...\n");
	}

	@Test
	public void testGetAtk() {
		Player player= new Player("Jõao", "homem", 1, 60 ,60, ObjectId.Player);
		System.out.println(player.getStatus());
		player.addXp(250);
		
		GrimorioItens  grimorio = new GrimorioItens();
		
		Item vest = grimorio.getGrimorioItens().get(14);
		
		
		
		
		player.adicionaItem(vest);
		
		
		
		System.out.println(player.getStatus() + " \n"+ player.getArma());
		
		player.setLvl(10);	
		assertEquals(player.getAtk(), 43);
	}

	@Test
	public void testGetConcha() {
		boolean ver=false;
		Player bob = new Player("Bob","homem",15, 60 ,60, ObjectId.Player);
		bob.setConcha(998);
		
		System.out.println(bob.getStatus());
		System.out.println("Conchas Bob "+bob.getConcha());
		Grimorio gri = new Grimorio();
		
		int concha = gri.getGrimorioInimigos().get(5).getLoot().getConchas();
		gri.getGrimorioInimigos().get(5).getLoot().listarLoot();
		bob.addDinheiro(concha);

		concha = gri.getGrimorioInimigos().get(5).getLoot().getItem().getValor();
		System.out.println("Você vai comprar 1:\n"+gri.getGrimorioInimigos().get(5).getLoot().getItem());
		
		bob.setConcha(1);
		bob.removeDinheiro(concha);
		System.out.println("Conchas Bob "+bob.getConcha());
		
		if(bob.getConcha()!=0){
			ver=true;
		}
		
		assertTrue(ver);
	}
}
