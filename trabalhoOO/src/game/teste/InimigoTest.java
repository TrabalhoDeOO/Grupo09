package game.teste;

import static org.junit.Assert.*;
import game.entidade.Criar;
import game.entidade.InimigoEvento;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InimigoTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando");
	}

	@Test
	public void testGetDef() {
		Criar criar = new Criar();
		InimigoEvento inimigo = (InimigoEvento) criar.CriarMonstro("Slime", "b", "Monstro Geleia", 15, 0);
		
		System.out.println(inimigo.getNome()+" Def "+inimigo.getDef()
				+" Atk "+inimigo.getAtk()+" Spe "+inimigo.getSpe()
				+" Hp "+inimigo.getHp()+" Lvl "+inimigo.getLvl());
		int Def = inimigo.getLvl()*2;
		
		assertEquals(inimigo.getDef(),Def);
	}

	@Test
	public void testGetHp() {
		InimigoEvento many = new InimigoEvento("Many", 10, "mamute");
		System.out.println(many.getNome()+" Def "+many.getDef()
				+" Atk "+many.getAtk()+" Spe "+many.getSpe()
				+" Hp "+many.getHp()+" Lvl "+many.getLvl());
		int Hp = many.getAtk()/2+many.getDef()*2;
		assertEquals(many.getHp(),Hp);
	}

}
