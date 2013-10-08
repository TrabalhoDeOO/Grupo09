package game.entidade;

// Trabalhar a questão do ArrayList depois
public class InimigoEvento extends Inimigo{
	public int atk;
	public int def;
	public int inte;
	
	
	public InimigoEvento() {
		super();
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
	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

}
