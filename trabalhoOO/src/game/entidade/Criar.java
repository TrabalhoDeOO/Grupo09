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
	//ArrayList<Inimigo> monstro = new ArrayList <Inimigo>();
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Loja> lojas = new ArrayList<Loja>();
	ArrayList<NPC> npcs = new ArrayList<NPC>();
	Dinheiro conchaPq = new Dinheiro("pequena", 0);
	Dinheiro conchaGr = new Dinheiro("grande", 0);
	Dinheiro conchaMed = new Dinheiro("media", 0);
	
	
	
	
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
	
	/*public ArrayList<Inimigo> getMonstro(){
		return monstro;
	}
	
	public void setMonstro(ArrayList<Inimigo> monstro){
		this.monstro = monstro;
	}*/
	
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
	
	public void criarItem (int senhaAdm, int senha1,String tipo, Item item){
		Adm adm = new Adm();
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		if (senha == adm.getSenha()){
			if(itens.size()<1)
				System.out.println("Autorizado!");
			
			itens.add(item);			
		}
		else{
			System.out.println("Autorização Negada!");
		}
	}
	
	
	public void criarLoja (int senhaAdm, int senha1, Loja loja){
		Adm adm = new Adm();
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		if (senha == adm.getSenha()){
			if(lojas.size()<1)
				System.out.println("Autorizado!");
			
			lojas.add(loja);			
		}
		else{
			System.out.println("Autorização Negada!");
		}
	}
	
	public void listarloja(){
		
		for (int i=0;i<lojas.size(); i++){
			System.out.println("A loja " + lojas.get(i).nomeLoja+ " vende: " +lojas.get(i).tipoLoja);
		}			
	}
	
	public void criarDinheiro(int senhaAdm, int senha1,Dinheiro dinheiro){
		
		int conchaP=conchaPq.getQuantidade(), conchaM=conchaMed.getQuantidade(), conchaG=conchaGr.getQuantidade();
		
		
		
		Adm adm = new Adm();
		
		adm.setSenha(senhaAdm);
		this.senha = senha1;
		
		
		
		if(senha == adm.getSenha()){
			
			
			Dinheiro dinheiroNovo = dinheiro;
			
			if (dinheiroNovo.getTipo().equalsIgnoreCase(conchaGr.getTipo())){
				
				conchaG += dinheiroNovo.getQuantidade();
				
			}else	if (dinheiroNovo.getTipo().equalsIgnoreCase("media")){
				do{
					if(conchaM < 100){
						conchaM += dinheiroNovo.getQuantidade();
					}else {
						conchaM = conchaM - 100;
						conchaG+=1;
					}
					
				}while(conchaM >= 100);
				
				
			}else	if (dinheiroNovo.getTipo().equalsIgnoreCase("pequena")){
				
			do{
				
				if(conchaP<100){
					conchaP+=dinheiroNovo.getQuantidade();
				}else{
					conchaP-=100;
					conchaM+=1;
				}
				do{
					if(conchaM >= 100){
						
						conchaM = conchaM - 100;
						conchaG+=1;
					}
					
				}while(conchaM >= 100);
			}while(conchaP >= 100);
			
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
	
	/*public void CriarMonstro(int senhaAdm, int senha1 , Inimigo inimigo){
		
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
						+ " def: " + monstro.get(i).def + " int: " + monstro.get(i).inte  + " spe: " + monstro.get(i).spe);
				
			}
		
	}*/
		
		public void criarPlayer(Player player){
			
			String sexoP;
			
			Player player1 = new Player();
			
			player1 = player;
			
			sexoP = player1.getSexo();
			
			boolean resultValid = player1.validaPlayer(sexoP);
			
			if (resultValid == true){
				player1 = player;
			}else{
				System.out.println("sexo invalido!");
			}
			
			
			
		}
		
	public void CriarLoot(int senhaAdm, int senhaT, Loot loot){
			
			Adm adm = new Adm();
			adm.setSenha(senhaAdm);
			
			this.senha = senhaT;
			
			if(senha == adm.getSenha()){
				System.out.println("Autorizado!");
				
				Loot loot1 = new Loot(null);
				loot1 = loot;
				
			}else{
				
				System.out.println("Autorizacao Negada!");
			}
			
	}
		
	public void criarNPC (int senhaAdm, int senha1, NPC npc){
				Adm adm = new Adm();
				adm.setSenha(senhaAdm);
				this.senha = senha1;
				if (senha == adm.getSenha()){
					if(npcs.size()<1)
						System.out.println("Autorizado!");
					
					npcs.add(npc);			
				}
				else{
					System.out.println("Autorizacao Negada!");
				}
			}
			
		
	}
	
	


