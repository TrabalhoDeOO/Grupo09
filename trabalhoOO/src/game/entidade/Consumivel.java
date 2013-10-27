/**
 * 
 */
package game.entidade;

/**
 * @author Bruno
 *
 */
public class Consumivel extends Item {

	protected int bonusC;
	/**
	 * 
	 */
	public Consumivel() {
		super();
		this.bonusC = 0;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nomeItem
	 * @param codItem
	 */
	public Consumivel(String nomeItem, int codItem, int bonus) {
		super(nomeItem, codItem);
		this.bonusC = bonus;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\nBonus: recupera %d de HP\n--------\n", nomeItem, codItem, bonusC);
	}

	public int getBonusC() {
		return bonus= bonusC;
	}

	public void setBonusC(int bonusC) {
		this.bonusC = bonusC;
	}

	
}
