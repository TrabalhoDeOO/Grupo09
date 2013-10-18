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
	
	
	public void batalha(Player player, InimigoEvento inimigo){
		
		Player player1 = new Player(player.getNome(), player.getSexo(), 10);
		InimigoEvento inimigo1 = new InimigoEvento();
		
		
		int x, y=1;
		int atkP, defP, hpP;
		int atkI, defI, hpI;
		int dano;
		int resultB = 1;
		boolean resultado; 
		
		
		inimigo1 = inimigo;
		
		player1.setLvl(10);
		
		atkP = player1.getAtk();
		defP = player1.getDef();
		hpP = player1.getHp();
		atkI = inimigo1.getAtk();
		defI = inimigo1.getDef();
		hpI = inimigo1.getHp();
		
		
		
		System.out.println("Voce encontrou um " + inimigo1.getNome() + " lvl: " + inimigo1.getLvl());
		
		do{
			int numeroGerado = randomica.nextInt(6) + 1;
			System.out.println("voce : 1/ataca 2/defende:");
			x = scanIn.nextInt();
			
			switch(numeroGerado){
			case 1:
			case 2:
			case 3:
				System.out.println("atk");
				y=1;
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("def");
				y=2;
				break;
			}
			
			if(x == 1){
					if(y ==1){
						System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI );
						
						dano = (atkP - defI/2);
						hpI = hpI - dano;
						
						System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
						if(hpI<1){
							System.out.println("javali fainted");
							resultado = true;
							resultB = 2;
							break;
						}
						System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
						dano = (atkI - defP/2);
						hpP = hpP - dano;
						System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
						if(hpP<1){
							System.out.println("game over");
							resultado = false;
							resultB = 2;
							break;
						}
						
						
					}else{
						System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
						dano = atkI/2- defP/2;
						hpI = hpI - dano;
						System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
					}
				
			}else if (x==2){
				if(y==2){
					System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
					dano = (atkI - defP/2);
					hpP = hpP - dano;
					System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
				}else{
					System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
					dano = (atkI - defP/2);
					hpP = hpP - dano;
					System.out.println(player1.getNome() +" -  hp: " + hpP + "\n" + inimigo1.getNome() + " - hp: " + hpI);
				}
				
			}
			
			
		}while(resultB == 1);
			
		
		scanIn.close();
		
	}
	
	
	
}
