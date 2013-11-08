package game.entidade;

import game.interfaces.Descricao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Loja implements Descricao{

	public String nomeLoja;
	public String tipoLoja;
	ArrayList<Item> itens = new ArrayList<Item>();
	private String desc="vazio";
	Scanner scanIn = new Scanner(System.in);
	
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
		System.out.println(this.descricao());
		for (int i=0;i<itens.size(); i++){
			System.out.println(itens.get(i));
		}
	}
	
	//TODO A fazer '-'
	
	public void comprarItem(Player player){
		int numeroDoItemSelecionado = 0;
		boolean teste1;
		
		if(this.tipoLoja.equalsIgnoreCase("Comida")){
				if(player.getMochila().size()>1){
				System.out.println("Qual item voce deseja vender?\n");
				
				teste1 = false;
				while (!teste1) {
					try {
						scanIn = new Scanner(System.in);
						numeroDoItemSelecionado = scanIn.nextInt();
						while(numeroDoItemSelecionado > player.getMochila().size()-1| numeroDoItemSelecionado < 0){
	
							System.err.println("Entrada Invalida!!!!");
							player.listarMochila();												
							System.out.println("Qual item voce deseja veder?");
							numeroDoItemSelecionado = scanIn.nextInt();
	
						}
						teste1 = true;
						
					} catch (InputMismatchException e) {
						System.err.println("Entrada Invalida.\nInsira apenas o numero que esta antes do nome do item");
						teste1 = false;
					}
				}
				player.addDinheiro(player.getMochila().get(numeroDoItemSelecionado).getValor());
				player.getMochila().remove(numeroDoItemSelecionado);
				
			}else{
				System.out.println("Mochila vazia!!!");
			}
			
		}else if(this.tipoLoja.equalsIgnoreCase("Arma")){
			System.out.println("Voce deseja vender sua roupa por"+ player.getRoupa().getValor() + " conchas?\n");
			System.out.println(player.getRoupa()+"\n");
			System.out.println("1/sim 2/nao\n");
			
			teste1 = false;
			while (!teste1) {
				try {
					scanIn = new Scanner(System.in);
					numeroDoItemSelecionado = scanIn.nextInt();
					while(numeroDoItemSelecionado > 2| numeroDoItemSelecionado < 0){

						System.err.println("Entrada Invalida!!!!");
																	
						System.out.println("1/sim 2/nao");
						numeroDoItemSelecionado = scanIn.nextInt();

					}
					teste1 = true;
					
				} catch (InputMismatchException e) {
					System.err.println("Entrada Invalida.\nInsira apenas o numero valido");
					teste1 = false;
				}
			}
			if(numeroDoItemSelecionado == 1){
				player.addDinheiro(player.getArma().getValor());
				Arma arma = new Arma();
				player.adicionaItem(arma);
				//a pensar como retirar arma de player
			}
			
				
			
			
		}else if(this.tipoLoja.equalsIgnoreCase("Roupas"))
			System.out.println("Voce deseja vender sua arma por"+ player.getArma().getValor() + " conchas?\n");
		System.out.println(player.getRoupa()+"\n");
		System.out.println("1/sim 2/nao\n");
		
		teste1 = false;
		while (!teste1) {
			try {
				scanIn = new Scanner(System.in);
				numeroDoItemSelecionado = scanIn.nextInt();
				while(numeroDoItemSelecionado > 2| numeroDoItemSelecionado < 0){

					System.err.println("Entrada Invalida!!!!");
																
					System.out.println("1/sim 2/nao");
					numeroDoItemSelecionado = scanIn.nextInt();

				}
				teste1 = true;
				
			} catch (InputMismatchException e) {
				System.err.println("Entrada Invalida.\nInsira apenas o numero valido");
				teste1 = false;
			}
		}
		if(numeroDoItemSelecionado == 1){
			player.addDinheiro(player.getRoupa().getValor());
			Vestimenta roupa = new Vestimenta();
			player.adicionaItem(roupa);
		}


		
	}
	
	public void venderItem(Player player){
		
	}

	@Override
	public void criarDescricao(String desc) {
		this.desc = desc;
	}

	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%s\nDescrição: %s\n",this.nomeLoja,this.tipoLoja,this.desc);
	}
	
	
	
}