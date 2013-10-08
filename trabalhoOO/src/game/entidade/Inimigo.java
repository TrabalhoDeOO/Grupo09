package game.entidade;

import game.entidade.Loot;
//import java.util.ArrayList;
/**
 * 
 */

/**
 * @author Bruno
 *
 */
public class Inimigo {

	/**
	 * 
	 */
	public String nome;
	public int lvl;
	public String tipo;
	public int spe;
	public Loot loot;
	public int hp;
	
	
	public Inimigo() {
		// TODO Auto-generated constructor stub
		this.nome = "sem nome";
		this.tipo = "sem tipo";
		this.spe = ((this.lvl*2)-hp/2);
		
		
		Loot loot = new Loot(this);
		this.loot = loot;
		
	}
	
	public Inimigo(String nomeInimigo, int lvlInimigo,	String tipoInimigo){
		
		
		this.nome = nomeInimigo;
		this.lvl = lvlInimigo;
		this.tipo = tipoInimigo;
		this.spe = ((this.lvl*3)-hp/2);
		Loot loot = new Loot(this);
		this.loot = loot;
		
	}
	
	public Loot getLoot(){
		return loot;
	}
	
	public void setLoot(Loot loot){
		this.loot = loot;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
		
	}
	
	public int getLvl(){
		return lvl;
	}
	
	public void setLvl(int lvl){
		this.lvl = lvl;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpe() {
		return spe;
	}

	public void setSpe(int spe) {
		this.spe = spe;
	}
	
	public void criarLoot(){
		Loot loot = new Loot(null);
		setLoot(loot);
	}
	
	/* Essa implementa��o dever� ser melhorada e melhor estudada em cada uma das subclasses 
	 public void listarInimigo(ArrayList<Inimigo> monstro){
	 
		for(int i = 0; i < monstro.size(); i++){
			System.out.println(monstro.get(i).nome + " " +  monstro.get(i).tipo + " lvl " + monstro.get(i).lvl + " hp: " + monstro.get(i).hp + " atk: " + monstro.get(i).atk
					+ " def: " + monstro.get(i).def + " int: " + monstro.get(i).inte  + " spe: " + monstro.get(i).spe);
			
		}
	
	}*/
	 

}
