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
		
		Arma[] itemA = new Arma[10];
		Vestimenta[] itemV = new Vestimenta[11];
		Consumivel[] itemC = new Consumivel[10];
		
		itemC[0] = new Consumivel("Maçã", 0, 2);
		itemC[0].criarDescricao("Fruta muito encontrada nas planícies do Sul.");
		itemC[1] = new Consumivel("Uvas", 1, 3);
		itemC[1].criarDescricao("Alimento exótico, parece bom.");
		itemC[2] = new Consumivel("Batata", 2, 7);
		itemC[2].criarDescricao("Alimento que aparenta dar uma certa sustância. Um dia irao descobrir que pode ser frita");
		itemC[3] = new Consumivel("Bife de preguiça", 3, 9);
		itemC[3].criarDescricao("Bife pequeno, mas deve manter você por um tempo. Dica? Procure uma batata também.");
		itemC[4] = new Consumivel("Coxa pequena de Javali", 4, 9);
		itemC[4].criarDescricao("Uma recompensa razoável por um esforço razoável.");
		itemC[5] = new Consumivel("Ensopado", 5, 13);
		itemC[5].criarDescricao("Excelente para o tempo frio, adicione umas ervas e cogumelos e veja a 'mágica'");
		itemC[6] = new Consumivel("Coxa grande de Javali", 6, 16);
		itemC[6].criarDescricao("Você provavelmente gastou muita energia com esse desafio. Essa é a sua recompensa");
		itemC[7] = new Consumivel("Guisado de Mamute", 7, 20);
		itemC[7].criarDescricao("Esse sim, é um excelente reforço para sua jornada");
		itemC[8] = new Consumivel("Ovo de Pterodactil", 8, 22);
		itemC[8].criarDescricao("Alimento perigosamente delicioso. Inclusive, melhor vigiar as redondezas, pro seu bem");
		itemC[9] = new Consumivel("Javali Assado", 9, 30);
		itemC[9].criarDescricao("Dá um certo trabalho no preparo, mas é uma das opções que mais garante sustância e força durante a jornada.");
		
		for(int i=0;i<10;i++){
			grimorioItens.add(itemC[i]);
		}
		//comeca na posicao 10 do array
		itemA[0] = new Arma("Porrete", 10, 1);
		itemA[0].criarDescricao("Um pedaço, um tanto quanto avantajado, de madeira desgastada.\n" +
				"Arma perfeita para um Neanderthal alfa.");
		itemA[1] = new Arma("Garra de Preguiça", 11, 1);
		itemA[1].criarDescricao("É pequena, mas deve servir para rasgar alguma coisa pequena. talvez outra preguiça?");
		itemA[2] = new Arma("Dente Danificado de Javali", 12, 1);
		itemA[2].criarDescricao("Devia ter tomado mais cuidado ao acertar a cara desse javali. Ainda serve para furar algo.");
		itemA[3] = new Arma("Dente de Javali", 13, 2);
		itemA[3].criarDescricao("Esse parece estar ok. Alguma coisa poderia ser feita dele. Uma faca, talvez?");
		itemA[4] = new Arma("Garra de velocirraptor", 14, 3);
		itemA[4].criarDescricao("Um pouco curva demais, mas deve servir para movimentos rápidos.");
		itemA[5] = new Arma("Presa de Mamute", 15, 4);
		itemA[5].criarDescricao("Esse sim dá uma excelente adaga. Que venham mais mamutes!");
		itemA[6] = new Arma("Dente de Sabre", 16, 5);
		itemA[6].criarDescricao(" Adaga arrancada do cadaver de um Tigre Dentes-de-Sabre. \n" +
				"\"Acho que ele não vai mais precisar disso...\" Raridade: R");
		itemA[7] = new Arma("Femur de Mamute", 17, 6);
		itemA[7].criarDescricao("O grito de dor do mamute lembra bastante o som da espada feita de seu fêmur.");
		itemA[8] = new Arma("Lança de Pterodactil", 18, 7);
		itemA[8].criarDescricao("Quando usar, lembre-se que você quase virou petisco dele.");
		itemA[9] = new Arma("Presa de Javali-Gigante", 19, 10);
		itemA[9].criarDescricao("Uma baita espada longa que evitará que você -quase- se torne uma panqueca de neandertal.");
		
		for(int i=0;i<10;i++){
			grimorioItens.add(itemA[i]);
		}
		//comeca na posicao 20 do array
		itemV[0] = new Vestimenta("Tanga de Preguiça", 20, 1);
		itemV[0].criarDescricao("Uma vestimenta mal feita a partir de um pedaço de pele de Preguiça.");
		itemV[1] = new Vestimenta("Cinto de Preguiça", 21, 1);
		itemV[1].criarDescricao("Uma vestimenta mal feita a partir de um pedaço de pele de Preguiça.");
		itemV[2] = new Vestimenta("Luva de javali", 22, 1);
		itemV[2].criarDescricao("Um par de Luvas feito para trabalho pesadoPedaço de vestimenta\n" +
				"normalmente feita a partir das sobras de pele do animal.");
		itemV[3] = new Vestimenta("Bota de javali", 23, 1);
		itemV[3].criarDescricao("Um par de Botas feito para longas caminhadas, são ótimas para enfrentar o frio.\n" +
				"Pedaço de vestimenta normalmente feita a partir das sobras de pele do animal.");
		itemV[4] = new Vestimenta("Casaco de javali", 24, 1);
		itemV[4].criarDescricao("Incrivelmente fedorento, mas de uma resistência impressionante.");
		itemV[5] = new Vestimenta("Elmo de Velociraptor", 25, 2);
		itemV[5].criarDescricao("É incrível como essa caveira se encaixa perfeitamente em sua cabeça!");
		itemV[6] = new Vestimenta("Casaco de Mamute", 26, 3);
		itemV[6].criarDescricao("Tem cheiro de guisado. É bem quente, o frio não lhe afetará");
		itemV[7] = new Vestimenta("Bota de Mamute", 27, 3);
		itemV[7].criarDescricao("Perfeita para andar no gelo. Péssima para andar em lama");
		itemV[8] = new Vestimenta("Manto de Mamute", 28, 3);
		itemV[8].criarDescricao("Você parece um mago com essa roupa, porém você não tem ideia do que eu estou falando.");
		itemV[9] = new Vestimenta("Armadura de Javali Gigante", 29, 5);
		itemV[9].criarDescricao("Bastante desengonçada, mas faz você sobreviver a um encontro com um mamute.");
		itemV[10] = new Vestimenta("Pele de Dentes-de-Sabre", 30, 2);
		itemV[10].criarDescricao("Não é tão pesada e resistente quanto as outras, mas dá um certo charme e bastante mobilidade");
		
		for(int i=0;i<11;i++){
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
