package game.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import game.entidade.NPC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NpcTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando NPC Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando NPC Test");
	}

	@Test
	public void testGetFuncao() {
		ArrayList<NPC> array = new ArrayList<NPC>();
		NPC npc = new NPC();
		npc = new NPC("Guia",1,1);
		npc.setFuncao(2);
		npc.setNome("Guarda");
		npc.setSexo(0);
		System.out.println(npc.getNome()+" "+npc.getFuncao()+" "+npc.getSexo());
		array.add(npc);
		npc = new NPC("Guia",1,1);
		array.add(npc);
		npc = new NPC("Gemologista",3,0);
		array.add(npc);
		
		npc.listarNPC(array);
		
		assertEquals(npc.getFuncao(),3);
	}

}
