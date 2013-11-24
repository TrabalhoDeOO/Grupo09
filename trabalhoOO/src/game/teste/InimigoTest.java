package game.teste;

import static org.junit.Assert.*;
import game.entidade.Criar;
import game.entidade.InimigoEvento;
import game.entidade.Item;
import game.entidade.Loot;
import game.entidade.grimorio.Grimorio;
import game.entidade.grimorio.GrimorioItens;
import game.framework.ObjectId;

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
		GrimorioItens gri = new GrimorioItens();
		InimigoEvento many = new InimigoEvento(ObjectId.InimigoT);
		Item item = gri.getGrimorioItens().get(39);
		Loot loot = new Loot(many);
		for(int i=1;i<11;i++){
		many = new InimigoEvento("Many",i,"Mamute",0,0,null,ObjectId.InimigoT);
		many.criarDescricao("Descriçao");
		System.out.println(" Tipo: "+many.getTipo()+" Lvl "+many.getLvl()+" Def "+many.getDef()
				+" Atk "+many.getAtk()+" Spe "+many.getSpe()+" Hp "+many.getHp()+" Xp: "+many.getXp()+
				" Desc:"+many.descricao()+"\nToString: "+many+"\n\n");
		}
		loot = new Loot(5,item,many);

		many.setLoot(loot);
		many.setAtk(20);
		many.setDef(25);
		many.setHp(30);
		many.setLvl(9);
		many.setNome("Mamute");
		many.setSpe(10);
		many.setTipo("Mammoth");
		item = gri.getGrimorioItens().get(38);
		loot = new Loot(5,item,many);
		many.criarLoot(loot);
		
		many.listarLoot();
		
		//int Hp = many.getAtk()/2+many.getDef()*2;
		assertEquals(many.getHp(),30);
		assertEquals(many.getLoot(),loot);
	}

}
