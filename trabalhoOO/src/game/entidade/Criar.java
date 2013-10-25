package game.entidade;


import game.entidade.Adm;
import game.entidade.Dinheiro;
import game.entidade.Inimigo;
import game.entidade.Player;
import game.entidade.Item;
import game.entidade.Loja;
import game.entidade.NPC;

import java.util.ArrayList;



public class Criar {
	
	
	
	public int senha;
	ArrayList<Dinheiro> conchas = new ArrayList <Dinheiro>();
	ArrayList<Inimigo> monstro = new ArrayList <Inimigo>();
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Loja> lojas = new ArrayList<Loja>();
	ArrayList<NPC> npcs = new ArrayList<NPC>();
	Dinheiro conchaPq = new Dinheiro("pequena", 0);
	Dinheiro conchaGr = new Dinheiro("grande", 0);
	Dinheiro conchaMed = new Dinheiro("media", 0);
	
	private final static int MAX_CONCHA = 100;
	
	
	Player player;
	
	public Criar(){
		
	}

	public Criar(int senha) {		
		Adm adm = new Adm();
		this.senha = adm.getSenha();
		
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		Adm adm = new Adm();
		this.senha = adm.getSenha();
	}

	public ArrayList<Dinheiro> getConchas() {
		return conchas;
	}

	public void setConchas(ArrayList<Dinheiro> conchas) {
		this.conchas = conchas;
	}
	
	public ArrayList<Inimigo> getMonstro(){
		return monstro;
	}
	
	public void setMonstro(ArrayList<Inimigo> monstro){
		this.monstro = monstro;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public void setPlayer(Player player){
		this.player = player;
	}
	
	public ArrayList <Loja> getLoja(){
		return lojas;
	}
	
	public void setLoja (ArrayList<Loja> lojas){
		this.lojas = lojas;
	}
	public ArrayList <Item> getItem(){
		return itens;
	}
	
	public void setItem (ArrayList<Item> itens){
		this.itens= itens;
	}
	
	public ArrayList <NPC> getNPC(){
		return npcs;
	}
	
	public void setNPC (ArrayList<NPC> npcs){
		this.npcs = npcs;
	}
	
	public Item criarItem (int senhaAdm, int senha1,String tipo, String nome, int codigo, int bonus){
		Item item = new Item();
		Arma arma;
		Vestimenta vestimenta;
		Consumivel consumivel;
		Adm adm = new Adm();
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		if (senha == adm.getSenha()){
			if(itens.size()<1)
				System.out.println("Autorizado!");
				if (tipo.equalsIgnoreCase("arma")){
					arma = new Arma(nome, codigo, bonus);
					itens.add(arma);
					return arma;
				}else if (tipo.equalsIgnoreCase("vestimenta")){
					vestimenta = new Vestimenta(nome, codigo, bonus);
					itens.add(vestimenta);
					return vestimenta;
				}else if (tipo.equalsIgnoreCase("consumivel")){
					consumivel = new Consumivel(nome, codigo, bonus);
					itens.add(consumivel);
					return consumivel;
				}else {
					item = new Item(nome, codigo);
					itens.add(item);
					
				}
				
						
		}
		else{
			System.out.println("Autorização Negada!");
		}
		
		return item;
	}
	
	
	
	public Loja criarLoja (int senhaAdm, int senha1, String nome, String tipo){
		Loja loja = new Loja();;
		Adm adm = new Adm();
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		if (senha == adm.getSenha()){
			if(lojas.size()<1)
				System.out.println("Autorizado!");
			loja = new Loja(nome, tipo);
			lojas.add(loja);
			
		}
		else{
			System.out.println("Autorização Negada!");
		}
		return loja;
	}
	
	public void listarloja(){
		
		for (int i=0;i<lojas.size(); i++){
			System.out.println(lojas.get(i));
		}			
	}
	
	public void criarDinheiro(int senhaAdm, int senha1,String tipo, int quantidade){
		
		int conchaP=conchaPq.getQuantidade(), conchaM=conchaMed.getQuantidade(), conchaG=conchaGr.getQuantidade();
		
		
		
		Adm adm = new Adm();
		
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		
		
		
		if(senha == adm.getSenha()){
			
			
			
			
			if (tipo.equalsIgnoreCase(conchaGr.getTipo())){
				
				conchaG += quantidade;
				
			}else	if (tipo.equalsIgnoreCase("media")){
				do{
					if(conchaM < MAX_CONCHA){
						conchaM += quantidade;
					}else {
						conchaM = conchaM - MAX_CONCHA;
						conchaG+=1;
					}
					
				}while(conchaM >= MAX_CONCHA);
				
				
			}else	if (tipo.equalsIgnoreCase("pequena")){
				
			do{
				
				if(conchaP<MAX_CONCHA){
					conchaP+=quantidade;
				}else{
					conchaP-=MAX_CONCHA;
					conchaM+=1;
				}
				do{
					if(conchaM >= MAX_CONCHA){
						
						conchaM = conchaM - MAX_CONCHA;
						conchaG+=1;
					}
					
				}while(conchaM >= MAX_CONCHA);
			}while(conchaP >= MAX_CONCHA);
			
			}else{
				System.out.println("Tamanho invalido");
			}
			
			conchaPq.setQuantidade(conchaP);
			conchaMed.setQuantidade(conchaM);
			conchaGr.setQuantidade(conchaG);
			
		}
		else{
			
			System.out.println("Autorizacao Negada!");
		}
		
		}
	
	public void listarDinheiro(){
		System.out.println(conchaPq.getTipo() + " " + conchaPq.getQuantidade());
		System.out.println(conchaMed.getTipo() + " " + conchaMed.getQuantidade());
		System.out.println(conchaGr.getTipo() + " " + conchaGr.getQuantidade());
		
	}
	
	public void CriarMonstro(int senhaAdm, int senha1 , Inimigo inimigo){
		
		Adm adm = new Adm();
		
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		
		
		if(senha == adm.getSenha()){
			if(monstro.size()<1)
				System.out.println("Autorizado!");
				
				monstro.add(inimigo);
			
		}
		else{
			System.out.println("Autorizacao Negada!");
		}
			
			
		}
		

		public void listarInimigo(){
			for(int i = 0; i < monstro.size(); i++){
				System.out.println(monstro.get(i).nome + " " +  monstro.get(i).tipo + " lvl " + monstro.get(i).lvl + " hp: " + monstro.get(i).hp + " atk: " + monstro.get(i).atk
						+ " def: " + monstro.get(i).def + " spe: " + monstro.get(i).spe);
				
			}
		
	}
		
		public Player criarPlayer(String nome, String sexo, int lvl){
			
			Player player1 = new Player(nome, sexo, lvl);
			
			
			boolean resultValid = player1.validaPlayer(sexo);
			
			if (resultValid == true){
				player1 = new Player(nome, sexo, lvl);
			}else{
				System.out.println("sexo invalido!");
				player1 = new Player();
			}
			
			return player1;
			
		}
		
	public void CriarLoot(int senhaAdm, int senhaT, Dinheiro dinheiro, Item item, Inimigo inimigo){
			
			Adm adm = new Adm();
			adm.setSenha(senhaAdm);
			
			this.senha = senhaT;
			
			if(senha == adm.getSenha()){
				System.out.println("Autorizado!");
				
				Loot loot1 = new Loot(dinheiro, item);
				
				loot1.setInimigo(inimigo);
				
				
			}else{
				
				System.out.println("Autorizacao Negada!");
			}
			
	}
		
	public NPC criarNPC (int senhaAdm, int senha1, String nome, int funcao, int sexo){
		
		//funcao  1/informante 2/auxiliar 3/negociante
		//sexo 1/feminino 2/masculino
		
				NPC npc = new NPC();
				Adm adm = new Adm();
				adm.setSenha(senhaAdm);
				this.senha = senha1;
				if (senha == adm.getSenha()){
					if(npcs.size()<1)
						System.out.println("Autorizado!");
					npc = new NPC(nome, funcao, sexo);
					npcs.add(npc);			
				}
				else{
					System.out.println("Autorizacao Negada!");
				}
				
				return npc;
			}
			
		
	}
	
	


