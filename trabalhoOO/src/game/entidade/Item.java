package game.entidade;

//import game.entidade.*;
import game.interfaces.Descricao;

import java.util.ArrayList;

public class Item implements Descricao {
	public ArrayList<Item> item = new ArrayList<Item>();
	public String nomeItem;
	public int codItem;
	public int bonus;
	protected String desc="vazio";
	protected Dinheiro conchas = new Dinheiro();
	

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
	
	public int getBonus(){
	  return 0;
	}

	@Override
	public void criarDescricao(String desc) {
		this.desc = desc;
	}

	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%d\nDescrição: %s\n",this.nomeItem, this.codItem, this.desc);
	}
		
}
