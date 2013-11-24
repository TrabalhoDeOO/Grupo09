package game.entidade;

import game.framework.GameObject;
import game.framework.Handler;
import game.framework.ObjectId;
import game.interfaces.Descricao;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.LinkedList;


// Trabalhar a questão do ArrayList depois
public class InimigoEvento extends Inimigo implements Descricao{
	public int def;
	public int xp;
	ArrayList<InimigoEvento> monstro = new ArrayList <InimigoEvento>();
	private String desc = "vazio";	
	
	public InimigoEvento(ObjectId id) {
		super(0, 0, id);
		this.nome = "sem nome";
		this.tipo = "sem tipo";
		this.spe =  (int)((this.lvl*3)+(this.atk*0.65)-(this.def*0.4));
		this.atk =0;
		this.lvl = 0;
		this.def = 0;
		this.hp = 0;
		this.xp = 0;
		
		Loot loot = new Loot(this);
		this.loot = loot;
				
		}
	//, int atkI, int defI, int hpI
	public InimigoEvento(String nomeInimigo, int lvlInimigo, String tipoInimigo, float x, float y, Handler handler, ObjectId id){
		super(x, y, id);
		this.lvl = lvlInimigo;
		this.atk =   (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.nome = nomeInimigo;
		this.xp = (this.lvl*3);
		this.tipo = tipoInimigo;
		this.spe =  (int)((this.lvl*3)+(this.atk*0.65)-(this.def*0.4));
		Loot loot = new Loot(this);
		this.loot = loot;
		this.x= x;
		this.y = y;
		this.id= id;
		}
	
	public void tick(){
		
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
	
	
	public int getXp() {
		return xp;
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
	@Override
	public void criarDescricao(String desc) {
		this.desc = desc;
	}

	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%s\nDescrição: %s\n",this.nome, this.tipo, this.desc);
	}

		/////////////---> Deste ponto em diante, os dados são sobre a implementação gráfica <---- \\\\\\\\\\\\\\
	
	public void tick(LinkedList<GameObject> object) {
		// Colocar a colisao
		
	}
	
	public void render(Graphics g) {
		// propriedades graficas dos inimigos
		
	}
	
	public Rectangle getBounds() {
		// aplicação da colisao
		return null;
	}
	
}
