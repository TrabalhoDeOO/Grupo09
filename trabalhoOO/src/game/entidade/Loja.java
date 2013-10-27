package game.entidade;

import game.interfaces.Descricao;

import java.util.ArrayList;

public class Loja implements Descricao{

	public String nomeLoja;
	public String tipoLoja;
	ArrayList<Item> itens = new ArrayList<Item>();
	private String desc="vazio";
	
	public Loja() {
		
		this.nomeLoja = "...";
		this.tipoLoja = "...";
		this.itens = null;
		
		}
	
	public Loja(String nome, String tipo){
		
		this.nomeLoja = nome;
		this.tipoLoja = tipo;
	
	}
	
	@Override
	public String toString(){
		return String.format("Nome Loja: %s\nTipo de Itens: %s\n", nomeLoja, tipoLoja);
	}
	
	// gets and setters dos atributos da classe
	public String getNomeLoja() {
		return nomeLoja;
		}
	public void setNomeLoja(String nomeLoja){
		this.nomeLoja = nomeLoja;
	}
	
	public String getTipoLoja(){
		return tipoLoja;
	}
	public void setTipoLoja(String tipoLoja){
		this.tipoLoja = tipoLoja;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		if(itens.size()<4){
		this.itens = itens;
		}else{
			itens.trimToSize();
			System.out.println("nao cabe mais itens na loja!!!(mensagem via set)");
		}
	}
	
	public void adicionaItem(Item item){
		if(itens.size()<4){
			itens.add(item);
		}else{
			itens.trimToSize();
			System.out.println("nao cabe mais itens na loja!!!(mensagem via adicionarItem)");
		}
	}
	
	public void listarItens(){
		for (int i=0;i<itens.size(); i++){
			System.out.println(itens.get(i));
		}
	}

	@Override
	public void criarDescricao(String desc) {
		this.desc = desc;
	}

	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%d\nDescrição: %s\n",this.nomeLoja,this.tipoLoja,this.desc);
	}
	
	
	
}