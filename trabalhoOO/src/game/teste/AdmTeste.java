package game.teste;

import static org.junit.Assert.*;
import game.entidade.Adm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdmTeste {

	@Before
	public void setUp() throws Exception {
		System.out.println("Inicializando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}
	
	@Test
	public void testGetSenha() {
		Adm adm= new Adm(1234, "admteste");
		assertEquals(adm.getSenha(), 1234);
	}

	@Test
	public void testGetLogin() {
		Adm adm= new Adm(1234, "admteste");
		assertEquals(adm.getLogin(), "admteste");
	}


}
