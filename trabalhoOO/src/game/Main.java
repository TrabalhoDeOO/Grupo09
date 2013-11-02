/**
 * 
 */
package game;
/**
 * 
 */

import game.entidade.Adm;
//import game.entidade.Arma;
import game.entidade.BatalhaTurno;
//import game.entidade.Consumivel;
import game.entidade.Criar;
//import game.entidade.Dinheiro;
//import game.entidade.Inimigo;
import game.entidade.InimigoEvento;
//import game.entidade.InimigoPlataforma;
//import game.entidade.Loot;
import game.entidade.Player;
//import game.entidade.Item;
//import game.entidade.NPC;
//import game.entidade.Loja;
//import game.entidade.Vestimenta;
import game.entidade.grimorio.Grimorio;
import game.entidade.grimorio.GrimorioItens;

import java.util.InputMismatchException;
//import java.util.ArrayList;
import java.util.Random;


/**
 * @author Bruno
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanIn = new Scanner(System.in);
		Random randomica = new Random(System.currentTimeMillis());
		
		//criando Adm para teste
		Adm adm = new Adm();
		adm.criarAdm(1234, "adm");
		
		//senhae login para validacao
//		int senha2;
//		String login2;
		//variavel para menu de Adm
//		int y = 0;
		//variavel para verificacao se jogador ou Adm
//		int z = 0;
		//variavel para validacao de ADM
//		int validaAdm = 0;
		
		GrimorioItens grimorioI = new GrimorioItens();
		
		//grimorioI.listarGrimorioItem();
		//Grimorio grimorio = new Grimorio();
		//grimorio.listarGrimorio();
		
			int vidas = 3;
		
			String nomeP;
			String sexoP;
			
			Criar jogador = new Criar();
			Player player = new Player();
			
			
			do{
			
				System.out.println("Voce e homem ou mulher?");
				sexoP = scanIn.next();
				
			}while(player.validaPlayer(sexoP) == false);
			
			int verificaNome = 2;
			do{
				System.out.println("qual o seu nome: ");
				nomeP = scanIn.next();
				
				System.out.println("Seu nome e: " + nomeP + "\n1/Sim 2/Nao");
				
				
				boolean teste1 = false;
				while (!teste1) {
					try {				
						scanIn = new Scanner(System.in);
						verificaNome = scanIn.nextInt();
						teste1 = true;
						
					} catch (InputMismatchException e) {
						System.err.println("Entrada Invalida. Apenas 1 ou 2");
						teste1 = false;
					}
				}
			
			}while(verificaNome == 2);
			
			//player = new Player(nomeP, sexoP, 1);
			player = jogador.criarPlayer(nomeP, sexoP, 1);
			
			/**
			System.out.println("\n\n"+player.getNome() + " lvl: " + player.getLvl() + "  hp: " + player.getHp() + " atk:  "
			+ player.getAtk() + " def: " + player.getDef() + " speed:" + player.getSpeed() + " xp:" +player.getXp()+"/"+player.getXpMax());
			*/

			int verificaTutorial = 0;
			
			System.out.println("VERSAO DEMO: nessa versao demo voce tem a opcao de batalhar com 10 tipos diferentes\n" +
					"de inimigos escolhidos aleatoriamente e o dinheiro do drop desses inimigos é meramente ilustrativo\n" +
					"nao ira afetar em nada seu personagem\n" +
					"Voce tera seu lvl upado diretamente para o lvl 7 nesse demo para melhor experiencia de jogo aproveitem!!\n\n"); 
			System.out.println("deseja ver o tutorial? 1/sim 2/nao");
			
			boolean teste1 = false;
			while (!teste1) {
				try {				
					scanIn = new Scanner(System.in);
					verificaTutorial = scanIn.nextInt();
					teste1 = true;
					
				} catch (InputMismatchException e) {
					System.err.println("Entrada Invalida. Entre apenas 1 ou 2");
					teste1 = false;
				}
			}
			if (verificaTutorial == 1){
				
				System.out.println("TUTORIAL: nesse demo sao apresentados 3 atributos na tela o seu HP que representa seus pontos de vida\n" +
						"o ATAQUE que representa seu dano maximo e o ESCUDO que representa o dano maximo que voce consegue absolver\n" +
						"voce vai ter 4 opcoes a primeira é atacar diretamente o adiversario se ele nao estiver defendendo seu dano \n" +
						"sera igual ao seu ATK menos metade do ESCUDO do inimigo(ex: atk player = 20 escudo inimigo = 14 logo dano = 13), \n" +
						"mas se ele estiver defendendo sera seu ATK menos o ESCUDO (ex: atk player = 20 escudo inimigo = 14 logo dano = 6 )\n" +
						" voce pode atacar o escudo do adiversario, fazendo isso voce ira diminuir o escudo dele, se ele nao estiver defendendo\n" +
						"seu dano no escudo sera igual a metade do seu ataque(ex: atk player = 20 escudo inimigo = 14 logo dano no escudo = 10)  \n" +
						"mas se ele estiver defendendo sera um quarto do seu ataque(ex: atk player = 20 escudo inimigo = 14 logo dano no escudo = 5)\n" +
						", voce pode defender o proximo ataque do inimigo o que ira diminuir o dano do mesmo modo que quando vc ataca um inimigo que esta defendendo\n" +
						" e voce pode comer algo que ira  recuperar seu hp a quantidade de hp recuperado depende doitem consumido, em sua mochila cabem 10 comidas\n" +
						". E para decidir quem ira comecar atacando levamos em conta a speed dos 2gi\n" +
						"Bom Jogo!!!\n");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			do{
				player = new Player(player.getNome(), player.getSexo(), 7);
				System.out.println(player.getStatus());
				
				player.adicionaItem(grimorioI.getGrimorioItens().get(6));
				player.adicionaItem(grimorioI.getGrimorioItens().get(7));
				player.adicionaItem(grimorioI.getGrimorioItens().get(8));
				
			
				
				for (int i = 1; i > 0; i++) {
					
					
					Grimorio grimorio = new Grimorio();
	
					int numeroGerado3 = randomica.nextInt(10);
					grimorio = new Grimorio();
	
					InimigoEvento inimigo1 = new InimigoEvento();
			
					
					int verificaDescanco;
					
					inimigo1 = grimorio.getGrimorioInimigos().get(numeroGerado3);
					
					
					
					BatalhaTurno batalha1 = new BatalhaTurno();
					player = batalha1.batalha(player, inimigo1);
					
					
					
					
					
					if (batalha1.isResultado() == false){
						int verificacaoNovaTentativa = 0;
						if(vidas>0){
							System.out.println("deseja tentar novamente? " + vidas+ " vidas\n1/sim 2/nao");
							
							teste1 = false;
							while (!teste1) {
								try {				
									scanIn = new Scanner(System.in);
									verificacaoNovaTentativa = scanIn.nextInt();
									teste1 = true;
									
								} catch (InputMismatchException e) {
									System.err.println("Entrada Invalida. Entre apenas 1 ou 2");
									teste1 = false;
								}
							}
							if(verificacaoNovaTentativa == 1){
								vidas--;
							}else{
								vidas = 0;
							
							}
						}
						
						break;
					}
					//isso sera substituido pelo consumivel em breve
					System.out.println(player.getNome() +" - hp: "+ player.getHp() +"/"+ player.getHpMax());
					System.out.println("\nDeseja comer algo(comer resulta em recuperar seu hp voce ainda tem " + player.getMochila().size() +" alimentos)? 1/sim 2/nao");
					verificaDescanco = 0;
					teste1 = false;
					while (!teste1) {
						try {				
							scanIn = new Scanner(System.in);
							verificaDescanco = scanIn.nextInt();
							teste1 = true;
							
						} catch (InputMismatchException e) {
							System.err.println("Entrada Invalida. Entre apenas 1 ou 2");
							teste1 = false;
						}
					}
					
					
						int numeroDoAlimentoSelecionado = -1;
						
						
						if(verificaDescanco ==1){
							if ( player.getMochila().size() >0){
								
								player.listarMochila();
								System.out.println("voce deseja comer qual item?(insira apenas o numero que esta antes do nome do item)");
								
								teste1 = false;
								while (!teste1) {
									try {
										scanIn = new Scanner(System.in);
										numeroDoAlimentoSelecionado = scanIn.nextInt();
										while(numeroDoAlimentoSelecionado > player.getMochila().size()-1| numeroDoAlimentoSelecionado < 0){

											System.err.println("Entrada Invalida!!!!");												
											System.out.println("Voce deseja comer qual item?");
											player.listarMochila();
											numeroDoAlimentoSelecionado = scanIn.nextInt();

										}
										teste1 = true;
										
									} catch (InputMismatchException e) {
										System.err.println("Entrada Invalida.\nInsira apenas o numero que esta antes do nome do item");
										teste1 = false;
									}
								}
								
								player.verificarItem(player.getMochila().get(numeroDoAlimentoSelecionado));
								player.getMochila().remove(numeroDoAlimentoSelecionado);
								
								
							}else{
								System.out.println("mochila vazia");
							}
						}
						
					
				}
				
				continue;
				
				
				
			}while(vidas >(-1));
	

			
		
			
			
		
		scanIn.close();
		
	}

}
