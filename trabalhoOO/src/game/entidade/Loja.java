package game.entidade;

import java.util.ArrayList;

public class Loja {

	public String nomeLoja;
	public String tipoLoja;
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Loja> lojas = new ArrayList<Loja>();
	
	public Loja() {
		
		this.nomeLoja = "...";
		this.tipoLoja = "...";
		this.itens = null;
		
		}
	
	public Loja(String nome, String tipo, ArrayList<Item> itens){
		
		this.nomeLoja = nome;
		this.tipoLoja = tipo;
		
		if(itens.size()<3){
		this.itens = itens;
		}else{
			itens.trimToSize();
			System.out.println("nao cabe mais itens na loja!!!(mensagem via construtor)");
		}
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
	
	public void listarItens(){
		for (int i=0;i<itens.size(); i++){
			System.out.println(itens.get(i).nomeItem+ " "+   "codItem: " +itens.get(i).codItem);
		}
	}
	
	public void adicionaLoja(Loja loja){
		lojas.add(loja);
	}
	
	public void listarloja(){
		
		for (int i=0;i<lojas.size(); i++){
			System.out.println("A loja " + lojas.get(i).nomeLoja+ " vende: " +lojas.get(i).tipoLoja);
		}			
	}
	
}