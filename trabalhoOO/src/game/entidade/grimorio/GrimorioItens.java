package game.entidade.grimorio;

import game.entidade.Arma;
import game.entidade.Consumivel;
import game.entidade.Item;
import game.entidade.Vestimenta;

import java.util.ArrayList;

public class GrimorioItens {
	
	private ArrayList<Item> grimorioItens = new ArrayList<Item>(); 

	public GrimorioItens() {
		criarGrimorioItens();
	}
	
	private void criarGrimorioItens(){
		// TODO Inicio da lista de Itens
		
		/**
		 * 0-9 Consumiveis
		 * 10-19 Armas
		 * 20-29 Vestimentas
		 */
		
		Arma[] itemA = new Arma[20];
		Vestimenta[] itemV = new Vestimenta[20];
		Consumivel[] itemC = new Consumivel[20];
		
		itemC[0] = new Consumivel("Maçã", 0, 2, 1);
		itemC[0].criarDescricao("Fruta muito encontrada nas planícies do Sul.");
		itemC[1] = new Consumivel("Uvas", 1, 3, 1);
		itemC[1].criarDescricao("Alimento exótico, parece bom.");
		itemC[2] = new Consumivel("Batata", 2, 7, 1);
		itemC[2].criarDescricao("Alimento que aparenta dar uma certa sustância. Um dia irao descobrir que pode ser frita");
		itemC[3] = new Consumivel("Bife de preguiça", 3, 9, 2);
		itemC[3].criarDescricao("Bife pequeno, mas deve manter você por um tempo. Dica? Procure uma batata também.");
		itemC[4] = new Consumivel("Coxa pequena de Javali", 4, 9, 2);
		itemC[4].criarDescricao("Uma recompensa razoável por um esforço razoável.");
		itemC[5] = new Consumivel("Ensopado", 5, 13, 2);
		itemC[5].criarDescricao("Excelente para o tempo frio, adicione umas ervas e cogumelos e veja a \"mágica\"");
		itemC[6] = new Consumivel("Coxa grande de Javali", 6, 16, 3);
		itemC[6].criarDescricao("Você provavelmente gastou muita energia com esse desafio. Essa é a sua recompensa");
		itemC[7] = new Consumivel("Guisado de Mamute", 7, 20, 3);
		itemC[7].criarDescricao("Esse sim, é um excelente reforço para sua jornada");
		itemC[8] = new Consumivel("Ovo de Pterodactil", 8, 22, 4);
		itemC[8].criarDescricao("Alimento perigosamente delicioso. Inclusive, melhor vigiar as redondezas, pro seu bem");
		itemC[9] = new Consumivel("Javali Assado", 9, 30, 9);
		itemC[9].criarDescricao("Dá um certo trabalho no preparo, mas é uma das opções que mais garante sustância e força durante a jornada.");
		itemC[10] = new Consumivel("Carne Envenenada", 10, -2, 1);
		itemC[10].criarDescricao("Se você for sabio não irá comer dessa carne.");
		itemC[11] = new Consumivel("Lagarto Assado", 11, 2, 2);
		itemC[11].criarDescricao("O nome é um tanto quanto dubil, já que não se sabe o que" +
				"essa criatura é...");
		itemC[12] = new Consumivel("Lingua de Rinoceronte", 12, 2, 1);
		itemC[12].criarDescricao("Não parece nada agradavel comer isto...");
		itemC[13] = new Consumivel("Farofa de Tatu", 13, 3, 3);
		itemC[13].criarDescricao("Especiaria para caçadores famintos. Engraçado que ela já vem com uma tigela propria.");
		itemC[14] = new Consumivel("Bolota Roxa", 14, 4, 5);
		itemC[14].criarDescricao("Fruto proveniente de árvores gigantes localizadas perto de abismos.\n" +
				"Pode se dizer que essa fruta é um tanto quanto rara.");
		itemC[15] = new Consumivel("Gosma", 15, 0, 1);
		itemC[15].criarDescricao("Muco pegajoso de cor verde. Não tem uma cara comestível,\n" +
				"talvez não sirva para mais nada, a não ser melecar tudo.");
		itemC[16] = new Consumivel("Sopa Escarlate", 16, 3, 3);
		itemC[16].criarDescricao("Uma guarnição exótica apreciada apenas pelos mais\n" +
				"exêntricos dos seres.");
		itemC[17] = new Consumivel("Bife Linho", 17, 4, 6);
		itemC[17].criarDescricao("Pedaço de carne de um especime de Lince Prateado.\n" +
				"Apesar do nome, a carne é um bem vermelha.");
		
		for(int i=0;i<18;i++){
			grimorioItens.add(itemC[i]);
		}
		//comeca na posicao 10 do array
		itemA[0] = new Arma("Porrete", 18, 1, 1);
		itemA[0].criarDescricao("Um pedaço, um tanto quanto avantajado, de madeira desgastada.\n" +
				"Arma perfeita para um Neanderthal alfa.");
		itemA[1] = new Arma("Garra de Preguiça", 19, 1, 1);
		itemA[1].criarDescricao("É pequena, mas deve servir para rasgar alguma coisa pequena. talvez outra preguiça?");
		itemA[2] = new Arma("Dente Danificado de Javali", 20, 1, 1);
		itemA[2].criarDescricao("Devia ter tomado mais cuidado ao acertar a cara desse javali. Ainda serve para furar algo.");
		itemA[3] = new Arma("Dente de Javali", 21, 2, 2);
		itemA[3].criarDescricao("Esse parece estar ok. Alguma coisa poderia ser feita dele. Uma faca, talvez?");
		itemA[4] = new Arma("Garra de velocirraptor", 22, 3, 3);
		itemA[4].criarDescricao("Um pouco curva demais, mas deve servir para movimentos rápidos.");
		itemA[5] = new Arma("Presa de Mamute", 23, 4, 2);
		itemA[5].criarDescricao("Esse sim dá uma excelente adaga. Que venham mais mamutes!");
		itemA[6] = new Arma("Dente de Sabre", 24, 5, 5);
		itemA[6].criarDescricao(" Adaga arrancada do cadaver de um Tigre Dentes-de-Sabre. \n" +
				"\"Acho que ele não vai mais precisar disso...\" Raridade: R");
		itemA[7] = new Arma("Femur de Mamute", 25, 6, 5);
		itemA[7].criarDescricao("O grito de dor do mamute lembra bastante o som da espada feita de seu fêmur.");
		itemA[8] = new Arma("Lança de Pterodactil", 26, 7, 4);
		itemA[8].criarDescricao("Lança criada a partir do bico de um Pterodactil.");
		itemA[9] = new Arma("Presa de Javali-Gigante", 27, 10, 9);
		itemA[9].criarDescricao("Uma baita espada longa que evitará que você -quase- se torne uma panqueca de neandertal.");
		itemA[10] = new Arma("Presa Venenosa", 28, 2, 1);
		itemA[10].criarDescricao("Uma Adaga curta sem corte, porém um arranhão e a morte do inimigo é certa");
		itemA[11] = new Arma("Punhal de Marfim", 29, 3, 2);
		itemA[11].criarDescricao("Uma arma perfeita para combates de curto alcance.");
		itemA[12] = new Arma("Soqueira Prateada", 30, 5, 6);
		itemA[12].criarDescricao("Arma feita a partir das presas do maxilar de um felino.\n" +
				"Essa arma fornece uma mobilidade sem igual, é como se estivesse\n" +
				"usando apenas os punhos. Raridade: SS");
		
		for(int i=0;i<13;i++){
			grimorioItens.add(itemA[i]);
		}
		//comeca na posicao 20 do array
		itemV[0] = new Vestimenta("Tanga de Preguiça", 31, 1, 1);
		itemV[0].criarDescricao("Uma vestimenta mal feita a partir de um pedaço de pele de Preguiça.");
		itemV[1] = new Vestimenta("Cinto de Preguiça", 32, 1, 1);
		itemV[1].criarDescricao("Uma vestimenta mal feita a partir de um pedaço de pele de Preguiça.");
		itemV[2] = new Vestimenta("Luva de javali", 33, 1, 2);
		itemV[2].criarDescricao("Um par de Luvas feito para trabalho pesado. Pedaço de vestimenta\n" +
				"normalmente feita a partir das sobras de pele do animal.");
		itemV[3] = new Vestimenta("Bota de javali", 34, 1, 2);
		itemV[3].criarDescricao("Um par de Botas feito para longas caminhadas, são ótimas para enfrentar o frio.\n" +
				"Pedaço de vestimenta normalmente feita a partir das sobras de pele do animal.");
		itemV[4] = new Vestimenta("Casaco de javali", 35, 1, 3);
		itemV[4].criarDescricao("Incrivelmente fedorento, mas de uma resistência impressionante.");
		itemV[5] = new Vestimenta("Elmo de Velociraptor", 36, 2, 3);
		itemV[5].criarDescricao("É incrível como essa caveira se encaixa perfeitamente em sua cabeça!");
		itemV[6] = new Vestimenta("Casaco de Mamute", 37, 3, 3);
		itemV[6].criarDescricao("Tem cheiro de guisado. É bem quente, o frio não lhe afetará");
		itemV[7] = new Vestimenta("Bota de Mamute", 38, 3, 3);
		itemV[7].criarDescricao("Perfeita para andar no gelo. Péssima para andar em lama");
		itemV[8] = new Vestimenta("Manto de Mamute", 39, 3, 4);
		itemV[8].criarDescricao("Você parece um mago com essa roupa, porém você não tem ideia do que eu estou falando.");
		itemV[9] = new Vestimenta("Armadura de Javali Gigante", 40, 5, 6);
		itemV[9].criarDescricao("Bastante desengonçada, mas faz você sobreviver a um encontro com um mamute.");
		itemV[10] = new Vestimenta("Pele de Dentes-de-Sabre", 41, 2, 5);
		itemV[10].criarDescricao("Não é tão pesada e resistente quanto as outras, mas dá um certo charme e bastante mobilidade");
		itemV[11] = new Vestimenta("Cinto de Pelagem Vermelha", 42, 1, 1);
		itemV[11].criarDescricao("Cinto felpudo perfeito para segurar a calça que você não tem.");	
		itemV[12] = new Vestimenta("Colete Esperço", 43, 3, 3);
		itemV[12].criarDescricao("Protótipo de uma armadura, feito de pelos trançados, bem resistente a pancadas.");
		itemV[13] = new Vestimenta("Armadura de Placas", 44, 4, 3);
		itemV[13].criarDescricao("Armadura criada a partir de pedaços de uma carapaça resitente.");
		itemV[14] = new Vestimenta("Manto listrado", 45, 2, 3);
		itemV[14].criarDescricao("Não é a melhor armadura, mas ninguem nega que qualquer um fica bem sob essa pele.");
		
		for(int i=0;i<15;i++){
			grimorioItens.add(itemV[i]);
		}
	}
	
	public ArrayList<Item> getGrimorioItens() {
		return grimorioItens;
	}
	
	public void listarGrimorioItem(){
		for(int i = 0; i < grimorioItens.size(); i++){
			System.out.println(grimorioItens.get(i));			
		}
	}
}
