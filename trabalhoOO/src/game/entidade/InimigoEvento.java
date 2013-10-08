package game.entidade;

public class InimigoEvento extends Inimigo{
	public int atk;
	public int def;
	public int inte;
	public int hp;
	
	
	public InimigoEvento() {
		this.lvl = 0;
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.inte   = (this.lvl*2);
	}
	
	public InimigoEvento(int atk, int def){
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.inte   = (this.lvl*2);
	}
	
	
}
