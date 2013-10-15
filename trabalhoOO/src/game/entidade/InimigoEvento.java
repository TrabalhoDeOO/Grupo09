package game.entidade;

// Trabalhar a quest�o do ArrayList depois
public class InimigoEvento extends Inimigo{
	public int def;
		
	
	public InimigoEvento() {
		super();
		this.lvl = 0;
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		}
	
	public InimigoEvento(int atk, int def,String nomeInimigo, int lvlInimigo,	String tipoInimigo){
		super(nomeInimigo,lvlInimigo,tipoInimigo);
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		}
	
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
}