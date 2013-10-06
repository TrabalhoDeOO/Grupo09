/**
 * 
 */
package game;
/**
 * 
 */

import game.entidade.Adm;
import game.entidade.Criar;
import game.entidade.Dinheiro;
import game.entidade.Inimigo;
import game.entidade.Loot;
import game.entidade.Player;
import game.entidade.Item;
import game.entidade.NPC;
import game.entidade.Loja;

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
				
			
				do{
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
								numeroGerado = randomica.nextInt(5) + 1;
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
								numeroGerado = randomica.nextInt(50000) + 1;
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
				
			break;
			case 3:
				//implementacao Item.
				String nomeI;
				int codI;
				String bonusI;
				
				
				Criar itens = new Criar(senha2);
				do{
					System.out.println("Deseja criar um novo item?: 1/sim 2/não");
					x=scanIn.nextInt();
					if (x==1){
						
						System.out.println("Qual o nome do item?");
						nomeI= scanIn.next();
						
						System.out.println("Qual o código do item?");
						codI= scanIn.nextInt();
						
						System.out.println("Qual o bônus do item?");
						bonusI= scanIn.next();
						
						Item item = new Item(nomeI, codI, bonusI);
						itens.criarItem(adm.getSenha(), senha2, item);
						itens.listarItens();
							
					}
				} while (x==1);
				itens.listarItens();
			
			break;
			case 4:
				//implementacao Loja.
				String nomeL;
				String tipoL;
				
				ArrayList<Item> itens1 = new ArrayList<Item>();
				
				Criar loja = new Criar(senha2);
				do{
					int a = 1;
					System.out.println("Deseja criar uma nova loja?: 1/sim 2/não");
					x=scanIn.nextInt();
					if (x==1){
						
						System.out.println("Qual o nome da loja?");
						nomeL= scanIn.next();
						
						System.out.println("Qual o tipo de itens que ela vende?");
						tipoL= scanIn.next();
						
						while(a == 1){
							if(loja.getItem().size()>2){
								a = 2;
							}else{
								System.out.println("Deseja adicionar um novo item a loja?: 1/sim 2/não");
								a=scanIn.nextInt();
								
	
								 if(a==1){
	
									System.out.println("Qual o nome do novo item ?");
									nomeI= scanIn.next();
								
									System.out.println("Qual o código do novo item ?");
									codI= scanIn.nextInt();
								
									System.out.println("Qual o bônus do novo item ?");
									bonusI= scanIn.next();
								
									
										Item item = new Item(nomeI, codI, bonusI);
										loja.criarItem(adm.getSenha(), senha2, item);
										Loja loja1 = new Loja(nomeL,tipoL, itens1);
										if(loja.getItem().size() == 1){
											loja.criarLoja(adm.getSenha(), senha2, loja1);
										}
									
									
									
									loja.listarItens();
									itens1 = loja.getItem();
									
									
								}
								 
							}
						}
						
						
						
						loja.listarloja();
						loja.listarItens();
						loja.getItem().clear();	
					}
				} while (x==1);
				loja.listarloja();
			
				//System.out.println("Area em desenvolvimento");
			break;
			
			case 5:
				//implementacao Npc.
				 String nomeN;
                 int funcaoN;
                 int sexoN;
                 
                 Criar NPC = new Criar(senha2);
                 do{
                         System.out.println("Deseja criar um novo npc? : 1/sim 2/n�o");
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
                                 NPC.listarNPC();
                         }
                 } while (x==1);
                 
                 NPC.listarNPC();
			
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
			
			
			
			do{
			
				System.out.println("Voce e homem ou mulher?");
				sexoP = scanIn.next();
				jogador.validaPlayer(sexoP);
				
			}while(jogador.validaPlayer(sexoP) == false);
			
			int verificaNome = 2;
			do{
				System.out.println("qual o seu nome: ");
				nomeP = scanIn.next();
				
				System.out.println("Seu nome e: " + nomeP + "\n1/Sim 2/Nao");
				verificaNome = scanIn.nextInt();
			
			}while(verificaNome == 2);
			
			Player player = new Player(nomeP, sexoP);
			jogador.criarPlayer(player);
			
			System.out.println(player.getNome() + " lvl: " + player.getLvl() + "  hp: " + player.getHp());
			
		}
		
		scanIn.close();
		
	}

}
