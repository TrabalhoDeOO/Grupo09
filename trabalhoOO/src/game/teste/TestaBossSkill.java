package game.teste;

import static org.junit.Assert.*;
import game.entidade.grimorio.JavaliBoss;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestaBossSkill {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando");
	}

	@Test
	public void testCalculaSkillB1() {
		JavaliBoss jav1 = new JavaliBoss();
		
		System.out.println(jav1.getNome()+" Def "+jav1.getDef()
				+" Atk "+jav1.getAtk()+" Spe "+jav1.getSpe()
				+" Hp "+jav1.getHp()+" Lvl "+jav1.getLvl());
		
		int hpTeste = 100;
		int hpRestante;
		
		hpRestante = hpTeste - jav1.calculaSkill(hpTeste);
		
		System.out.println(hpRestante);
		
		assertEquals(hpRestante, 50);
		
	}

}
