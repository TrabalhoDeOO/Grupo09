package game.entidade;

import java.util.ArrayList;

public class InimigoPlataforma extends Inimigo{
	public int jump;
	ArrayList<InimigoPlataforma> monstro = new ArrayList <InimigoPlataforma>();

public InimigoPlataforma(){
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
	this.jump = 0;
	}

public InimigoPlataforma(int jump, String nomeInimigo, int lvlInimigo,	String tipoInimigo){
	super();
	this.lvl = lvlInimigo;
	this.atk =   (this.lvl*4);
	this.def = (this.lvl*2);
	this.hp = (this.atk/2+this.def*2);
	this.nome = nomeInimigo;
	
	this.tipo = tipoInimigo;
	this.spe = ((this.lvl*3)-this.hp/4);
	Loot loot = new Loot(this);
	this.loot = loot;
	this.jump= jump;
	}
public int getJump() {
	return jump;
}

public void setJump(int jump) {
	this.jump = jump;
	}
public int getAtk() {
	return this.atk;
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

public void criarLoot(){
	Loot loot = new Loot(null);
	setLoot(loot);
	
	
}

@Override
public String toString(){
	return String.format("plataforma: %s %s lvl: %d hp: %d atk: %d def: %d spe: %d jump: %d", nome, tipo, lvl, hp, atk, def, spe, jump);
}

@Override
public int getHp() {
	// TODO Auto-generated method stub
	return 0;
}

}
