package game.entidade.grimorio;

import game.entidade.Criar;
import game.entidade.Dinheiro;
import game.entidade.InimigoEvento;
import game.entidade.Item;
import game.entidade.Loot;

import java.util.Random;
import java.util.ArrayList;

public class Grimorio {
	
	private ArrayList<InimigoEvento> grimorioInimigos = new ArrayList<InimigoEvento>();  
	
	
	public Grimorio() { 
		
		Criar batalha = new Criar();
		int senha1 = 1234;
		Item lootI;
		GrimorioItens grimorioI = new GrimorioItens();
		
		Dinheiro lootD;
		Loot loot2;
		int novoValorAtributo;
		int novoValorAtributo2;
		
		
		//inimigos lvl1  posicao na lista 0-4
		InimigoEvento inimigo1 = new InimigoEvento("sid", 1, "pregui�a pre-historica" );
<<<<<<< HEAD
		//lootI2 = new Vestimenta("pele de pregui�a", 0001, 2);
		
		
		//grimorioI.getGrimorioItens().get(25);
	/*
=======
>>>>>>> cdee08f284f38d87ce44d203e00fd0d48e96e495
		lootD = new Dinheiro("pequena", 5);
		batalha.criarDinheiro(senha1, senha1, "pequena", 5);
		
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
		InimigoEvento inimigo2 = new InimigoEvento("jav baby", 2, "javali" );
		novoValorAtributo = inimigo2.getDef() + 1;
		inimigo2.setDef(novoValorAtributo);
		lootD = new Dinheiro("pequena", 20);
		batalha.criarDinheiro(senha1, senha1, "pequena", 20);	

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
		InimigoEvento inimigo3 = new InimigoEvento("jav teen", 3, "javali" );
		novoValorAtributo = inimigo3.getDef() + 1;
		inimigo3.setDef(novoValorAtributo);
		lootD = new Dinheiro("pequena", 30);
		batalha.criarDinheiro(senha1, senha1, "pequena", 30);
		
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
		InimigoEvento inimigo4 = new InimigoEvento("jav adult", 4, "javali" );
		novoValorAtributo = inimigo4.getDef() + 1;
		inimigo4.setDef(novoValorAtributo);
		lootD = new Dinheiro("pequena", 40);
		batalha.criarDinheiro(senha1, senha1, "pequena", 40);
		
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
		InimigoEvento inimigo5 = new InimigoEvento("veloc", 5, "velociraptor" );
		novoValorAtributo = inimigo5.getSpe() + 5;
		inimigo5.setSpe(novoValorAtributo);
		
		//lootI = new Arma("garra de velocirraptor", 0004, 3);
		lootD = new Dinheiro("pequena", 50);
		batalha.criarDinheiro(senha1, senha1, "pequena", 50);	

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
		InimigoEvento inimigo6 = new InimigoEvento("many baby", 6, "mamute" );
		novoValorAtributo = inimigo6.getDef()+3;
		novoValorAtributo2 = inimigo6.getSpe()-3;
		inimigo6.setDef(novoValorAtributo);
		inimigo6.setSpe(novoValorAtributo2);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, "pequena", 60);
		
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
		novoValorAtributo2 = inimigo7.getSpe()-4;
		inimigo7.setDef(novoValorAtributo);
		inimigo7.setSpe(novoValorAtributo2);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, "pequena", 60);

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
		novoValorAtributo2 = inimigo8.getSpe()-5;
		inimigo8.setDef(novoValorAtributo);
		inimigo8.setSpe(novoValorAtributo2);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, "pequena", 60);
		
		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(26);
		}else if(rand()==1){
			lootI = grimorioI.getGrimorioItens().get(17);
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(28);
		}else{
			lootI = grimorioI.getGrimorioItens().get(9);
		}
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo8);
		inimigo8.criarLoot(loot2);
		grimorioInimigos.add(inimigo8);
		
		//inimigos lvl9  posicao na lista 40-44
		InimigoEvento inimigo9 = new InimigoEvento("diego", 9, "tigre-dente-de-sabre" );
		novoValorAtributo = inimigo9.getSpe()+4;
		inimigo9.setSpe(novoValorAtributo);
		novoValorAtributo2 = inimigo9.getAtk()+5;
		inimigo9.setAtk(novoValorAtributo2);
		lootD = new Dinheiro("media", 6);
		batalha.criarDinheiro(senha1, senha1, "media", 6);
	
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
		novoValorAtributo = inimigo10.getAtk()+10;
		novoValorAtributo2 = inimigo10.getHp()+20;
		inimigo10.setAtk(novoValorAtributo);
		inimigo10.setHp(novoValorAtributo2);
		novoValorAtributo = inimigo10.getSpe()-5;
		inimigo10.setSpe(novoValorAtributo);
		novoValorAtributo2 = inimigo10.getDef()+10;
		inimigo10.setDef(novoValorAtributo2);		
		lootD = new Dinheiro("grande", 5);
		batalha.criarDinheiro(senha1, senha1, "grande", 5);
		
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
		*/
	}
	
	public ArrayList<InimigoEvento> getGrimorioInimigos() {
		return grimorioInimigos;
	}

	public void listarGrimorio(){
		for(int i = 0; i < grimorioInimigos.size(); i++){
			System.out.println(grimorioInimigos.get(i).nome + " " +  grimorioInimigos.get(i).tipo + " lvl " + grimorioInimigos.get(i).lvl + " hp: " 
					+ grimorioInimigos.get(i).hp + " atk: " + grimorioInimigos.get(i).atk + " def: " + grimorioInimigos.get(i).def + " spe: " 
					+ grimorioInimigos.get(i).spe);
			
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
	
