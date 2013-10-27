package game.interfaces;

import game.entidade.*;

public interface SetandoBonus {
	
	public void addBonusHp (int hp);
	public void addBonusAtk (int atk);
	public void addBonusDef (int def);
	public void verificarItem (Item item);

}
