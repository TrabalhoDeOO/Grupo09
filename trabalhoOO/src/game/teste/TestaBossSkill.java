package game.teste;

import static org.junit.Assert.*;
import game.entidade.grimorio.Boss;
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
		Boss boss = new Boss("Boss",20,"Boss", 0, 0, null, null);
		
		int test;
		test = boss.calculaSkill(1);
		test = boss.calculaSkill1(2);
		test = boss.calculaSkill2(3);
		
		JavaliBoss jav1 = new JavaliBoss();
		
		System.out.println(jav1.getNome()+" Def "+jav1.getDef()
				+" Atk "+jav1.getAtk()+" Spe "+jav1.getSpe()
				+" Hp "+jav1.getHp()+" Lvl "+jav1.getLvl());
		
		int hpTeste = 100;
		int hpRestante;
		
		hpRestante = hpTeste - jav1.calculaSkill(hpTeste);
		
		System.out.println(hpRestante);
		
		//Teste de Coverage para o loot
		for(int i=0;i<20;i++)
			jav1 = new JavaliBoss();

		assertEquals(hpRestante, 50);
		
	}

}
