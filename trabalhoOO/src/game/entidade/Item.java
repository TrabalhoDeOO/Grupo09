package game.entidade;

import game.interfaces.Descricao;


public class Item implements Descricao {

	public String nomeItem;
	public int codItem;
	public int bonus;
	protected String desc="vazio";
	protected int valor = 0;
	

	public Item() {
		this.nomeItem = "nada";
		this.codItem= 0;
		
	}
	
	public Item(String nomeItem, int codItem){
		this.nomeItem= nomeItem;
		this.codItem= codItem;
		
	}
	
	public Item(String nomeItem, int codItem, int valor){
		this.nomeItem= nomeItem;
		this.codItem= codItem;
		this.valor=valor;
	}
	
	@Override
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\n--------\n" +
				"Valor: %d Concha(s)\n--------\n", nomeItem, codItem, valor);
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
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
		 
		return String.format("%s\t-\t%d\nDescrição: %s\n" +
				"Valor: %d Concha(s)\n",this.nomeItem, this.codItem, this.desc, this.valor);
	}
		
}
