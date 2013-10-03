package game.entidade;

import game.entidade.Loot;

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
	public int atk;
	public int def;
	public int hp;
	public int inte;
	public int spe;
	public int jump;
	public Loot loot;
	
	public Inimigo() {
		// TODO Auto-generated constructor stub
		this.nome = "sem nome";
		this.lvl = 0;
		this.tipo = "sem tipo";
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.inte   = (this.lvl*2);
		this.spe = ((this.lvl*2)-hp/2);
		this.jump = 0;
		Loot loot = new Loot(this);
		this.loot = loot;
		
	}
	
	public Inimigo(String nomeInimigo, int lvlInimigo,	String tipoInimigo){
		
		
		this.nome = nomeInimigo;
		this.lvl = lvlInimigo;
		this.tipo = tipoInimigo;
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.inte   = (this.lvl*2);
		this.spe = ((this.lvl*3)-hp/2);
		this.jump = 20;
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

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	public int getSpe() {
		return spe;
	}

	public void setSpe(int spe) {
		this.spe = spe;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}
	
	
	public void criarLoot(){
		Loot loot = new Loot(null);
		setLoot(loot);
	}
	 

}
