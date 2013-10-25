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
		
		itemC[0] = new Consumivel("Maçã", 0001, 2);
		itemC[1] = new Consumivel("Uvas", 0002, 3);
		itemC[2] = new Consumivel("Batata", 0003, 7);
		itemC[3] = new Consumivel("Bife de preguiça", 0004, 9);
		itemC[4] = new Consumivel("Coxa pequena de Javali", 0005, 9);
		itemC[5] = new Consumivel("Ensopado", 0006, 13);
		itemC[6] = new Consumivel("Coxa grande de Javali", 0007, 16);
		itemC[7] = new Consumivel("Guisado de Mamute", 0010, 20);
		itemC[8] = new Consumivel("Ovo de Pterodactil", 0011, 22);
		itemC[9] = new Consumivel("Javali Assado", 0012, 30);
		
		for(int i=0;i<10;i++){
			grimorioItens.add(itemC[i]);
		}
				
		itemA[0] = new Arma("Porrete", 0013, 1);
		itemA[1] = new Arma("Garra de Preguiça", 0014, 1);
		itemA[2] = new Arma("Dente Danificado de Javali", 0015, 1);
		itemA[3] = new Arma("Dente de Javali", 0016, 2);
		itemA[4] = new Arma("Garra de velocirraptor", 0017, 3);
		itemA[5] = new Arma("Presa de Mamute", 0020, 4);
		itemA[6] = new Arma("Dente de Sabre", 0021, 5);
		itemA[7] = new Arma("Femur de Mamute", 0021, 6);
		itemA[8] = new Arma("Lança de Pterodactil", 0022, 7);		
		itemA[9] = new Arma("Presa de Javali-Gigante", 0023, 10);
		
		for(int i=0;i<10;i++){
			grimorioItens.add(itemA[i]);
		}
		
		itemV[1] = new Vestimenta("Cinto de Preguiça", 0024, 1);
		itemV[2] = new Vestimenta("Luva de javali", 0025, 1);
		itemV[3] = new Vestimenta("Bota de javali", 0026, 1);
		itemV[4] = new Vestimenta("Casaco de javali", 0027, 1);
		itemV[5] = new Vestimenta("Elmo de Velociraptor", 0030, 2);
		itemV[6] = new Vestimenta("Casaco de Mamute", 0031, 3);
		itemV[7] = new Vestimenta("Bota de Mamute", 0032, 3);
		itemV[8] = new Vestimenta("Manto de Mamute", 0031, 3);
		itemV[9] = new Vestimenta("Armadura de Javali Gigante", 0033, 5);
		
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
