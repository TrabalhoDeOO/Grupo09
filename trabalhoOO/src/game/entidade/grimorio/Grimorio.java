package game.entidade.grimorio;

import game.entidade.Arma;
import game.entidade.Criar;
import game.entidade.Dinheiro;
import game.entidade.InimigoEvento;
import game.entidade.Loot;
import game.entidade.Vestimenta;

import java.util.ArrayList;

public class Grimorio {
	
	private ArrayList<InimigoEvento> grimorioInimigos = new ArrayList<InimigoEvento>();  

	
	public Grimorio() { 
		
		Criar batalha = new Criar();
		int senha1 = 1234;
		Arma lootI;
		Vestimenta lootI2;
		Dinheiro lootD;
		Loot loot2;
		int novoValorAtributo;
		int novoValorAtributo2;
		
		//inimigos lvl1  posicao na lista 0-4
		InimigoEvento inimigo1 = new InimigoEvento("sid", 1, "pregui�a pre-historica" );
		lootI2 = new Vestimenta("pele de pregui�a", 0001, 2);
		lootD = new Dinheiro("pequena", 5);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI2);
		loot2 = new Loot(lootD, lootI2);
		loot2.setInimigo(inimigo1);
		grimorioInimigos.add(inimigo1);
		
		//inimigos lvl2  posicao na lista 5-9
		InimigoEvento inimigo2 = new InimigoEvento("jav baby", 2, "javali" );
		novoValorAtributo = inimigo2.getDef() + 1;
		inimigo2.setDef(novoValorAtributo);
		
		lootI2 = new Vestimenta("couro de javali", 0002, 2);
		lootD = new Dinheiro("pequena", 20);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI2);
		loot2 = new Loot(lootD, lootI2);
		loot2.setInimigo(inimigo2);
		grimorioInimigos.add(inimigo2);
		
		//inimigos lvl3  posicao na lista 10-14
		InimigoEvento inimigo3 = new InimigoEvento("jav teen", 3, "javali" );
		novoValorAtributo = inimigo3.getDef() + 1;
		inimigo3.setDef(novoValorAtributo);
		
		lootI = new Arma("dente de javali", 0003, 2);
		lootD = new Dinheiro("pequena", 50);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo3);
		grimorioInimigos.add(inimigo3);
		
		//inimigos lvl4  posicao na lista 15-19
		InimigoEvento inimigo4 = new InimigoEvento("jav adult", 4, "javali" );
		novoValorAtributo = inimigo4.getDef() + 1;
		inimigo4.setDef(novoValorAtributo);
		
		lootI = new Arma("dente de javali", 0003, 2);
		lootD = new Dinheiro("pequena", 40);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo4);
		grimorioInimigos.add(inimigo4);
		
		//inimigos lvl5  posicao na lista 20-24
		InimigoEvento inimigo5 = new InimigoEvento("veloc", 5, "velociraptor" );
		novoValorAtributo = inimigo5.getSpe() + 5;
		inimigo5.setSpe(novoValorAtributo);
		
		lootI = new Arma("garra de velocirraptor", 0004, 3);
		lootD = new Dinheiro("pequena", 50);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo5);
		grimorioInimigos.add(inimigo5);
		
		//inimigos lvl6  posicao na lista 25-29
		InimigoEvento inimigo6 = new InimigoEvento("many baby", 6, "mamute" );
		novoValorAtributo = inimigo6.getDef()+3;
		novoValorAtributo2 = inimigo6.getSpe()-3;
		inimigo6.setDef(novoValorAtributo);
		inimigo6.setSpe(novoValorAtributo2);
		
		lootI2 = new Vestimenta("couro de mamute bebe", 0005, 3);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo6);
		
		grimorioInimigos.add(inimigo6);
		
		//inimigos lvl7  posicao na lista 30-34
		InimigoEvento inimigo7 = new InimigoEvento("many teen", 7, "mamute" );
		novoValorAtributo = inimigo7.getDef()+3;
		novoValorAtributo2 = inimigo7.getSpe()-4;
		inimigo7.setDef(novoValorAtributo);
		inimigo7.setSpe(novoValorAtributo2);
		
		lootI2 = new Vestimenta("couro de mamute bebe", 0005, 4);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo7);
		grimorioInimigos.add(inimigo7);
		
		//inimigos lvl8  posicao na lista 35-39
		InimigoEvento inimigo8 = new InimigoEvento("many", 8, "mamute" );
		novoValorAtributo = inimigo8.getDef()+3;
		novoValorAtributo2 = inimigo8.getSpe()-5;
		inimigo8.setDef(novoValorAtributo);
		inimigo8.setSpe(novoValorAtributo2);
		
		lootI = new Arma("presa de mamute", 0005, 3);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo8);
		grimorioInimigos.add(inimigo8);
		
		//inimigos lvl9  posicao na lista 40-44
		InimigoEvento inimigo9 = new InimigoEvento("diego", 9, "tigre-dente-de-sabre" );
		novoValorAtributo = inimigo9.getSpe()+4;
		inimigo9.setSpe(novoValorAtributo);
		novoValorAtributo2 = inimigo9.getAtk()+5;
		inimigo9.setAtk(novoValorAtributo2);
		
		lootI = new Arma("dente-de-sabre", 0005, 4);
		lootD = new Dinheiro("pequena", 60);
		batalha.criarDinheiro(senha1, senha1, lootD);
		batalha.criarItem(senha1, senha1, "arma", lootI);
		loot2 = new Loot(lootD, lootI);
		loot2.setInimigo(inimigo9);
		grimorioInimigos.add(inimigo9);
		
		//inimigos lvl10  posicao na lista 45-49
		InimigoEvento inimigo10 = new InimigoEvento("javali gigante", 10, "javali/boss" );
		novoValorAtributo = inimigo10.getAtk()+10;
		novoValorAtributo2 = inimigo10.getHp()+20;
		inimigo10.setAtk(novoValorAtributo);
		inimigo10.setHp(novoValorAtributo2);
		novoValorAtributo = inimigo10.getSpe()-5;
		inimigo10.setSpe(novoValorAtributo);
		
		grimorioInimigos.add(inimigo10);
		
		// TODO Auto-generated constructor stub
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
	

}
