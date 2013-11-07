package game.entidade.grimorio;

import game.entidade.Criar;
import game.entidade.Dinheiro;
import game.entidade.InimigoEvento;
import game.entidade.Item;
import game.entidade.Loot;
import game.entidade.Rand;

import java.util.Random;
import java.util.ArrayList;

public class Grimorio {
	
	private ArrayList<InimigoEvento> grimorioInimigos = new ArrayList<InimigoEvento>();  
	private Rand rand = new Rand();
	
	public Grimorio() { 
		
		Criar batalha = new Criar();
		
		Item lootI;
		GrimorioItens grimorioI = new GrimorioItens();
		
		Dinheiro lootD;
		Loot loot2;
		int novoValorAtributo;
		int novoValorAtributo2;
		
		
		//inimigos lvl1  posicao na lista 0-4
		InimigoEvento inimigo1 = new InimigoEvento("Sid", 1, "Preguiça Pré-Historica" );
		inimigo1.criarDescricao("Uma criatura preguiçosa e lenta, que adora não fazer nada o dia inteiro " +
				"todo dia.\nNormalmente encontrada no topo de árvores, cuidado para não " +
				"acabar esmagado por uma Preguiça sonolenta.");
		
		lootD = new Dinheiro(rand.Random(0, 2));
		
		if(rand()==0){
			lootI =  grimorioI.getGrimorioItens().get(11);
		}else if(rand()==1){
			lootI =  grimorioI.getGrimorioItens().get(20);
		}else if(rand()==2){
			lootI =  grimorioI.getGrimorioItens().get(21);
		}else{
			lootI =  grimorioI.getGrimorioItens().get(3);
		}
				
		loot2 = new Loot(lootD,lootI);
		loot2.setInimigo(inimigo1);
		inimigo1.criarLoot(loot2);
		grimorioInimigos.add(inimigo1);
		
		//inimigos lvl2  posicao na lista 5-9
		InimigoEvento inimigo2 = new InimigoEvento("Jav Baby", 2, "Javali" );
		inimigo2.criarDescricao("Um animal normalmente dócil, provavelmente por se tratar de\n" +
				"uma criatura inocente, porém facilmente se assusta com a chegada de entranhos." +
				"\nSeria uma atrocidade alguem bater nesse bixo.");
		
		novoValorAtributo = inimigo2.getDef() + 1;
		inimigo2.setDef(novoValorAtributo);
		lootD = new Dinheiro(rand.Random(0, 3));	

		if(rand()==0){
			lootI =  grimorioI.getGrimorioItens().get(12);
		}else if(rand()==1){
			lootI =  grimorioI.getGrimorioItens().get(13);
		}else if(rand()==2){
			lootI =  grimorioI.getGrimorioItens().get(22);
		}else{
			lootI =  grimorioI.getGrimorioItens().get(2);
		}
		
		loot2 = new Loot(lootD,lootI);
		loot2.setInimigo(inimigo2);
		inimigo2.criarLoot(loot2);
		grimorioInimigos.add(inimigo2);
		
		//inimigos lvl3  posicao na lista 10-14
		InimigoEvento inimigo3 = new InimigoEvento("Jav Teen", 3, "Javali" );
		novoValorAtributo = inimigo3.getDef() + 1;
		inimigo3.setDef(novoValorAtributo);
		lootD = new Dinheiro(rand.Random(1, 3));
		
		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(12);
		}else if(rand()==1){
			lootI = grimorioI.getGrimorioItens().get(13);
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(23);
		}else{
			lootI = grimorioI.getGrimorioItens().get(5);
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo3);
		inimigo3.criarLoot(loot2);
		grimorioInimigos.add(inimigo3);
		
		//inimigos lvl4  posicao na lista 15-19
		InimigoEvento inimigo4 = new InimigoEvento("Jav Adult", 4, "Javali" );
		novoValorAtributo = inimigo4.getDef() + 1;
		inimigo4.setDef(novoValorAtributo);
		lootD = new Dinheiro(rand.Random(1, 5));
		
		if(rand()==0){
	
		}else if(rand()==1){
	
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(24);
		}else{
			lootI = grimorioI.getGrimorioItens().get(6);
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo4);
		inimigo4.criarLoot(loot2);
		grimorioInimigos.add(inimigo4);
		
		//inimigos lvl5  posicao na lista 20-24
		InimigoEvento inimigo5 = new InimigoEvento("Velociraptor", 5, "Dinossauro" );
		novoValorAtributo = inimigo5.getSpe() + 15;
		inimigo5.setSpe(novoValorAtributo);
		
		//lootI = new Arma("garra de velocirraptor", 0004, 3);
		lootD = new Dinheiro(rand.Random(2, 6));	

		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(14);
		}else if(rand()<3){
			lootI = grimorioI.getGrimorioItens().get(25);
		}else{
			lootI = grimorioI.getGrimorioItens().get(6);
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo5);
		inimigo5.criarLoot(loot2);
		grimorioInimigos.add(inimigo5);
		
		//inimigos lvl6  posicao na lista 25-29
		InimigoEvento inimigo6 = new InimigoEvento("Many Baby", 6, "Mamute" );
		novoValorAtributo = inimigo6.getDef()+3;
		novoValorAtributo2 = inimigo6.getSpe()-4;
		inimigo6.setDef(novoValorAtributo);
		inimigo6.setSpe(novoValorAtributo2);
		lootD = new Dinheiro(rand.Random(1, 5));
		
		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(15);
		}else if(rand()<3){
			lootI = grimorioI.getGrimorioItens().get(27);
		}else{
			lootI = grimorioI.getGrimorioItens().get(5);
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo6);
		inimigo6.criarLoot(loot2);
		grimorioInimigos.add(inimigo6);
		
		//inimigos lvl7  posicao na lista 30-34
		InimigoEvento inimigo7 = new InimigoEvento("many teen", 7, "mamute" );
		novoValorAtributo = inimigo7.getDef()+3;
		novoValorAtributo2 = inimigo7.getSpe()-6;
		inimigo7.setDef(novoValorAtributo);
		inimigo7.setSpe(novoValorAtributo2);
		lootD = new Dinheiro(rand.Random(1, 6));
		
		if(rand()==0){
	
		}else if(rand()==1){
	
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(26);
		}else{
			
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo7);
		inimigo7.criarLoot(loot2);
		grimorioInimigos.add(inimigo7);
		
		//inimigos lvl8  posicao na lista 35-39
		InimigoEvento inimigo8 = new InimigoEvento("many", 8, "mamute" );
		novoValorAtributo = inimigo8.getDef()+3;
		novoValorAtributo2 = inimigo8.getSpe()-8;
		inimigo8.setDef(novoValorAtributo);
		inimigo8.setSpe(novoValorAtributo2);
		lootD = new Dinheiro(rand.Random(2, 7));
		
		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(26);
		}else if(rand()==1){
			lootI = grimorioI.getGrimorioItens().get(17);
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(28);
		}else{
			lootI = grimorioI.getGrimorioItens().get(7);
		}
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo8);
		inimigo8.criarLoot(loot2);
		grimorioInimigos.add(inimigo8);
		
		//inimigos lvl9  posicao na lista 40-44
		InimigoEvento inimigo9 = new InimigoEvento("diego", 9, "tigre-dente-de-sabre" );
		novoValorAtributo = inimigo9.getSpe()+10;
		inimigo9.setSpe(novoValorAtributo);
		novoValorAtributo2 = inimigo9.getAtk()+5;
		inimigo9.setAtk(novoValorAtributo2);
		lootD = new Dinheiro(rand.Random(4, 8));

		if(rand()<2){
			lootI = grimorioI.getGrimorioItens().get(30);
		}else if(rand()<4){
			lootI = grimorioI.getGrimorioItens().get(16);
		}else{
			lootI = grimorioI.getGrimorioItens().get(0);
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo9);
		inimigo9.criarLoot(loot2);
		grimorioInimigos.add(inimigo9);		
		
		//inimigos lvl10  posicao na lista 45-49
		InimigoEvento inimigo10 = new InimigoEvento("javali gigante", 10, "javali/boss" );
		inimigo10.criarDescricao("Por muito tempo acreditaram que sua existência era apenas uma lenda\n" +
				"contada pra assustar as crianças e os mais covades. Sua lenda dizia que um Javali gigantesco\n" +
				"uma vez usurpou o titulo do rei da montanha, o Pterodactil, desde então ele vive no topo,\n" +
				"vigiando e guardando o seu trono de possíveis invasores." +
				"\nSe algum dia o vir corra - corra e não olhe pra trás - poderá ser sua ultima visão");

		
		novoValorAtributo = inimigo10.getAtk()+10;
		novoValorAtributo2 = inimigo10.getHp()+20;
		inimigo10.setAtk(novoValorAtributo);
		inimigo10.setHp(novoValorAtributo2);
		novoValorAtributo = inimigo10.getSpe()-20;
		inimigo10.setSpe(novoValorAtributo);
		novoValorAtributo2 = inimigo10.getDef()+10;
		inimigo10.setDef(novoValorAtributo2);		
		lootD = new Dinheiro(5);
		
		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(29);
		}else if(rand()==1){
			lootI = grimorioI.getGrimorioItens().get(19);
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(29);
		}else{
			lootI = grimorioI.getGrimorioItens().get(9);
		}
		
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo10);
		inimigo10.criarLoot(loot2);
		grimorioInimigos.add(inimigo10);
		
	}
	
	public ArrayList<InimigoEvento> getGrimorioInimigos() {
		return grimorioInimigos;
	}

	public void listarGrimorio(){
		for(int i = 0; i < grimorioInimigos.size(); i++){
			System.out.println(grimorioInimigos.get(i));
			
		}
	}
	
	private int rand(){
		Random rand = new Random();
		int var;
		//20% de chance para cada item
		var=rand.nextInt(5);
		return var;
	}	
	
}
	
