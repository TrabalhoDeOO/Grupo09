package game.entidade;

import java.util.ArrayList;


// Trabalhar a questão do ArrayList depois
public class InimigoEvento extends Inimigo{
	public int def;
		
	
	public InimigoEvento() {
		super();
		this.nome = "sem nome";
		this.tipo = "sem tipo";
		this.spe = ((this.lvl*2)-hp/2);
		this.atk =0;
		this.lvl = 0;
		this.def = 0;
		this.hp = 0;
		
		Loot loot = new Loot(this);
		this.loot = loot;
				
		}
	//, int atkI, int defI, int hpI
	public InimigoEvento(String nomeInimigo, int lvlInimigo, String tipoInimigo){
		this.atk =   (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.nome = nomeInimigo;
		this.lvl = lvlInimigo;
		this.tipo = tipoInimigo;
		this.spe = ((this.lvl*3)-hp/2);
		Loot loot = new Loot(this);
		this.loot = loot;
		}
	
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
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
	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void criarLoot(){
		Loot loot = new Loot(null);
		setLoot(loot);
			
	for(int i = 0; i < monstro.size(); i++){
		System.out.println(monstro.get(i).nome + " " +  monstro.get(i).tipo + " lvl " + monstro.get(i).lvl + " hp: " + monstro.get(i).hp + " atk: " + monstro.get(i).atk
				+ " def: " + monstro.get(i).def + " spe: " + monstro.get(i).spe);
		
	}

}
}
