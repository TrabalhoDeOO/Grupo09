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
		player.addXp(250);
		
		player.setLvl(10);	
		
			
	
		assertEquals(player.getAtk(), 40);
	}
}
