package game.entidade;


import game.framework.ObjectId;

import java.util.ArrayList;
//import game.Graphics.*;



public class Criar {
	
	
	
	public int senha;
	//ArrayList<Dinheiro> conchas = new ArrayList <Dinheiro>();
	ArrayList<Inimigo> monstro = new ArrayList <Inimigo>();
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Loja> lojas = new ArrayList<Loja>();
	ArrayList<NPC> npcs = new ArrayList<NPC>();
	
	
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
/*
	public ArrayList<Dinheiro> getConchas() {
		return conchas;
	}

	public void setConchas(ArrayList<Dinheiro> conchas) {
		this.conchas = conchas;
	}
*/
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
	
	public Item criarItem (String tipo, String nome, int codigo, int bonus, int valor){
		Item item = new Item();
		Arma arma;
		Vestimenta vestimenta;
		Consumivel consumivel;
		
		
		
			
				if (tipo.equalsIgnoreCase("arma")){
					arma = new Arma(nome, codigo, bonus, valor);
					itens.add(arma);
					return arma;
				}else if (tipo.equalsIgnoreCase("vestimenta")){
					vestimenta = new Vestimenta(nome, codigo, bonus, valor);
					itens.add(vestimenta);
					return vestimenta;
				}else if (tipo.equalsIgnoreCase("consumivel")){
					consumivel = new Consumivel(nome, codigo, bonus, valor);
					itens.add(consumivel);
					return consumivel;
				}else {
					item = new Item(nome, codigo);
					itens.add(item);
					
				}
				
						
		
		
		return item;
	}
	
	
	
	public Loja criarLoja (String nome, String tipo){
		Loja loja = new Loja();;
		
		
			
				
			loja = new Loja(nome, tipo);
			lojas.add(loja);
			
		
		return loja;
	}
	
	public void listarloja(){
		
		for (int i=0;i<lojas.size(); i++){
			System.out.println(lojas.get(i));
		}			
	}
	
	/**
	//TODO Conversão de Dinheiro
	
	public void criarDinheiro(String tipo, int quantidade){
		
		int conchaP=conchaPq.getQuantidade(), conchaM=conchaMed.getQuantidade(), conchaG=conchaGr.getQuantidade();
			
			
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
	
	public void listarDinheiro(){
		System.out.println(conchaPq.getTipo() + " " + conchaPq.getQuantidade());
		System.out.println(conchaMed.getTipo() + " " + conchaMed.getQuantidade());
		System.out.println(conchaGr.getTipo() + " " + conchaGr.getQuantidade());
		
	}
	
	*/
	
	public Inimigo CriarMonstro(String nome, String tipoInimigo, String tipoMonstro, int lvl, int jump){
		
		
		Inimigo inimigo= null;
		
		
		
		
			
				
			if(tipoInimigo.equalsIgnoreCase("a")){
				InimigoPlataforma inimigo1 = new InimigoPlataforma(nome, lvl, tipoMonstro, 0, 0, null, null);
				inimigo = inimigo1;
			}else if(tipoInimigo.equalsIgnoreCase("b")){
				InimigoEvento inimigo1 = new InimigoEvento(nome, lvl, tipoMonstro, 0, 0, null, null);
				inimigo = inimigo1;
			}
			monstro.add(inimigo);
			
		
			
			return inimigo;
		
		}
		

		public void listarInimigo(){
			for(int i = 0; i < monstro.size(); i++){
				System.out.println(monstro.get(i).nome + " " +  monstro.get(i).tipo + " lvl " + monstro.get(i).lvl +
						" hp: " + monstro.get(i).hp + " atk: " + monstro.get(i).atk
						+ " def: " + monstro.get(i).def + " spe: " + monstro.get(i).spe);
				
			}
		
	}
		
		public Player criarPlayer(String nome, String sexo, int lvl, float x, float y, ObjectId id){
			
			Player player1 = new Player(nome, sexo, lvl, x, y, null, id);
			
			
			boolean resultValid = player1.validaPlayer(sexo);
			
			if (resultValid == true){
				player1 = new Player(nome, sexo, lvl, x, y, null, id);
			}else{
				System.out.println("sexo invalido!");
				player1 = new Player(sexo, sexo, lvl, y, y, null, id);
			}
			
			return player1;
			
		}
		
	public void CriarLoot(int dinheiro, Item item, Inimigo inimigo){

				Loot loot1 = new Loot(dinheiro, item);
				
				loot1.setInimigo(inimigo);
		
	}
		
	public NPC criarNPC (String nome, int funcao, int sexo){
		
		//funcao  1/informante 2/auxiliar 3/negociante
		//sexo 1/feminino 2/masculino
		
				NPC npc = new NPC();
				
				
					if(npcs.size()<1)
						
					npc = new NPC(nome, funcao, sexo);
					npcs.add(npc);			
				
				
				return npc;
			}
			
		
	}
	
	


