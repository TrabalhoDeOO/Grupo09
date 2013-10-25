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
		Vestimenta[] itemV = new Vestimenta[10];
		Consumivel[] itemC = new Consumivel[10];
		
		itemC[0] = new Consumivel("Maçã", 1, 2);
		itemC[1] = new Consumivel("Uvas", 2, 3);
		itemC[2] = new Consumivel("Batata", 3, 7);
		itemC[3] = new Consumivel("Bife de preguiça", 4, 9);
		itemC[4] = new Consumivel("Coxa pequena de Javali", 5, 9);
		itemC[5] = new Consumivel("Ensopado", 6, 13);
		itemC[6] = new Consumivel("Coxa grande de Javali", 7, 16);
		itemC[7] = new Consumivel("Guisado de Mamute", 8, 20);
		itemC[8] = new Consumivel("Ovo de Pterodactil", 9, 22);
		itemC[9] = new Consumivel("Javali Assado", 10, 30);
		
		for(int i=0;i<10;i++){
			grimorioItens.add(itemC[i]);
		}
		//comeca na posicao 10 do array
		itemA[0] = new Arma("Porrete", 11, 1);
		itemA[1] = new Arma("Garra de Preguiça", 12, 1);
		itemA[2] = new Arma("Dente Danificado de Javali", 13, 1);
		itemA[3] = new Arma("Dente de Javali", 14, 2);
		itemA[4] = new Arma("Garra de velocirraptor", 15, 3);
		itemA[5] = new Arma("Presa de Mamute", 16, 4);
		itemA[6] = new Arma("Dente de Sabre", 17, 5);
		itemA[7] = new Arma("Femur de Mamute", 18, 6);
		itemA[8] = new Arma("Lança de Pterodactil", 19, 7);		
		itemA[9] = new Arma("Presa de Javali-Gigante", 20, 10);
		
		for(int i=0;i<10;i++){
			grimorioItens.add(itemA[i]);
		}
		//comeca na posicao 20 do array
		itemV[1] = new Vestimenta("Cinto de Preguiça", 21, 1);
		itemV[2] = new Vestimenta("Luva de javali", 22, 1);
		itemV[3] = new Vestimenta("Bota de javali", 23, 1);
		itemV[4] = new Vestimenta("Casaco de javali", 24, 1);
		itemV[5] = new Vestimenta("Elmo de Velociraptor", 25, 2);
		itemV[6] = new Vestimenta("Casaco de Mamute", 26, 3);
		itemV[7] = new Vestimenta("Bota de Mamute", 27, 3);
		itemV[8] = new Vestimenta("Manto de Mamute", 28, 3);
		itemV[9] = new Vestimenta("Armadura de Javali Gigante", 29, 5);
		
		for(int i=0;i<10;i++){
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
