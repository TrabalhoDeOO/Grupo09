package game.entidade;
import java.util.ArrayList;


public class Player {
	
	public String nome;
	public String sexo;
	public ArrayList<Item> mochila = new ArrayList<Item>();
	public int lvl;
	public int atk = (lvl*5);
	public int def = (lvl*2);
	public int hp = (atk/2+def*2);
	public int inte = (lvl*2);
	public int speed = (lvl*2)-hp/2;
	public int jump = 20;
	public int xp = 0;

	public Player() {
		// TODO Auto-generated constructor stub
		this.nome = "sem nome";
		this.sexo = "nao informado";
		this.lvl = 0;
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*4);
		this.hp = (this.atk/2+this.def*2);
		this.inte   = (this.lvl*2);
		this.speed = ((this.lvl*2)-hp/2);
		this.jump = 0;
		this.xp = 0;
		
	}
	
	public Player(String nomeP, String sexoP, int lvlP){
		
		this.nome = nomeP;
		this.sexo = sexoP;
		this.lvl = lvlP;
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.inte   = (this.lvl*2);
		this.speed = ((this.lvl*2)-hp/2);
		this.jump = 20;
		this.xp = 0;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
	
	public ArrayList<Item> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<Item> mochila) {
		this.mochila = mochila;
	}

	public boolean validaPlayer(String sexo){
		boolean validacao;
		
		String mulher = "mulher";
		String homem = "homem";
		
		if(sexo.equalsIgnoreCase(mulher)){
			validacao = true;
		}else if(sexo.equalsIgnoreCase(homem)){
			validacao = true;
		}else{
			System.out.println("Sexo Invalido!");
			validacao = false;
		}
		
		return validacao;
	}
	
	public void adicionaItem(Item item){
		
		if (mochila.size()>3){
			System.out.println("mochila cheia");
		}else{
			mochila.add(item);
			
		}
		
	}
	 

}

