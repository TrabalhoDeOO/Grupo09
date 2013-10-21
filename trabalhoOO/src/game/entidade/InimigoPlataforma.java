package game.entidade;

import java.util.ArrayList;

public class InimigoPlataforma extends Inimigo{
	public int jump;
	ArrayList<InimigoPlataforma> monstro = new ArrayList <InimigoPlataforma>();

public InimigoPlataforma(){
	super();
	this.jump = 0;
	}

public InimigoPlataforma(int jump, String nomeInimigo, int lvlInimigo,	String tipoInimigo){
	super();
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
	
	for(int i = 0; i < monstro.size(); i++){
		System.out.println(monstro.get(i).nome + " " +  monstro.get(i).tipo + " hp: " + monstro.get(i).hp + " atk: " + monstro.get(i).atk
				+ " jump: " + monstro.get(i).jump);
	}
}

}
