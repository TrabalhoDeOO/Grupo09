package game.entidade;

import game.entidade.*;
import java.util.ArrayList;

public class Item {
	public ArrayList<Item> item = new ArrayList<Item>();
	public String nomeItem;
	public int codItem;
	public int bonus;
	
	

	public Item() {
		this.nomeItem = "...";
		this.codItem= 0;
		
	}
	
	public Item(String nomeItem, int codItem){
		this.nomeItem= nomeItem;
		this.codItem= codItem;
		
	}
	
	@Override
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\n--------\n", nomeItem, codItem);
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getCodItem() {
		return codItem;
	}

	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}
	
	
	public void adicionaItem(Item item1){
		item.add(item1);
		
	}

	public void listarItens(){
		for (int i=0;i<item.size(); i++){
			System.out.println(item.get(i));
		}			
	}
	
	public int getBonus(int bonus){
	  return 0;
	}
		
}
