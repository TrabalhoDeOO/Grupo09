package game.entidade;

import java.util.ArrayList;


// Trabalhar a questão do ArrayList depois
public class InimigoEvento extends Inimigo{
	public int def;
	ArrayList<InimigoEvento> monstro = new ArrayList <InimigoEvento>();	
	
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
		this.lvl = lvlInimigo;
		this.atk =   (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.nome = nomeInimigo;
		
		this.tipo = tipoInimigo;
		this.spe = ((this.lvl*3)-this.hp/4);
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
	
	@Override
	public String toString(){
		return String.format("Batalha por Turno: %s %s lvl: %d hp: %d atk: %d def: %d spe: %d", nome, tipo, lvl, hp, atk, def, spe);
	}

	public void criarLoot(Loot loot1){
		Loot loot = loot1;
		setLoot(loot);
			
	}
	
	public void listarLoot(){
		Loot loot1 = this.loot;
		loot1.listarLoot();
	}
}
