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
		
		Player player1 = new Player(player.getNome(), player.getSexo(), 10);
		InimigoEvento inimigo1 = new InimigoEvento();
		
		
		int x, y=0;
		int atkP, defP, hpP, escudoP;
		int atkI, defI, hpI, escudoI;
		int dano;
		int resultB = 1;
		 
		
		
		inimigo1 = inimigo;
		
		player1.setLvl(10);
		
		atkP = player1.getAtk();
		defP = player1.getDef();
		hpP = player1.getHp();
		atkI = inimigo1.getAtk();
		defI = inimigo1.getDef();
		hpI = inimigo1.getHp();
		escudoP = 2*defP;
		escudoI = 2*defI;
		
		
		
		System.out.println("Voce encontrou um " + inimigo1.getTipo() + " lvl: " + inimigo1.getLvl());
		
		do{
			int numeroGerado = randomica.nextInt(9) + 1;
			System.out.println("voce : 1/ataca 2/ ataca escudo 3/defende:");
			x = scanIn.nextInt();
			
			
			
			switch(x){
			case 1:
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
				
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
					
					System.out.println("hp inimigo : -" + dano);
				}else if(y==1){
					dano = atkP - (escudoI/2);
					hpI -= dano;
					if(hpI<0){
						hpI=0;
					}
					
					System.out.println("hp inimigo : -" + dano);
				}else if(y == 2){
					dano = atkP - (escudoI/2);
					hpI -= dano;
					if(hpI<0){
						hpI=0;
					}
					
					System.out.println("hp inimigo : -" + dano);
				}else if(y==3){
					dano = atkP - escudoI;
					if(dano<1){
						dano = 1;
					}
					hpI -= dano;
					if(hpI<0){
						hpI=0;
					}
					
					System.out.println("hp inimigo : -" + dano);
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
				break;
				
			case 2:
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(y==0){
					escudoI = escudoI - (atkP/2);
					System.out.println("dano escudo inimigo : -" + atkP/2);
				}else
				if(y==1){
					escudoI = escudoI - (atkP/2);
					System.out.println("dano escudo inimigo : -" + atkP/2);
				}else if(y==2){
					escudoI = escudoI - (atkP/2);
					System.out.println("dano escudo inimigo : -" + atkP/2);
				}else if (y==3){
					escudoI = escudoI -(atkP/4);
					System.out.println("dano escudo inimigo : -" + atkP/4);
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
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
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
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
				break;
		
			
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
				System.out.println("inimigo abatido");
				break;
			}
			
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
				
				System.out.println("atk");
				
				if(x==1){
					
					dano = atkI - (escudoP/2);
					hpP -= dano;
					if(hpP<0){
						hpP=0;
					}
					System.out.println("hp PLAYER : -" + dano);
					
				}else if(x == 2){
					dano = atkI - (escudoP/2);
					hpP -= dano;
					if(hpP<0){
						hpP=0;
					}
					System.out.println("hp PLAYER : -" + dano);
				}else if(x==3){
					dano = atkI - escudoP;
					if(dano<1){
						dano = 1;
					}
					hpP -= dano;
					if(hpP<0){
						hpP=0;
					}
					System.out.println("hp PLAYER : -" + dano);
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
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
					System.out.println("dano escudo PLAYER : -" + atkI/2);
				}else if(x==2){
					escudoP = escudoP - (atkI/2);
					System.out.println("dano escudo PLAYER : -" + atkI/2);
				}else{
					escudoP = escudoP -(atkI/4);
					System.out.println("dano escudo PLAYER : -" + atkI/4);
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
				
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
				break;
				
			case 3:
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("def");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (y==1){
					System.out.println("DANO OBSORVIDO");
				}
				
				System.out.println(player.getNome() +" - hp: "+ hpP +" dano: " + atkP + " escudo: " + escudoP);
				System.out.println(inimigo.getTipo() +" - hp: "+ hpI +" dano: " + atkI + " escudo: " + escudoI);
				break;
		
				
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
				System.out.println("GAME OVER!");
				
			}
			
		}while(resultB == 1);
			
		
		//scanIn.close();
		
		return resultB;
	}
	
	
	
}
