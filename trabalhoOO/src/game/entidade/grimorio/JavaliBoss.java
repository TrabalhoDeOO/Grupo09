package game.entidade.grimorio;

import game.entidade.InimigoEvento;

public class JavaliBoss extends InimigoEvento implements Skills {

	public JavaliBoss() {
		// TODO Auto-generated constructor stub
	}

	public JavaliBoss(String nomeInimigo, int lvlInimigo, String tipoInimigo) {
		super(nomeInimigo, lvlInimigo, tipoInimigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculaSkill() {
		// TODO Auto-generated method stub
		return 0;
	}

}
