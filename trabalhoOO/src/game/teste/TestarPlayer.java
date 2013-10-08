package game.teste;

import static org.junit.Assert.*;
import game.entidade.Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestarPlayer {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Testando...");
	}

	@Test
	public void testGetSexo() {
		Player player= new Player("Jõao", "homem");
		assertEquals(player.getSexo(), "homem");
	}
}
