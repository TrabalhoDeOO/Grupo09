/**
 * 
 */
package game;
/**
 * 
 */

import game.entidade.Adm;
import game.entidade.Arma;
import game.entidade.BatalhaTurno;
import game.entidade.Consumivel;
import game.entidade.Criar;
import game.entidade.Dinheiro;
import game.entidade.Inimigo;
import game.entidade.InimigoEvento;
import game.entidade.InimigoPlataforma;
import game.entidade.Loot;
import game.entidade.Player;
import game.entidade.Item;
import game.entidade.NPC;
import game.entidade.Loja;
import game.entidade.Vestimenta;

import java.util.ArrayList;
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
		int senha2;
		String login2;
		//variavel para menu de Adm
		int y = 0;
		//variavel para verificacao se jogador ou Adm
		int z = 0;
		//variavel para validacao de ADM
		int validaAdm = 0;
		
		System.out.println("Voce e um player ou adm? 1/player 2/Adm");
		z = scanIn.nextInt();
		
		if(z == 2){
			do{
				System.out.println("Digite seu Login: ");
				login2 = scanIn.next();
			
				
				if (login2.equals(adm.getLogin())){
					validaAdm = 1;
				}else{
					System.out.println("login invalido");
				}
				
			}while(validaAdm == 0);
			

			System.out.println("Digite sua senha de Adm: ");
			senha2 = scanIn.nextInt();
			
			System.out.println(senha2);
			System.out.println(adm.getSenha());
			
			
		
			int x = 1;
			
			
			
			if(senha2 == adm.getSenha()){
				System.out.println("Autorizado");
				do{
				System.out.println("Deseja criar: 1/Conchas 2/Inimigo 3/Item 4/Loja 5/Npc 6/quit");
				y = scanIn.nextInt();
				
			switch(y){
			
			
			case 1:
				
			String tipoD;
			int qntD;
			
			Criar dinheiro = new Criar(senha2);
			
			
			do{
				
				System.out.println("deseja criar novas conchas?: 1/sim  2/nao");
				x = scanIn.nextInt();
				if(x == 1){
				
					System.out.println("qual o tamanha das conchas(pequena/media/grande): ");
					tipoD = scanIn.next();
					
					
					System.out.println("quantas conchas " + tipoD + " :");
					qntD = scanIn.nextInt();
				
					
					Dinheiro concha = new Dinheiro(tipoD, qntD);
					
					dinheiro.criarDinheiro(adm.getSenha(), senha2, concha);
					dinheiro.listarDinheiro();
					
				}
				
			
			}while(x==1);
			
			
			
			
			dinheiro.listarDinheiro();
			break;
			case 2:

				String nomeM;
				String tipoM;
				int lvlM;
				ArrayList<Dinheiro> conchas = new ArrayList<Dinheiro>();
				Item item1 = null;
				
				randomica.nextInt(50);
				
				Criar inimigo = new Criar(senha2);
				
			
			/*	do{
					System.out.println("deseja criar um novo monstro?: 1/sim  2/nao");
					x = scanIn.nextInt();
					
					if(x==1){
						
						System.out.println("qual o nome do monstro");
						nomeM = scanIn.next();
					
						System.out.println("qual o tipo do monstro");
						tipoM = scanIn.next();
						
						System.out.println("qual o lvl do monstro");
						lvlM = scanIn.nextInt();
						
						
						//gerando randomicamente o loot de dinheiro
						
						String tipoConcha = null;
						
						
						
							int numeroGerado = 0;
							int numeroGerado2 = randomica.nextInt(3) + 1;
							
							
							switch(numeroGerado2){
							case 1:
								tipoConcha = "grande";
								Item item2 = new Item("espada", 1234, "+1 atk");
								numeroGerado = randomica.nextInt(50000) + 1;
								item1 = item2;
								
								break;
							case 2:
								tipoConcha = "media";
								Item item3 = new Item("machado", 1234, "+3 atk");
								numeroGerado = randomica.nextInt(500) + 1;
								item1 = item3;
								
								break;
							case 3:
								tipoConcha = "pequena";
								Item item4 = new Item("potion", 1234, "+5 hp");
								numeroGerado = randomica.nextInt(5) + 1;
								item1 = item4;
								
								break;
							}
						
							Dinheiro dinheiros = new Dinheiro(tipoConcha, numeroGerado);
							
							
							
							inimigo.criarDinheiro(adm.getSenha(), senha2, dinheiros);
							
							
						
						
						Inimigo monstro = new Inimigo(nomeM, lvlM, tipoM);
						Loot loot = new Loot(dinheiros, item1);
						inimigo.CriarLoot(adm.getSenha(), senha2, loot);
						loot.setInimigo(monstro);
						monstro.getLoot().setConchas(dinheiros);
						inimigo.CriarMonstro(adm.getSenha(), senha2, monstro);
						inimigo.listarInimigo();
						loot.listarLoot();
						conchas.clear();
						
					}
					
				}while(x==1);
				
				inimigo.listarInimigo();
				*/
				System.out.print("area em manutencao!\n");
			break;
			case 3:
				//implementacao Item.
				String nomeI;
				int codI;
				int bonusI;
				String tipoI;
				Item item11 = new Item();
				
				Criar itens = new Criar(senha2);
				do{
					System.out.println("Deseja criar um novo item?: 1/sim 2/não");
					x=scanIn.nextInt();
					if (x==1){
						
						
						System.out.println("Qual o tipo do item?(arma/vertimenta/consumivel)");
						tipoI= scanIn.next();
						
						System.out.println("Qual o nome do item?");
						nomeI= scanIn.next();
						
						System.out.println("Qual o código do item?");
						codI= scanIn.nextInt();
						
						System.out.println("Qual o bônus do item?");
						bonusI= scanIn.nextInt();
						
						if(tipoI.equalsIgnoreCase("arma")){
							Arma arma = new Arma(nomeI, codI, bonusI);
							item11.adicionaItem(arma);
						}else if(tipoI.equalsIgnoreCase("vestimenta")){
							Vestimenta vestimenta = new Vestimenta(nomeI, codI, bonusI);
							item11.adicionaItem(vestimenta);
						}else if(tipoI.equalsIgnoreCase("consumivel")){
							Consumivel consumivel = new Consumivel(nomeI, codI, bonusI);
							item11.adicionaItem(consumivel);
						}
						
						item11.listarItens();
							
					}
				} while (x==1);
				item11.listarItens();
			
			break;
			case 4:
				
				String nomeL;
				String tipoL;
			
				
				
				Criar loja = new Criar(senha2);
				Loja loja1 = new Loja();
				do{
					int a = 1;
					System.out.println("Deseja criar uma nova loja?: 1/sim 2/não");
					x=scanIn.nextInt();
					if (x==1){
						
						System.out.println("Qual o nome da loja?");
						nomeL= scanIn.next();
						
						System.out.println("Qual o tipo de itens que ela vende?");
						tipoL= scanIn.next();
						
						loja1 = new Loja(nomeL, tipoL);
						loja.criarLoja(adm.getSenha(), senha2, loja1);
					
						do{
							System.out.println("Deseja adicionar um item a loja?: 1/sim 2/não");
							a=scanIn.nextInt();
							if(a==1){
								
								
								
								System.out.println("Qual o nome do item?");
								nomeI= scanIn.next();
								
								System.out.println("Qual o código do item?");
								codI= scanIn.nextInt();
								
								System.out.println("Qual o bônus do item?");
								bonusI= scanIn.nextInt();
								
								if(tipoL.equalsIgnoreCase("arma")){
									Arma arma = new Arma(nomeI, codI, bonusI);
									loja1.adicionaItem(arma);
								}else if(tipoL.equalsIgnoreCase("vestimenta")){
									Vestimenta vestimenta = new Vestimenta(nomeI, codI, bonusI);
									loja1.adicionaItem(vestimenta);
								}else if(tipoL.equalsIgnoreCase("consumivel")){
									Consumivel consumivel = new Consumivel(nomeI, codI, bonusI);
									loja1.adicionaItem(consumivel);
								}
								
								loja1.listarItens();
							}
						}while (a==1);
						
						loja.listarloja();
					}
				}while(x==1);
				
				
			break;
			
			case 5:
				//implementacao Npc.
				 String nomeN;
                 int funcaoN;
                 int sexoN;
                 
                 Criar NPC = new Criar(senha2);
                 do{
                         System.out.println("Deseja criar um novo npc? : 1/sim 2/nao");
                         x=scanIn.nextInt();
                         if (x==1){
                                 
                                 System.out.println("Qual o sexo do npc?: 1/feminino 2/masculino");
                                 sexoN=scanIn.nextInt();
                                 
                                 System.out.println("Qual o nome do npc?: 1/informante 2/auxiliar 3/negociante");
                                 funcaoN= scanIn.nextInt();
                                 
                                 System.out.println("Qual o nome do npc? ");
                                 nomeN= scanIn.next();
                                 
                                 NPC npc= new NPC(nomeN, funcaoN, sexoN);
                                 NPC.criarNPC(adm.getSenha(), senha2, npc);
                                 npc.listarNPC(NPC.getNPC());
                         }
                 } while (x==1);
                 
                 
			
			break;
			}
			
			}while(y<6);
				System.out.println("Adeus!!!");
				
			}else{
				System.out.println("Autorizacao Negada!");
			}
			
		}else if(z==1){
			
			String nomeP;
			String sexoP;
			
			Criar jogador = new Criar();
			Player player = new Player();
			
			
			do{
			
				System.out.println("Voce e homem ou mulher?");
				sexoP = scanIn.next();
				player.validaPlayer(sexoP);
				
			}while(player.validaPlayer(sexoP) == false);
			
			int verificaNome = 2;
			do{
				System.out.println("qual o seu nome: ");
				nomeP = scanIn.next();
				
				System.out.println("Seu nome e: " + nomeP + "\n1/Sim 2/Nao");
				verificaNome = scanIn.nextInt();
			
			}while(verificaNome == 2);
			
			player = new Player(nomeP, sexoP, 1);
			jogador.criarPlayer(player);
			
			System.out.println("\n\n"+player.getNome() + " lvl: " + player.getLvl() + "  hp: " + player.getHp() + " atk:  " + player.getAtk() + " def: " + player.getDef());
			
			for (int i = 1; i > 0; i++) {
				

				int numeroGerado3 = randomica.nextInt(6) + 1;

				InimigoEvento inimigo1 = new InimigoEvento();
				switch(numeroGerado3){
				case 1:
					//, 30 , 25, 65
					inimigo1 = new InimigoEvento("jav", 11, "javali");
					break;
				case 2:
					inimigo1 = new InimigoEvento("veloc", 11, "velociraptor");
					break;
				case 3:
					inimigo1 = new InimigoEvento("many", 12, "mamute");
					break;
				case 4:
					inimigo1 = new InimigoEvento("esquilo", 9, "esquilo gigante pre-historico");
					break;
				case 5:
					inimigo1 = new InimigoEvento("ptero", 12, "pterodactil");
					break;
				case 6:
					inimigo1 = new InimigoEvento("diego", 13, "tigre-dente-de-sabre");
					break;
				}


				BatalhaTurno batalha1 = new BatalhaTurno();
				batalha1.batalha(player, inimigo1);
				
				
				if (batalha1.isResultado() == false){
					break;
				}
			}


			
		}
		
		scanIn.close();
		
	}

}
