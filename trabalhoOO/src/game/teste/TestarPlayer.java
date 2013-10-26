package game.teste;

import static org.junit.Assert.*;
import game.entidade.Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestarPlayer {

	@Before
	public void setUp() throws Exception {
		System.out.println("Finalizado...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando...");
	}

	@Test
	public void testGetAtk() {
		Player player= new Player("Jõao", "homem", 1);
		System.out.println(player.getStatus());
		player.addXp(51);
		System.out.println("\n"+player.getStatus());
		player.setLvl(10);
		System.out.println("\n"+player.getStatus());		
	
		assertEquals(player.getAtk(), 40);
	}
}
