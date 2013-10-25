/**
 * 
 */
package game.entidade;



import java.util.Scanner;
import java.util.Random;



/**
 * @author Bruno
 *
 */
public class BatalhaTurno {
	
	private Random randomica = new Random(System.currentTimeMillis());
	Scanner scanIn = new Scanner(System.in);
	public boolean resultado;
	
	

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
	
	
	public int batalha(Player player, InimigoEvento inimigo){
		
		Player player1 = new Player(player.getNome(), player.getSexo(), 7);
		InimigoEvento inimigo1 = new InimigoEvento();
		
		
		int x = 0, y=0;
		int atkP, defP, hpP, escudoP;
		int atkI, defI, hpI, escudoI;
		int dano;
		int resultB = 1;
		int speedP, speedI;
		
		 
		int dadospeedI = randomica.nextInt(80) + 1;
		int dadospeedP = randomica.nextInt(100) + 1;
		
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
		
		speedP = player1.getSpeed() +dadospeedP;
		speedI = inimigo1.getSpe() + dadospeedI;
		
		
		
		System.out.println("Voce encontrou um " + inimigo1.getTipo() + " lvl: " + inimigo1.getLvl() + "\n");
		
		System.out.println("speed inimigo : " + speedI + " speed player: " + speedP  + "\n");
		if(speedP>speedI){
			do{
				int numeroGerado;
				
				//verificao para evitar que inimigo fique atacando o escudo do player depois que chegar a 0
				
				if (escudoP==0){
					numeroGerado = randomica.nextInt(6) + 1;
				}else{
					numeroGerado = randomica.nextInt(9) + 1;
				}
				
				//ação player
				
				System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende:");
				x = scanIn.nextInt();
				
				
				
				switch(x){
				case 1:
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(y == 1 | y == 2 | y == 0){
						//calculando dano
						dano = atkP - (escudoI/2);
						//verificando se o dano eh minimo (evitando dano negativo)
						if(dano<1){
							dano = 1;
						}
						hpI -= dano;
						if(hpI<0){
							hpI=0;
						}
						
						System.out.println("hp inimigo : -" + dano + "\n");
					}else if(y==3){
						dano = atkP - escudoI;
						if(dano<1){
							dano = 1;
						}
						hpI -= dano;
						if(hpI<0){
							hpI=0;
						}
						
						System.out.println("hp inimigo : -" + dano + "\n");
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(y==0){
						escudoI = escudoI - (atkP/2);
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else
					if(y==1){
						escudoI = escudoI - (atkP/2);
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else if(y==2){
						escudoI = escudoI - (atkP/2);
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else if (y==3){
						escudoI = escudoI -(atkP/4);
						System.out.println("dano escudo inimigo : -" + atkP/4 + "\n");
					}
					if (escudoI < 0){
						escudoI = 0;
					}
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					
					if (y==1){
						System.out.println("DANO OBSORVIDO");
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				default:
					System.out.println("entrada invalida" + "\n");
					
			
				
				}
				
				if (hpI <= 0){
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					this.resultado = true;
					resultB = 2;
					System.out.println("inimigo abatido\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					lootB.listarLoot();
					
					break;
				}
				
				
				//ação inimigo.
				
				switch(numeroGerado){
				case 1:
				case 2:
				case 3:
					
					y=1;
					break;
				case 4:
				case 5:
				case 6:
					
					y=3;
					break;
				case 7:
				case 8:
				case 9:
					
					y=2;
					break;
						
				}
				
				switch(y){
				case 1:
					
					//System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
					//System.out.println(inimigo.getNome() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("atk" + "\n");
					
					if(x==1){
						
						dano = atkI - (escudoP/2);
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
						
					}else if(x == 2){
						dano = atkI - (escudoP/2);
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
					}else if(x==3){
						dano = atkI - escudoP;
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP + "\n");
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					//System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
					//System.out.println(inimigo.getNome() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("ataca escudo");
					if(x==1){
						escudoP = escudoP - (atkI/2);
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else if(x==2){
						escudoP = escudoP - (atkI/2);
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else{
						escudoP = escudoP -(atkI/4);
						System.out.println("dano escudo PLAYER : -" + atkI/4 + "\n");
					}
					if (escudoP<0){
						escudoP = 0;
					}
					
					
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("def" + "\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (y==1){
						System.out.println("DANO OBSORVIDO" + "\n");
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
			
					default:
						System.out.println("entrada invalida" + "\n");
						
				}
				
				if(hpP < player1.getHp()/2){
					System.out.println("ATENÇÃO:  HP BAIXO" + "\n");
				}
				
				if (hpP <= 0){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.resultado = false;
					resultB = 3;
					System.out.println("GAME OVER!" + "\n");
					
				}
				
			}while(resultB == 1);
			
			
			
			
			
			
			
			
			
			
		}else{
			do{
				int numeroGerado;
				if (escudoP==0){
					numeroGerado = randomica.nextInt(6) + 1;
				}else{
					numeroGerado = randomica.nextInt(9) + 1;
				}
				
				
				
				//ação inimigo.
				
				switch(numeroGerado){
				case 1:
				case 2:
				case 3:
					
					y=1;
					break;
				case 4:
				case 5:
				case 6:
					
					y=3;
					break;
				case 7:
				case 8:
				case 9:
					
					y=2;
					break;
						
				}
				
				switch(y){
				case 1:
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getNome() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("atk" + "\n");
					if (x==0){

						dano = atkI - (escudoP/2);
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
					}else if(x==1){
						
						dano = atkI - (escudoP/2);
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
						
					}else if(x == 2){
						dano = atkI - (escudoP/2);
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
					}else if(x==3){
						dano = atkI - escudoP;
						if(dano<1){
							dano = 1;
						}
						hpP -= dano;
						if(hpP<0){
							hpP=0;
						}
						System.out.println("hp PLAYER : -" + dano + "\n");
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
					System.out.println(inimigo.getNome() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("ataca escudo" + "\n");
					if(x==0){
						escudoP = escudoP - (atkI/2);
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else if(x==1){
						escudoP = escudoP - (atkI/2);
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else if(x==2){
						escudoP = escudoP - (atkI/2);
						System.out.println("dano escudo PLAYER : -" + atkI/2 + "\n");
					}else{
						escudoP = escudoP -(atkI/4);
						System.out.println("dano escudo PLAYER : -" + atkI/4 + "\n");
					}
					if (escudoP<0){
						escudoP = 0;
					}
					
					
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("def" + "\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if (y==1){
						System.out.println("DANO OBSORVIDO" + "\n");
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				default:
					System.out.println("entrada invalida" + "\n");
					
			
					
				}
				
				
				
				if (hpP <= 0){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.resultado = false;
					resultB = 3;
					System.out.println("GAME OVER!" + "\n");
					
					break;
					
				}
				
				if(hpP < player1.getHp()/2){
					System.out.println("ATENÇÃO:  HP BAIXO" + "");
				}
				
				
				//ação player
				
				System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende:" + "\n");
				x = scanIn.nextInt();
				
				switch(x){
				case 1:
					//System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					//System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(y==0){
						dano = atkP - (escudoI/2);
						hpI -= dano;
						if(hpI<0){
							hpI=0;
						}
						
						System.out.println("hp inimigo : -" + dano + "\n");
					}else if(y==1){
						dano = atkP - (escudoI/2);
						hpI -= dano;
						if(hpI<0){
							hpI=0;
						}
						
						System.out.println("hp inimigo : -" + dano + "\n");
					}else if(y == 2){
						dano = atkP - (escudoI/2);
						hpI -= dano;
						if(hpI<0){
							hpI=0;
						}
						
						System.out.println("hp inimigo : -" + dano + "\n");
					}else if(y==3){
						dano = atkP - escudoI;
						if(dano<1){
							dano = 1;
						}
						hpI -= dano;
						if(hpI<0){
							hpI=0;
						}
						
						System.out.println("hp inimigo : -" + dano + "\n");
					}
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 2:
					//System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
					//System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(y==0){
						escudoI = escudoI - (atkP/2);
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else
					if(y==1){
						escudoI = escudoI - (atkP/2);
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else if(y==2){
						escudoI = escudoI - (atkP/2);
						System.out.println("dano escudo inimigo : -" + atkP/2 + "\n");
					}else if (y==3){
						escudoI = escudoI -(atkP/4);
						System.out.println("dano escudo inimigo : -" + atkP/4 + "\n");
					}
					if (escudoI < 0){
						escudoI = 0;
					}
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				case 3:
					
					if (y==1){
						System.out.println("DANO OBSORVIDO" + "\n");
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP );
					System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI + "\n");
					break;
					
				default:
					System.out.println("entrada invalida" + "\n");
			
				
				}
				
				if (hpI <= 0){
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.resultado = true;
					resultB = 2;
					System.out.println("inimigo abatido" + "\n");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					lootB.listarLoot();
					
					
					
				}
				
				
				
				continue;
				
				
			}while(resultB == 1);
		}
		
		//scanIn.close();
		
		return resultB;
	}
	
	
	
}
