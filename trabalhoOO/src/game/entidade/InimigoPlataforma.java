
package game.entidade;

import game.framework.GameObject;
import game.framework.Handler;
import game.framework.ObjectId;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.LinkedList;

public class InimigoPlataforma extends Inimigo{
	
	ArrayList<InimigoPlataforma> monstro = new ArrayList <InimigoPlataforma>();

public InimigoPlataforma(ObjectId id){
	super(0,0,id);
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

public InimigoPlataforma(String nomeInimigo, int lvlInimigo, String tipoInimigo, float x, float y, Handler handler, ObjectId id){
	super(x, y, id);
	this.lvl = lvlInimigo;
	this.atk =   (this.lvl*4);
	this.def = (this.lvl*2);
	this.hp = (this.atk/2+this.def*2);
	this.nome = nomeInimigo;
	this.tipo = tipoInimigo;
	this.spe = ((this.lvl*3)-this.hp/4);
	Loot loot = new Loot(this);
	this.loot = loot;
	this.x = x;
	this.y =y;
	this.id = id;
	this.handler = handler;
	}

public void tick(){
	
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
	return String.format("plataforma: %s %s lvl: %d hp: %d atk: %d def: %d spe: %d jump: %d", nome, tipo, lvl, hp, atk, def, spe);
}

@Override
public int getHp() {
	// o q fazer aqui?
	return 0;
}

			//// ----> Implementação gráfica <----- \\\\
public static int widthIP = 64;
public static int heightIP = 64;
private Handler handler;
private GameObject tempObject;

public void tick(LinkedList<GameObject> object) {	

}


public void render(Graphics g) {
	g.setColor(Color.black);
	g.fillRect((int) x, (int) y, widthIP, heightIP);
	
	Graphics2D g2d = (Graphics2D) g;
	g.setColor(Color.green);
	g2d.draw(getBounds());
	g2d.draw(getBoundsTop());
	
	}

public Rectangle getBounds() {
	return new Rectangle ( (int) ((int)x+(widthIP/2-((widthIP/2)))), (int) ((int)y+(heightIP/2)), (int)widthIP, (int) heightIP/2);
	}

public Rectangle getBoundsTop() {
	return new Rectangle ( (int) ((int)x+((widthIP/2)-((widthIP/2)))), (int) y, (int)widthIP, (int) heightIP/2);
	}

}
