package game.entidade.grimorio;

//import game.entidade.Criar;
//import game.entidade.Dinheiro;
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
		
		//Criar batalha = new Criar();
		
		Item lootI;
		GrimorioItens grimorioI = new GrimorioItens();
		InimigoEvento[] inimigo = new InimigoEvento[10];
		
		int lootD;
		Loot loot2;
		int novoValorAtributo;
		int novoValorAtributo2;
		
		
		//inimigos lvl1  posicao na lista 0-4
		
		 /** Inimigos Danilo \o/ */
		/** 	  Savana	    */
		
			inimigo[0] = new InimigoEvento("Miaci",1,"Guaxinim Vermelho");
			inimigo[0].criarDescricao("Um animal pequeno e de aparencia adorável, porem não deixe as aparencias\n" +
					"te enganarem. Normalmente encontra-se no topo de árvores procurando novas presas.\n" +
					"\"Miacis\"");
			inimigo[0].setSpe(6);
			inimigo[0].setAtk(3);
			lootD = (rand.Random(0, 2));
			
			if(rand()==0){//Maçã
				lootI =  grimorioI.getGrimorioItens().get(0);
			}else if(rand()==1){//Cinto de Pelagem Vermelha
				lootI =  grimorioI.getGrimorioItens().get(42);
			}else if(rand()==2){//Uvas
				lootI =  grimorioI.getGrimorioItens().get(1);
			}else{//Maçã
				lootI =  grimorioI.getGrimorioItens().get(0);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[0]);
			inimigo[0].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[1] = new InimigoEvento("Casulo",1,"Desconhecido");
			inimigo[1].criarDescricao("Desconhecida sua origem e o conteúdo desse casulo.\n" +
					"A única coisa certa sobre ele é que não pode se mover.\n");
			inimigo[1].setSpe(0);
			inimigo[1].setAtk(0);
			inimigo[1].setDef(rand.Random(3, 5));
			lootD = (rand.Random(0, 2));
			
			//Gosma
			lootI =  grimorioI.getGrimorioItens().get(15);
			
			loot2 = new Loot(lootD, lootI, inimigo[1]);
			inimigo[1].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[2] = new InimigoEvento("Besouro Chifrudo",2,"Inseto Grande");
			inimigo[2].criarDescricao("Herbivoro de natureza dócil, porém muito territorialista.\n" +
					"Tome cuidado para não adentrar seu territorio sem um convite, pois\n" +
					"seu chifre pontudo deve perfurar qualquer coisa em seu caminho.");
			lootD = (rand.Random(0, 3));
			
			if(rand()==0){//Uvas
				lootI =  grimorioI.getGrimorioItens().get(1);
			}else if(rand()==1){//Batata
				lootI =  grimorioI.getGrimorioItens().get(2);
			}else{//Maçã
				lootI =  grimorioI.getGrimorioItens().get(0);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[2]);
			inimigo[2].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[3] = new InimigoEvento("Lagarto de Caninos",2,"Reptil Hibrido");
			inimigo[3].criarDescricao("Uma criatura que se encontra no meio da cadeia evolutiva\n" +
					"entre um Reptil e um Mamifero. Então é bom tomar cuidado\n" +
					"com suas presas venenosas e sua perspicácia. \"Dimetrodon\"");
			inimigo[3].setAtk(10);
			lootD = (rand.Random(1, 3));
			
			if(rand()==0){//Carne Envenenada
				lootI =  grimorioI.getGrimorioItens().get(10);
			}else if(rand()==1){//Lagarto Assado
				lootI =  grimorioI.getGrimorioItens().get(11);
			}else if(rand()==2){//Presa Venenosa
				lootI =  grimorioI.getGrimorioItens().get(28);
			}else{//Carne Envenenada
				lootI =  grimorioI.getGrimorioItens().get(10);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[3]);
			inimigo[3].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[4] = new InimigoEvento("Rinoceronte Dente-de-Flecha",2,"Mamifero Grande");
			inimigo[4].criarDescricao("Mamifero de grande porte natural de pastos.\n" +
					"Seu grande porte e dentes, tanto pequenos quanto afiados,\n" +
					"o tornam um perigo para qualquer um. \"Toxodonte\"");
			inimigo[4].setAtk(9);
			lootD = (rand.Random(1, 3));
			
			if(rand()==0){//Punhal de Marfim
				lootI =  grimorioI.getGrimorioItens().get(29);
			}else if(rand()==1){//Maçã
				lootI =  grimorioI.getGrimorioItens().get(0);
			}else if(rand()==2){//Punhal de Marfim
				lootI =  grimorioI.getGrimorioItens().get(29);
			}else{//Lingua de Rinoceronte
				lootI =  grimorioI.getGrimorioItens().get(12);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[4]);
			inimigo[4].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[5] = new InimigoEvento("Hiena de Escudo",3,"Mamifero Grande");
			inimigo[5].criarDescricao("Predador tipíco da Savana. Graças a sua pele grossa como\n" +
					"um escudo e dentes afiados, esse bixo se torna um canditado\n" +
					"ideal para te deixar em pedaços. \"Pachyaena\"");
			inimigo[5].setDef(9);
			lootD = (rand.Random(2, 3));
			
			if(rand()==0){//Colete de Esperço
				lootI =  grimorioI.getGrimorioItens().get(43);
			}else if(rand()==1){//Punhal de Marfim
				lootI =  grimorioI.getGrimorioItens().get(29);
			}else{//Batata
				lootI =  grimorioI.getGrimorioItens().get(2);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[5]);
			inimigo[5].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[6] = new InimigoEvento("Tatu Carapaça",3,"Mamifero Gigante");
			inimigo[6].criarDescricao("Criatura herbivora e pacata com uma gigantesca carapaça em suas costas.\n" +
					"Apesar de não ser muito ágil, sua defesa é formidável. - Pensando bem,\n" +
					"sua carapaça daria um bom teto para uma familia de 4 Neardentais.\n" +
					"\"Gliptodonte\"");
			inimigo[6].setDef(rand.Random(9, 12));
			inimigo[6].setHp(rand.Random(12, 15));
			inimigo[6].setSpe(9);
			lootD = (rand.Random(2, 4));
			
			if(rand()==0){//Farofa de Tatu
				lootI =  grimorioI.getGrimorioItens().get(13);
			}else if(rand()==1){
				lootI =  grimorioI.getGrimorioItens().get(13);
			}else if(rand()==2){//Batata
				lootI =  grimorioI.getGrimorioItens().get(2);
			}else{//Armadura de Placas
				lootI =  grimorioI.getGrimorioItens().get(44);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[6]);
			inimigo[6].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[7] = new InimigoEvento("Leão Listrado",4,"Felino Grande");
			inimigo[7].criarDescricao("Felino de pelagem listrada e presas gigantes.\n" +
					"Como a maioria dos felinos, essa criatura adora caçar\n" +
					"e brincar com suas presas antes de devora-las.\n" +
					"\"Machairodus\"");
			inimigo[7].setAtk(rand.Random(16, 18));
			inimigo[7].setSpe(21);
			lootD = (rand.Random(2, 5));
			
			if(rand()==0){//Manto Listrado
				lootI =  grimorioI.getGrimorioItens().get(45);
			}else if(rand()==1){
				lootI =  grimorioI.getGrimorioItens().get(45);
			}else if(rand()==2){//Bolota Roxa
				lootI =  grimorioI.getGrimorioItens().get(14);
			}else{//Maçã
				lootI =  grimorioI.getGrimorioItens().get(0);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[7]);
			inimigo[7].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[8] = new InimigoEvento("Lince Prateado",5,"Felino Grande");
			inimigo[8].criarDescricao("Felino ágil de pelagem prateada. Predador de\n" +
					"pequenos animais. \"Sivapanthera\"");
			inimigo[8].setAtk(18);
			inimigo[8].setSpe(rand.Random(24, 28));
			lootD = (rand.Random(3, 5));
			
			if(rand()<4){//Bife Linho
				lootI =  grimorioI.getGrimorioItens().get(17);
			}else{//Soqueira Prateada
				lootI =  grimorioI.getGrimorioItens().get(30);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[8]);
			inimigo[8].criarLoot(loot2);
		//--------------------------------------------------------------------------
			inimigo[9] = new InimigoEvento("Libelula Sanguinaria",7,"Inseto Gigante");
			inimigo[9].criarDescricao("Criatura de aparência inofensiva, mas de hábitos\n" +
					"asquerosos. Após investir sobre sua presa esse inseto\n" +
					"costuma sugar o sangue de suas vítimas, ainda com vida,\n" +
					"através de suas feridas adquiridas em batalha. - Talvez\n" +
					"tenha surgido de algum casulo por ai...");
			inimigo[9].setAtk(rand.Random(25, 28));
			inimigo[9].setHp(rand.Random(42,46));
			inimigo[9].setSpe(36);
			lootD = (rand.Random(2, 6));
			
			if(rand()<3){//Sopa Escarlate
				lootI =  grimorioI.getGrimorioItens().get(16);
			}else{//Bolota Roxa
				lootI =  grimorioI.getGrimorioItens().get(14);
			}
			
			loot2 = new Loot(lootD, lootI, inimigo[9]);
			inimigo[9].criarLoot(loot2);
			
		//--------------------------------------------------------------------------
			for(int i=0; i<10; i++)
				grimorioInimigos.add(inimigo[i]);
			
		/** Fim Inimigos Danilo */
		
		
		InimigoEvento inimigo1 = new InimigoEvento("Sid", 1, "Preguiça Pré-Historica" );
		inimigo1.criarDescricao("Uma criatura preguiçosa e lenta, que adora não fazer nada o dia inteiro " +
				"todo dia.\nNormalmente encontrada no topo de árvores, cuidado para não " +
				"acabar esmagado por uma Preguiça sonolenta.");
		inimigo1.setSpe(1);
		
		lootD = (rand.Random(0, 2));
		
		if(rand()==0){//Garra de Preguiça
			lootI =  grimorioI.getGrimorioItens().get(19);
		}else if(rand()==1){//Tanga de Preguiça
			lootI =  grimorioI.getGrimorioItens().get(31);
		}else if(rand()==2){//Cinto de Preguiça
			lootI =  grimorioI.getGrimorioItens().get(32);
		}else{//Bife de Preguiça
			lootI =  grimorioI.getGrimorioItens().get(3);
		}
				
		loot2 = new Loot(lootD, lootI, inimigo1);
		inimigo1.criarLoot(loot2);
		grimorioInimigos.add(inimigo1);
		
		//inimigos lvl2  posicao na lista 5-9
		InimigoEvento inimigo2 = new InimigoEvento("Jav Baby", 2, "Javali" );
		inimigo2.criarDescricao("Um animal normalmente dócil, provavelmente por se tratar de\n" +
				"uma criatura inocente, porém facilmente se assusta com a chegada de entranhos." +
				"\nSeria uma atrocidade alguem bater nesse bixo.");
		
		novoValorAtributo = inimigo2.getDef() + 1;
		inimigo2.setDef(novoValorAtributo);
		lootD = (rand.Random(0, 3));	

		if(rand()==0){//Dente Danificado de Javali
			lootI =  grimorioI.getGrimorioItens().get(20);
		}else if(rand()==1){//Dente de Javali
			lootI =  grimorioI.getGrimorioItens().get(21);
		}else if(rand()==2){//Luva de Javali
			lootI =  grimorioI.getGrimorioItens().get(33);
		}else{//Batata
			lootI =  grimorioI.getGrimorioItens().get(2);
		}
		
		loot2 = new Loot(lootD,lootI, inimigo2);
		inimigo2.criarLoot(loot2);
		grimorioInimigos.add(inimigo2);
		
		//inimigos lvl3  posicao na lista 10-14
		InimigoEvento inimigo3 = new InimigoEvento("Jav Teen", 3, "Javali" );
		novoValorAtributo = inimigo3.getDef() + 1;
		inimigo3.setDef(novoValorAtributo);
		lootD = (rand.Random(1, 3));
		
		if(rand()==0){//Dente Danificado de Javali
			lootI = grimorioI.getGrimorioItens().get(20);
		}else if(rand()==1){//Dente de Javali
			lootI = grimorioI.getGrimorioItens().get(21);
		}else if(rand()==2){//Bota de Javali
			lootI = grimorioI.getGrimorioItens().get(34);
		}else{//Ensopado
			lootI = grimorioI.getGrimorioItens().get(5);
		}
		
		loot2 = new Loot(lootD, lootI, inimigo3);
		inimigo3.criarLoot(loot2);
		grimorioInimigos.add(inimigo3);
		
		//inimigos lvl4  posicao na lista 15-19
		InimigoEvento inimigo4 = new InimigoEvento("Jav Adult", 4, "Javali" );
		novoValorAtributo = inimigo4.getDef() + 1;
		inimigo4.setDef(novoValorAtributo);
		lootD = (rand.Random(1, 5));
		
		if(rand()==0){
	
		}else if(rand()==1){
	
		}else if(rand()==2){//Casaco de Javali
			lootI = grimorioI.getGrimorioItens().get(35);
		}else{//Coxa Grande de Javali
			lootI = grimorioI.getGrimorioItens().get(6);
		}
		
		loot2 = new Loot(lootD, lootI, inimigo4);
		inimigo4.criarLoot(loot2);
		grimorioInimigos.add(inimigo4);
		
		//inimigos lvl5  posicao na lista 20-24
		InimigoEvento inimigo5 = new InimigoEvento("Velociraptor", 5, "Dinossauro" );
		novoValorAtributo = inimigo5.getSpe() + 15;
		inimigo5.setSpe(novoValorAtributo);
		
		//lootI = new Arma("garra de velocirraptor", 0004, 3);
		lootD = (rand.Random(2, 6));	

		if(rand()==0){//Garra de Velociraptor
			lootI = grimorioI.getGrimorioItens().get(22);
		}else if(rand()<3){//Elmo de Velociraptor
			lootI = grimorioI.getGrimorioItens().get(36);
		}else{//Ensopado
			lootI = grimorioI.getGrimorioItens().get(5);
		}
		
		loot2 = new Loot(lootD, lootI, inimigo5);
		inimigo5.criarLoot(loot2);
		grimorioInimigos.add(inimigo5);
		
		//inimigos lvl6  posicao na lista 25-29
		InimigoEvento inimigo6 = new InimigoEvento("Many Baby", 6, "Mamute" );
		novoValorAtributo = inimigo6.getDef()+3;
		novoValorAtributo2 = inimigo6.getSpe()-4;
		inimigo6.setDef(novoValorAtributo);
		inimigo6.setSpe(novoValorAtributo2);
		lootD = (rand.Random(1, 5));
		
		if(rand()==0){//Presa de Mamute
			lootI = grimorioI.getGrimorioItens().get(23);
		}else if(rand()<3){//Bota de Mamute
			lootI = grimorioI.getGrimorioItens().get(38);
		}else{//Ensopado
			lootI = grimorioI.getGrimorioItens().get(5);
		}
		
		loot2 = new Loot(lootD, lootI, inimigo6);
		inimigo6.criarLoot(loot2);
		grimorioInimigos.add(inimigo6);
		
		//inimigos lvl7  posicao na lista 30-34
		InimigoEvento inimigo7 = new InimigoEvento("Many Teen", 7, "Mamute" );
		novoValorAtributo = inimigo7.getDef()+3;
		novoValorAtributo2 = inimigo7.getSpe()-6;
		inimigo7.setDef(novoValorAtributo);
		inimigo7.setSpe(novoValorAtributo2);
		lootD = (rand.Random(1, 6));
		
		if(rand()==2){//Casaco de Mamute
			lootI = grimorioI.getGrimorioItens().get(37);
		}else{
			
		}
		
		loot2 = new Loot(lootD, lootI, inimigo7);
		inimigo7.criarLoot(loot2);
		grimorioInimigos.add(inimigo7);
		
		//inimigos lvl8  posicao na lista 35-39
		InimigoEvento inimigo8 = new InimigoEvento("Many", 8, "Mamute" );
		novoValorAtributo = inimigo8.getDef()+3;
		novoValorAtributo2 = inimigo8.getSpe()-8;
		inimigo8.setDef(novoValorAtributo);
		inimigo8.setSpe(novoValorAtributo2);
		lootD = (rand.Random(2, 7));
		
		if(rand()==0){//Casaco de Mamute
			lootI = grimorioI.getGrimorioItens().get(37);
		}else if(rand()==1){//Femur de Mamute
			lootI = grimorioI.getGrimorioItens().get(25);
		}else if(rand()==2){//Manto de Mamute
			lootI = grimorioI.getGrimorioItens().get(39);
		}else{//Guisado de Mamute
			lootI = grimorioI.getGrimorioItens().get(7);
		}
		loot2 = new Loot(lootD, lootI, inimigo8);
		inimigo8.criarLoot(loot2);
		grimorioInimigos.add(inimigo8);
		
		//inimigos lvl9  posicao na lista 40-44
		InimigoEvento inimigo9 = new InimigoEvento("Diego", 9, "Tigre Dentes-de-Sabre" );
		novoValorAtributo = inimigo9.getSpe()+10;
		inimigo9.setSpe(novoValorAtributo);
		novoValorAtributo2 = inimigo9.getAtk()+5;
		inimigo9.setAtk(novoValorAtributo2);
		lootD = (rand.Random(4, 8));

		if(rand()<2){//Pele de Dentes-de-Sabre
			lootI = grimorioI.getGrimorioItens().get(41);
		}else if(rand()<4){//Dentes de Sabre
			lootI = grimorioI.getGrimorioItens().get(24);
		}else{//Maçã
			lootI = grimorioI.getGrimorioItens().get(0);
		}
		
		loot2 = new Loot(lootD, lootI, inimigo9);
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
		lootD = rand.Random(5, 10);
		
		if(rand()==0){//Armadura de Javali Gigante
			lootI = grimorioI.getGrimorioItens().get(40);
		}else if(rand()==1){//Presa de Javali Gigante
			lootI = grimorioI.getGrimorioItens().get(27);
		}else if(rand()==2){//Armadura de Javali Gigante
			lootI = grimorioI.getGrimorioItens().get(40);
		}else{//Javali Assado
			lootI = grimorioI.getGrimorioItens().get(9);
		}
		
		loot2 = new Loot(lootD, lootI, inimigo10);
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
	
	public void listarTudo(){
		for(int i = 0; i < grimorioInimigos.size(); i++){
			System.out.println(grimorioInimigos.get(i));
			System.out.println(grimorioInimigos.get(i).descricao());
			grimorioInimigos.get(i).listarLoot();
			
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
	
