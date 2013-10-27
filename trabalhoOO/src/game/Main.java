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
import game.entidade.grimorio.Grimorio;
import game.entidade.grimorio.GrimorioItens;

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
		
		GrimorioItens grimorioI = new GrimorioItens();
		
		//grimorioI.listarGrimorioItem();
		Grimorio grimorio = new Grimorio();
		//grimorio.listarGrimorio();
		
		
		
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
				//conchas
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
				
					
					
					
					dinheiro.criarDinheiro(adm.getSenha(), senha2, tipoD, qntD);
					
					
				}
				
			
			}while(x==1);
			
			
			
			
			
			break;
			case 2:
					//monstro
				String nomeM;
				String tipoM, tipoIn;
				int lvlM;
				int jump = 3;
				ArrayList<Dinheiro> conchas = new ArrayList<Dinheiro>();
				Item item1 = null;
				
				randomica.nextInt(50);
				
				Criar inimigo = new Criar(senha2);
				InimigoPlataforma monstro1;
				InimigoEvento monstro2;
				
			
				do{
					System.out.println("deseja criar um novo monstro?: 1/sim  2/nao");
					x = scanIn.nextInt();
					
					if(x==1){
						
						System.out.println("qual o tipo do monstro?: a- Inimigo Plataforma b- Inimigo BatalhaTurno");
						tipoM = scanIn.next();

						System.out.println("qual o nome do monstro");
						nomeM = scanIn.next();
						
						System.out.println("qual a especie do monstro?");
						tipoIn = scanIn.next();
					
						System.out.println("qual o lvl do monstro");
						lvlM = scanIn.nextInt();
						
						if(tipoM.equalsIgnoreCase("a")){
							System.out.println("qual o jump do monstro");
							jump = scanIn.nextInt();
							
							monstro1 = (InimigoPlataforma) inimigo.CriarMonstro(adm.getSenha(), senha2, nomeM, tipoM, tipoIn, lvlM, jump);
						}else if (tipoM.equalsIgnoreCase("b")){
							
							monstro2 = (InimigoEvento) inimigo.CriarMonstro(adm.getSenha(), senha2, nomeM, tipoM, tipoIn, lvlM, jump);
								
						}		
						
						inimigo.listarInimigo();
						}
						
						//gerando randomicamente o loot de dinheiro
						
						/*String tipoConcha = null;
						
						
						
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
							
							
						
						
						Inimigo monstro = new InimigoEvento(nomeM, lvlM, tipoM);
						Loot loot = new Loot(dinheiros, item1);
						inimigo.CriarLoot(adm.getSenha(), senha2, loot);
						loot.setInimigo(monstro);
						monstro.getLoot().setConchas(dinheiros);
						inimigo.CriarMonstro(adm.getSenha(), senha2, monstro);
						inimigo.listarInimigo();
						loot.listarLoot();
						conchas.clear();
						
					}
					*/
				}while(x==1);
				
				//inimigo.listarInimigoEvento();
			//}
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
				//loja
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
						
						
						loja1 = loja.criarLoja(adm.getSenha(), senha2, nomeL, tipoL);
					
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
                 NPC npc = new NPC();
                 
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
                                 
                                 
                                 npc = NPC.criarNPC(adm.getSenha(), senha2,nomeN, funcaoN, sexoN);
                                 npc.listarNPC(NPC.getNPC());
                         }
                 } while (x==1);
                 
                 npc.listarNPC(NPC.getNPC());
			
			break;
			}
			
			}while(y<6);
				System.out.println("Adeus!!!");
				
			}else{
				System.out.println("Autorizacao Negada!");
			}
		
		// TODO Ação Player 	
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
			verificaTutorial = scanIn.nextInt();
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
						". E para decidir quem ira comecar atacando levamos em conta a speed dos 2\n" +
						"Bom Jogo!!!\n");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			player = new Player(player.getNome(), player.getSexo(), 7);
			System.out.println(player.getStatus());
			
			player.adicionaItem(grimorioI.getGrimorioItens().get(6));
			player.adicionaItem(grimorioI.getGrimorioItens().get(7));
			player.adicionaItem(grimorioI.getGrimorioItens().get(8));
			
			//player.listarMochila();
			
			for (int i = 1; i > 0; i++) {
				

				int numeroGerado3 = randomica.nextInt(10);
				int senha1 = 1234;
				int senh2 = 1234;

				InimigoEvento inimigo1 = new InimigoEvento();
				Criar batalha = new Criar();
				
				Arma lootI;
				Dinheiro lootD;
				int verificaDescanco;
				
				int hpMax = player.getHpMax();
				
				//System.out.println( " xp:" +player.getXp()+"/"+player.getXpMax());
				
				
				inimigo1 = grimorio.getGrimorioInimigos().get(numeroGerado3);
				
				
				
				BatalhaTurno batalha1 = new BatalhaTurno();
				player = batalha1.batalha(player, inimigo1);
				
				
				
				
				
				if (batalha1.isResultado() == false){
					break;
				}
				//isso sera substituido pelo consumivel em breve
				System.out.println(player.getNome() +" - hp: "+ player.getHp() +"/"+ player.getHpMax());
				System.out.println("\nDeseja comer algo(comer resulta em recuperar todo seu hp voce ainda tem " + player.getMochila().size() +" alimentos)? 1/sim 2/nao");
				verificaDescanco = scanIn.nextInt();
				
				
					int numeroDoAlimentoSelecionado = -1;
					
					
					if(verificaDescanco ==1){
						if ( player.getMochila().size() >0){
							
							player.listarMochila();
							System.out.println("voce deseja comer qual item?(insira apenas o numero que esta antes do nome do item)");
							numeroDoAlimentoSelecionado = scanIn.nextInt();
							
							player.verificarItem(player.getMochila().get(numeroDoAlimentoSelecionado));
							player.getMochila().remove(numeroDoAlimentoSelecionado);
							
							
						}else{
							System.out.println("mochila vazia");
						}
					}
					
				
			}


			
		}
		
		scanIn.close();
		
	}

}
