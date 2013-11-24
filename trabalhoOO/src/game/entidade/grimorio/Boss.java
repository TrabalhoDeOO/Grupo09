package game.entidade.grimorio;

import game.entidade.InimigoEvento;
import game.framework.Handler;
import game.framework.ObjectId;

public class Boss extends InimigoEvento {


	public Boss(String nomeInimigo, int lvlInimigo, String tipoInimigo, float x, float y, Handler handler, ObjectId id) {
		super(nomeInimigo, lvlInimigo, tipoInimigo, 0, 0, null, null);
		// TODO Auto-generated constructor stub
	}
	
	
	public int calculaSkill(int atributo){
		return 0;
	}
	
	
	public int calculaSkill1(int atributo){
		return 0;
	}
	
	public int calculaSkill2(int atributo){
		return 0;
	}
	
	
	

}
