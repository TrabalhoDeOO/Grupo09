package game.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
//import game.entidade.Arma;
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
		String hm = "homem";
		String ml = "mulher", in = "Alien";
		String nome = "Bob";
		int lvl = 1;
		Player player= new Player("Jõao", hm, 1, 60 ,60, null, ObjectId.Player);
		
		player.setAtk(3); player.setDef(3); player.setLvl(lvl);
		player.setHp(5); player.setHp(8); player.setJump(10);		
		player.setSexo(hm); player.setNome(nome); player.setSpeed(10);
		player.setXp(25);
		
		player= new Player("Jõao", hm, 1, 60 ,60, null, ObjectId.Player);
		
		player.validaPlayer(hm);
		player.validaPlayer(ml);
		player.validaPlayer(in);
		
		System.out.println(player.getStatus());
		player.addXp(250);
		
		GrimorioItens  grimorio = new GrimorioItens();
		
		Item vest = grimorio.getGrimorioItens().get(44);
		Item arma = grimorio.getGrimorioItens().get(26);
		Item cons = grimorio.getGrimorioItens().get(14);
		
		ArrayList<Item> item = new ArrayList<Item>();
		
		player.adicionaItem(vest);
		player.adicionaItem(arma);
		for(int i=0;i<6;i++){
			player.adicionaItem(cons);
			item.add(cons);
		}
		
		player.setMochila(item);
		item.remove(0);
		player.setMochila(item);
		item = player.getMochila();
		
		player.listarMochila();
		
		int hp = player.hp;
		
		player.setHp(hp-7);
		
		for(int i=0;i<3;i++)
			player.verificarItem(cons);
		
		player.addDinheiro(998);
		player.addDinheiro(3);
		player.addDinheiro(1);
		
		player.removeDinheiro(998);
		player.removeDinheiro(2);
		
		System.out.println(player.getStatus() + " \n"+ player.getArma());
		
		player.setLvl(10);	
		
		System.out.printf("%s %s\nLvl: %d Atk: %d\nDef: %d Hp: %d/%d\nJump: %d Speed: %d\n" +
				"Concha: %d\nRoupa: %s\nArma: %s Xp: %d/%d", player.getNome(), player.getSexo(),
				player.getLvl(), player.getAtk(), player.getDef(), player.getHp(),
				player.getHpMax(), player.getJump(), player.getSpeed(), player.getConcha(),
				player.getRoupa(), player.getArma(), player.getXp(), player.getXpMax() );
		
		assertEquals(player.getDef(), 24);
	}

	@Test
	public void testGetConcha() {
		boolean ver=false;
		Player bob = new Player(ObjectId.Player);
		bob = new Player("Bob","homem",15, 60 ,60, null, ObjectId.Player);
		bob.setConcha(100);
		
		System.out.println(bob.getStatus());
		System.out.println("Conchas Bob "+bob.getConcha());
		Grimorio gri = new Grimorio();
		
		int concha =  gri.getGrimorioInimigos().get(5).getLoot().getConchas();
		gri.getGrimorioInimigos().get(5).getLoot().listarLoot();
		System.out.println("Conchas: "+concha);
		bob.addDinheiro(concha);

		concha = gri.getGrimorioInimigos().get(5).getLoot().getItem().getValor();
		System.out.println("Você vai comprar 1:\n"+gri.getGrimorioInimigos().get(5).getLoot().getItem());
		
		//bob.setConcha(1);
		bob.removeDinheiro(concha);
		System.out.println("Conchas Bob "+bob.getConcha());
		
		if(bob.getConcha()!=0){
			ver=true;
		}
		
		assertTrue(ver);
	}
}
