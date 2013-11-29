/**
 * 
 */
package game.entidade;



import game.Game;
import game.Window;
import game.entidade.grimorio.JavaliBoss;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//import game.interfaces.*;


/**
 * @author Bruno
 *
 */
public class BatalhaTurno extends Game{
	
	private Random randomica = new Random(System.currentTimeMillis());
	Scanner scanIn = new Scanner(System.in);
	public boolean resultado;
	public int resultB = 1;
	
	

	/**
	 * 
	 */
	public BatalhaTurno() {
		this.resultado = false;
	}
	
	
	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	
	public int getResultB() {
		return resultB;
	}


	public void setResultB(int resultB) {
		this.resultB = resultB;
	}


	public Player batalha(Player player, InimigoEvento inimigo) throws NumberFormatException{
		
		Player player1 = player;
		InimigoEvento inimigo1 = new InimigoEvento(null);
		JavaliBoss inimigo2 = new JavaliBoss();
		
		
		
		
		int x = 0, y=0;
		int atkP, defP, hpP, escudoP;
		int atkI, defI, hpI, escudoI;
		int dano;
		
		int speedP, speedI;
		boolean fuga = false;
		//int novaxp;
		//Item item;
		int velholvl = player.lvl, novolvl;
		
		 
		int dadospeedI = randomica.nextInt(10)+1;
		int dadospeedP = randomica.nextInt(10)+1;
		
		inimigo1 = inimigo;
		
		Loot lootB = inimigo1.getLoot();
		
	
		
		atkP = player1.getAtk();
		defP = player1.getDef();
		hpP = player1.getHp();
		atkI = inimigo1.getAtk();
		defI = inimigo1.getDef();
		hpI = inimigo1.getHp();
		escudoP = 2*defP;
		escudoI = 2*defI;
		
		speedP = player1.getSpeed() + dadospeedP;
		speedI = inimigo1.getSpe() + dadospeedI;
		
		
		
		System.out.println("Voce encontrou um " + inimigo1.getTipo() + " lvl: " + inimigo1.getLvl() + "\n");
		System.out.println(inimigo1.descricao());
		
		System.out.println("speed inimigo : " + speedI + " speed player: " + speedP  + "\n");
		
		// TODO Player Ataca Primeiro
		if(speedP>speedI){
			
			System.out.println(player.getNome() + "- lvl:"+ player1.getLvl() + " hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
			System.out.println(inimigo.getTipo() + "- lvl:"+ inimigo1.getLvl() + " hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI );
			
			
			do{
				if(fuga == true){
					break;
				}
				int numeroGerado;
				
				// TODO verificao para evitar que inimigo fique atacando o escudo do player depois que chegar a 0
				
				if (escudoP==0){
					numeroGerado = randomica.nextInt(6) + 1;
				}else{
					numeroGerado = randomica.nextInt(9) + 1;
				}
				
				//ação player
				
				//System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp)" + player.getMochila().size() +" itens na mochila:");
				
				
				boolean teste1 = false;
				while (!teste1) {
					System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp)" + player.getMochila().size() +" itens na mochila" +
							" 5/fugir:");
					try {				
						scanIn = new Scanner(System.in);
						x = scanIn.nextInt();
						if (x>5|x<1){
							throw new java.lang.Exception();
						}
						teste1 = true;
						
					} catch (InputMismatchException e) {
						System.err.println("Entrada Invalida. Apenas numeros de 1 a 5");
						teste1 = false;
						
					}catch (Exception e){
						System.err.println("Entrada invalida!!!");
						teste1 = false;
					}
					
					if (player.getMochila().size()==0 & x == 4){
						System.err.println("Mochila Vazia!!!");
						teste1 = false;
					}
				}
				
				/**
				try{					
					if (player.getMochila().size()==0 & x == 4){
						throw new java.lang.Exception();
					}
				}catch (Exception e){
						do {
							System.err.println("Mochila Vazia!!!");
							System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp)" + player.getMochila().size() +" itens na mochila:");
							x = scanIn.nextInt();
						}while(x == 4);
				}
				*/
				if(fuga == true){
					break;
				}
				
				switch(x){
				case 1:
					//player atacando  diretamente
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					//verificacao se inimigo esta defendendo
					if(y == 1 | y == 2 | y == 0  | y == 3){
						//calculando dano
						dano = atkP - (escudoI/2);
						//verificando se o dano eh minimo (evitando dano negativo)
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano do hp
						hpI -= dano;
						//verificacao para evitar hp negativo
						if(hpI<0){
							hpI=0;
						}
						//imprimindo dano causado
						System.out.println("hp inimigo : -" + dano + "\n");
					
					}else if(y==3){
						
						//calculando dano
						dano = atkP - escudoI;
						//verificando se o dano eh minimo (evitando dano negativo)
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano do hp
						hpI -= dano;
						//verificacao para evitar hp negativo
						if(hpI<0){
							hpI=0;
						}
						//imprimindo dano causado
						System.out.println("hp inimigo : -" + dano + "\n");
					}
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					//player atacando escudo inimigo
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP);
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//verificando se inimigo esta defendendo
					if(y == 0 | y == 1 | y == 2 | y == 4){
						//calculando e subtraindo dano no escudo
						escudoI = escudoI - (atkP/2);
						//imprimindo dano no escudo
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
						
					}else if (y==3){
						//calculando e subtraindo dano no escudo
						escudoI = escudoI -(atkP/4);
						//imprimindo dano no escudo
						System.out.println("dano escudo inimigo : -" + atkP/4 + "\n");
					}
					//verificacao para evitar escudo negativo
					if (escudoI < 0){
						escudoI = 0;
					}
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP);
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					//player defendendo
					
					if (y==1){
						System.out.println("DANO OBSORVIDO");
					}
					//delay
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 4:
					int numeroDoAlimentoSelecionado = -1;
					
					
					
					if ( player.getMochila().size() >0){
						
						player.listarMochila();
						System.out.println("Voce deseja comer qual item?(insira apenas o numero que esta antes do nome do item)");
						
						teste1 = false;
						while (!teste1) {
							try {
								scanIn = new Scanner(System.in);
								numeroDoAlimentoSelecionado = scanIn.nextInt();
								while(numeroDoAlimentoSelecionado > player.getMochila().size()-1| numeroDoAlimentoSelecionado < 0){

									System.err.println("Entrada Invalida!!!!");
									player.listarMochila();												
									System.out.println("Voce deseja comer qual item?");
									numeroDoAlimentoSelecionado = scanIn.nextInt();

								}
								teste1 = true;
								
							} catch (InputMismatchException e) {
								System.err.println("Entrada Invalida.\nInsira apenas o numero que esta antes do nome do item");
								teste1 = false;
							}
						}
						
						player.setHp(hpP);
						player.verificarItem(player.getMochila().get(numeroDoAlimentoSelecionado));
						player.getMochila().remove(numeroDoAlimentoSelecionado);
						hpP = player.getHp();
					}else{
						System.out.println("mochila vazia");
					}
					
					break;
					
					
				case 5:
					dadospeedI = randomica.nextInt(10)+1;
					dadospeedP = randomica.nextInt(10)+1;
					int fugir = player.getSpeed() + dadospeedP + hpP;
					int perseguir = inimigo.getSpe() + dadospeedI + hpI;
					
					if(fugir > perseguir){
						System.out.println("Voce fugiu em seguranca\n");
						resultB = 15;
						fuga = true;
						
					}else{
						System.out.println("inimigo te alcancou\n");
						fuga = false;
						
					}
					break;
				
				}
				
				
				
				// TODO verificando se inimigo ainda tem hp
				if (hpI <= 0){
					player.addDinheiro(lootB.getConchas());
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					// definindo resultado da batalha para o retorno
					this.resultado = true;
					
					resultB = 2;
					//imprimindo resultado
					System.out.println("inimigo abatido\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//listando loot
					lootB.listarLoot();
					
					player1.addXp(inimigo1.getXp());
					
					
					System.out.println("\nXp: " +player1.getXp()+"/"+player1.getXpMax());
					
					break;
				}
				
				
				// TODO ação inimigo.
				if(inimigo1.getTipo().equalsIgnoreCase("Boss")){
					switch(numeroGerado){
					case 1:
					case 2:
					case 3:
						//atacando
						y=1;
						break;
					case 4:
					case 5:
					case 6:
						//defendendo
						y=3;
						break;
					case 7:
					case 8:
						//atacando skill
						y=2;
						break;
					case 9:
						//usando skill
						y=4;
						break;
					}
				
				}else{
					switch(numeroGerado){
					case 1:
					case 2:
					case 3:
						//atacando
						y=1;
						break;
					case 4:
					case 5:
					case 6:
						//defendendo
						y=3;
						break;
					case 7:
					case 8:
					case 9:
						//atacando escudo
						y=2;
						break;
				}
				
						
				}
				if(fuga == true){
					y=5;
					
					
				}
				
				switch(y){
				
				case 1:
					//atacando
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println("atk" + "\n");
					//verificando se player esta defendendo
					if(x==1 | x == 2 | x == 4 | x == 5){
						//calculando dano
						dano = atkI - (escudoP/2);
						//verificacao para evitar dano negativo(e causar dano minimo)
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano do hp do player
						hpP -= dano;
						//verificacao para evitar que hp seja negativo
						
						if(hpP<0){
							hpP=0;
						}
						//imprimindo dano
						System.out.println("hp PLAYER : -" + dano + "\n");
						
					}else if(x==3){
						//calculando dano
						dano = atkI - escudoP;
						//verificacao para evitar dano negativo(e causar dano minimo)
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano do hp do player
						hpP -= dano;
						//verificacao para evitar que hp seja negativo
						if(hpP<0){
							hpP=0;
						}
						//imprimindo dano
						System.out.println("hp PLAYER : -" + dano + "\n");
					}
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP + "\n");
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					//atacando escudo
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					//imprimindo acao de inimigo para player
					System.out.println("ataca escudo\n");
					//verificando se player esta dedendendo
					if(x==1 | x == 2 | x == 4){
						//calculando dano em escudo player
						escudoP = escudoP - (atkI/2);
						//imprimindo dano no escudo player
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else{
						//calculando dano ecudo player
						escudoP = escudoP -(atkI/4);
						//imprimindo dano escudo player
						System.out.println("dano escudo PLAYER : -" + atkI/4 + "\n");
					}
					//verificacao para evitar que escudo fique negativo
					if (escudoP<0){
						escudoP = 0;
					}
					
					
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					//defendendo
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//imprimindo acao inimigo
					System.out.println("def" + "\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//verificando se inimigo esta atacando
					if (y==1){
						System.out.println("DANO OBSORVIDO" + "\n");
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
				case 4:
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println("Inimigo usou Charge");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					dano = inimigo2.calculaSkill(hpP);
					
					if(dano == 1 & hpP == 1){
						dano = 0;
					}
					
					//subtraindo dano do hp do player
					hpP -= dano;
					//verificacao para evitar que hp seja negativo
					if(hpP<0){
						hpP=0;
					}
					//imprimindo dano
					System.out.println("hp PLAYER : -" + dano + "\n");
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP + "\n");
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					break;
					
					default:
						
						
				}
				//verificacao do hp de player para avisar caso esteja abaixo da metade
				if(hpP <= player1.getHpMax()/2& hpP != 0){
					System.out.println("ATENÇÃO:  HP BAIXO" + "\n");
				}
				
				
				
				// TODO verificando se player continua vivo
				if (hpP <= 0){
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					// definindo resultado da batalha para o retorno
					this.resultado = false;
					resultB = 3;
					//imprimindo resultado
					System.out.println("GAME OVER!" + "\n");
					
				}
				
				
			}while(resultB == 1);
			
			
			
			
			
			
			
			
			
		// TODO Inimigo Ataca primeiro
		}else{
			do{
				if(fuga == true){
					break;
				}
				int numeroGerado;
				
				//verificacao para evitar que inimigo ataque escudo  do player caso esteja em 0
				if (escudoP==0){
					numeroGerado = randomica.nextInt(6) + 1;
				}else{
					numeroGerado = randomica.nextInt(9) + 1;
				}
				
				if(fuga == true){
					break;
				}
				
				
				//ação inimigo.
				
				if(inimigo1.getTipo().equalsIgnoreCase("Boss")){
					switch(numeroGerado){
					case 1:
					case 2:
					case 3:
						//atacando
						y=1;
						break;
					case 4:
					case 5:
					case 6:
						//defendendo
						y=3;
						break;
					case 7:
					case 8:
						//atacando skill
						y=2;
						break;
					case 9:
						//usando skill
						y=4;
						break;
					}
				
				}else{
				
				switch(numeroGerado){
				case 1:
				case 2:
				case 3:
					//atacando
					y=1;
					break;
				case 4:
				case 5:
				case 6:
					//defendendo
					y=3;
					break;
				case 7:
				case 8:
				case 9:
					//atacando escudo
					y=2;
					break;
						
				}
				
				}
				
				if(fuga == true){
					break;
				}
				switch(y){
				case 1:
					//atacando
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getNome() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//imprimindo acao inimigo
					System.out.println("atk" + "\n");
					if (x==0 | x==1 | x==2 | x==4 | x == 5){
						//calculando dano
						dano = atkI - (escudoP/2);
						//verificacao para evitar dano negativo
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano de hp de player
						hpP -= dano;
						//verificacao para evitar hp negativo
						if(hpP<0){
							hpP=0;
						}
						//imprimindo dano em player
						System.out.println("hp PLAYER : -" + dano + "\n");
					
					}else if(x==3){
						//calculando dano 
						dano = atkI - escudoP;
						//verificacao para evitar dano negativo
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano de hp Player
						hpP -= dano;
						
						//verificacao para evitar hp negativo
						if(hpP<0){
							hpP=0;
						}
						//imprimindo dano causado
						System.out.println("hp PLAYER : -" + dano + "\n");
					}
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					//atacando escudo
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP);
					System.out.println(inimigo.getNome() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println("ataca escudo" + "\n");
					//verificando se player esta defendendo
					if(x==0 | x==1 | x==2 | x==4 | x == 5){
						//calculando dano em escudo
						escudoP = escudoP - (atkI/2);
						//imprimindo dano causado a escudo player
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else{
						//calculando dano em escudo Player
						escudoP = escudoP -(atkI/4);
						//imprimindo dano causado a escudo
						System.out.println("dano escudo PLAYER : -" + atkI/4 + "\n");
					}
					//verificacao para evitar escudo negativo
					if (escudoP<0){
						escudoP = 0;
					}
					
					
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					//defendendo
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println("def" + "\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					if (y==1){
						System.out.println("DANO OBSORVIDO" + "\n");
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 4:
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println("Inimigo usou Charge");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					dano = inimigo2.calculaSkill(hpP);
					
					if(dano == 1 & hpP == 1){
						dano = 0;
					}
					
					//subtraindo dano do hp do player
					hpP -= dano;
					//verificacao para evitar que hp seja negativo
					if(hpP<0){
						hpP=0;
					}
					//imprimindo dano
					System.out.println("hp PLAYER : -" + dano + "\n");
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP + "\n");
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					break;
					
				default:
					System.out.println("entrada invalida" + "\n");
					
			
					
				}
				
				
				
				
				// TODO verificacao se player continua vivo
				if (hpP <= 0){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					this.resultado = false;
					resultB = 3;
					System.out.println("GAME OVER!" + "\n");
					
					break;
					
				}
				//verificacao se o hp de player esta abaixo da metade
				if(hpP <= player1.getHpMax()/2 & hpP != 0){
					System.out.println("ATENÇÃO:  HP BAIXO" + "");
				}
				
				
				
				// TODO ação player
				
				//System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp):" + "\n");
				//x = scanIn.nextInt();
				
				boolean teste1 = false;
				while (!teste1) {
					System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp) " + player.getMochila().size() +" itens na mochila" +
							" 5/fugir:");
					try {				
						scanIn = new Scanner(System.in);
						x = scanIn.nextInt();
						if (x>5|x<1){
							throw new java.lang.Exception();
						}
						teste1 = true;
						
					} catch (InputMismatchException e) {
						System.err.println("Entrada Invalida. Apenas numeros de 1 a 5");
						teste1 = false;
						
					}catch (Exception e){
						System.err.println("Entrada invalida!!!");
						teste1 = false;
					}
					
					if (player.getMochila().size()==0 & x == 4){
						System.err.println("Mochila Vazia!!!");
						teste1 = false;
					}
				}
				/**
				try{
					if (x>4|x<1){
						throw new java.lang.Exception();
					}
				}catch (Exception e){
						do {
							System.err.println("Entrada invalida!!!");
							System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp)" + player.getMochila().size() +" itens na mochila:");
							x = scanIn.nextInt();
						}while(x>4|x<1);
				}
				
				try{
					
					if (player.getMochila().size()==0 & x == 4){
						throw new java.lang.Exception();
					}
				}catch (Exception e){
						do {
							System.err.println("Mochila Vazia!!!");
							System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende 4/come(recupera hp)" + player.getMochila().size() +" itens na mochila:");
							x = scanIn.nextInt();
						}while(x == 4);
				}
				*/
				
				if(fuga == true){
					break;
				}
				switch(x){
				case 1:
					//atacando
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//verificacoes se inimigo esta defendendo
					if(y==0 | y==1 | y==2){
						//calculando dano
						dano = atkP - (escudoI/2);
						//verificando se dano nao esta negativo e atribuindo dano minimo
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano de hp inimigo
						hpI -= dano;
						//verificacao para evitar hp negativo
						if(hpI<0){
							hpI=0;
						}
						//imprimindo dano causado
						System.out.println("hp inimigo : -" + dano + "\n");
					}else if(y==3){
						//calculando dano
						dano = atkP - escudoI;
						//cerificando se dano esta negativo e atribuindo dano minimo
						if(dano<1){
							dano = 1;
						}
						//subtraindo dano de hp inimigo
						hpI -= dano;
						//verificacao para evitar hp negativo
						if(hpI<0){
							hpI=0;
						}
						//imprimindo dano
						System.out.println("hp inimigo : -" + dano + "\n");
					}
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					//atacando escudo
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//verificando se inimigo esta atacando
					if(y==0| y==1|y==2){
						//calculando e subtraindo dano no escudo inimigo
						escudoI = escudoI - (atkP/2);
						//imprimindo dano
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else if (y==3){
						//calculando e subtraindo dano no escudo inimigo
						escudoI = escudoI -(atkP/4);
						//imprimindo dano
						System.out.println("dano escudo inimigo : -" + atkP/4 + "\n");
					}
					//verificacao para evitar escudo ficar negativo
					if (escudoI < 0){
						escudoI = 0;
					}
					
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					//defendendo
					
					if (y==1){
						System.out.println("DANO OBSORVIDO" + "\n");
					}
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(player.getNome() +" - hp: "+ hpP  +"/"+ player.getHpMax() +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 4:
					int numeroDoAlimentoSelecionado = -1;
					
					
					
					if ( player.getMochila().size() >0){
						
						player.listarMochila();
						System.out.println("voce deseja comer qual item?(insira apenas o numero que esta antes do nome do item)");
						/**
						numeroDoAlimentoSelecionado = scanIn.nextInt();
						if(numeroDoAlimentoSelecionado > player.getMochila().size()-1| numeroDoAlimentoSelecionado < 0){
							do{
								System.err.println("Entrada Invalida!!!!");
								
								System.out.println("Voce deseja comer qual item?(insira apenas o numero que esta antes do nome do item)");
								numeroDoAlimentoSelecionado = scanIn.nextInt();
							}while(numeroDoAlimentoSelecionado > player.getMochila().size()-1| numeroDoAlimentoSelecionado < 0);
						}
						*/

						if(fuga == true){
							break;
						}
						
						teste1 = false;
						while (!teste1) {
							try {
								scanIn = new Scanner(System.in);
								numeroDoAlimentoSelecionado = scanIn.nextInt();
								while(numeroDoAlimentoSelecionado > player.getMochila().size()-1| numeroDoAlimentoSelecionado < 0){

									System.err.println("Entrada Invalida!!!!");
									player.listarMochila();												
									System.out.println("Voce deseja comer qual item?");
									numeroDoAlimentoSelecionado = scanIn.nextInt();

								}
								teste1 = true;
								
							} catch (InputMismatchException e) {
								System.err.println("Entrada Invalida.\nInsira apenas o numero que esta antes do nome do item");
								teste1 = false;
							}
						}
						player.setHp(hpP);
						player.verificarItem(player.getMochila().get(numeroDoAlimentoSelecionado));
						player.getMochila().remove(numeroDoAlimentoSelecionado);
						hpP = player.getHp();
					}else{
						System.out.println("mochila vazia");
					}
					
					break;
					
				case 5:
					dadospeedI = randomica.nextInt(10)+1;
					dadospeedP = randomica.nextInt(10)+1;
					int fugir = player.getSpeed() + dadospeedP + hpP;
					int perseguir = inimigo.getSpe() + dadospeedI + hpI;
					
					if(fugir > perseguir){
						System.out.println("Voce fugiu em seguranca\n");
						resultB = 15;
						fuga = true;
					}else
						System.out.println("inimigo te alcancou\n");
						fuga = false;
					break;
					
				default:
					System.out.println("entrada invalida" + "\n");
					
					if(fuga == true){
						break;
					}
			
				
				}
				
				// TODO verificando se inimigo foi abatido
				if (hpI <= 0){
					player.addDinheiro(lootB.getConchas());
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//setando resultado da batalha para o return
					this.resultado = true;
					resultB = 2;
					//imprimindo resultado
					System.out.println("inimigo abatido" + "\n");
					//delay
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					//listando loot
					lootB.listarLoot();

					player1.addXp(inimigo1.getXp());
					
					if(fuga == true){
						break;
					}
					
					/**								
					novaxp = player1.getXp() + inimigo1.getXp();
					
					if(player1.getXp() > player1.getXpMax()){
						System.out.println("LVL UP!!!!!!!\n");
						novaxp = novaxp - player1.getXpMax();
						player1.setLvl((player1.getLvl()+1));
						player1.setXp(novaxp);
					}else{
						player1.setXp(novaxp);
					}
					*/
					System.out.println("\nXp: " +player1.getXp()+"/"+player1.getXpMax());
				}
				
				
				if(fuga == true){
					break;
				}
				
				//continue;
				
				
				
			}while(resultB == 1);
		}
		
		novolvl = player.getLvl();
		
		if(velholvl == novolvl){
			player1.setHp(hpP);
		}
		int verificaPegarLoot;
		
		if(hpP > 0 & resultB != 15){
			
			if(lootB.getItem() instanceof Consumivel){
				if (player.getMochila().size()==5){
					System.err.println("Mochila Cheia!!!");
					
				}else{
					System.out.println("voce tem " + player.getMochila().size() + " itens na mochila");
				}
				
			}else{
				if(player.getArma() == null){
					if(player.getRoupa() == null){
						System.out.println("voce esta usando : nada como arma e vestindo nada(sim voce esta andando nu, peladao, desnudo, do jeito que veio ao mundo).");
					}else{
						System.out.println("voce esta usando : nada como arma e vestindo um(a)" + player.getRoupa().getNomeItem() + " (+" + player.getRoupa().getBonus() + " def)" );
					}
					
				}else{
					if(player.getRoupa() == null){
						System.out.println("voce esta usando :" + player.getArma().getNomeItem() + " (+" +player.getArma().getBonus()  + " atk) como arma e " +
								"vestindo nada(sim voce esta andando nu, peladao, desnudo, do jeito que veio ao mundo).");
					}else{
						System.out.println("voce esta usando : " + player.getArma().getNomeItem() + " (+" +player.getArma().getBonus()  + " atk)como arma e vestindo um(a)" + 
					player.getRoupa().getNomeItem() + " (+" + player.getRoupa().getBonus() + " def)" );
					}
				}
			}
			
			if(resultB != 15){
				
			
			System.out.println("\nDeseja pegar Item? 1/sim 2/ nao");
			verificaPegarLoot = 2;
			
			boolean teste1 = false;
			while (!teste1) {
				try {				
					scanIn = new Scanner(System.in);
					verificaPegarLoot = scanIn.nextInt();
					teste1 = true;
					
				} catch (InputMismatchException e) {
					System.err.println("Entrada Invalida. Apenas 1 ou 2");
					teste1 = false;
				}
			}
			
			if(verificaPegarLoot == 1){
				int delItem = 0;
				if(player.getMochila().size()==5 & lootB.getItem() instanceof Consumivel){

					System.err.println("EU DISSE QUE A MOCHILA ESTA CHEIA, MUCURONGO!!!");

					System.err.println("Mochila Cheia!!!");
					System.out.println("Deseja deletar abrir espaço para esse item: "+lootB.getItem().getNomeItem());
					System.out.println("1/sim 2/nao");
					
					teste1 = false;
					while (!teste1) {
						try {				
							scanIn = new Scanner(System.in);
							delItem = scanIn.nextInt();
							if(delItem<1 | delItem>2){
								throw new java.lang.Exception();
							}
							teste1 = true;
							
						} catch (InputMismatchException e) {
							System.err.println("Entrada Invalida. Apenas 1 ou 2");
							teste1 = false;
						}catch(Exception e){
							System.err.println("Entrada Invalida. Apenas 1 ou 2");
							teste1 = false;
						}
					}
					
					if(delItem == 1){
						
						player.listarMochila();
						System.out.println("Voce deseja deletar qual item?(insira apenas o numero que esta antes do nome do item)");
						int numeroDoAlimentoSelecionado = 0;

						teste1 = false;
						while (!teste1) {
							try {
								scanIn = new Scanner(System.in);
								numeroDoAlimentoSelecionado = scanIn.nextInt();
								while(numeroDoAlimentoSelecionado > player.getMochila().size()-1| numeroDoAlimentoSelecionado < 0){

									System.err.println("Entrada Invalida!!!!");												
									player.listarMochila();
									System.out.println("Voce deseja comer qual item?");
									numeroDoAlimentoSelecionado = scanIn.nextInt();

								}
								teste1 = true;

							} catch (InputMismatchException e) {
								System.err.println("Entrada Invalida.\nInsira apenas o numero que esta antes do nome do item");
								teste1 = false;
							}
						}
						System.out.println(player.getMochila().get(numeroDoAlimentoSelecionado).getNomeItem()+
								" Deletado");
						player.getMochila().remove(numeroDoAlimentoSelecionado);
						System.out.println(lootB.getItem().getNomeItem()+
								" Adicionado a Mochila");
						player.adicionaItem(lootB.getItem());
					}

				}else{
					player.adicionaItem(lootB.getItem());
				}
				
			}
		}
		}
		//retornando resultado da batalha
		return player1;
	}
	
	
	
}
