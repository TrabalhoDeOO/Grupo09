/**
 * 
 */
package game.entidade;

/**
 * @author Bruno
 *
 */
public class Vestimenta extends Item {

	int bonusV;
	/**
	 * 
	 */
	public Vestimenta() {
		super();
		this.bonusV = 0;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nomeItem
	 * @param codItem
	 */
	public Vestimenta(String nomeItem, int codItem, int bonus) {
		super(nomeItem, codItem);
		this.bonusV = bonus;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\nBonus: +%d Def\n--------\n", nomeItem, codItem, bonusV);
	}

	public int getBonusV() {
		return bonusV;
	}

	public void setBonusV(int bonusV) {
		this.bonusV = bonusV;
	}
	
	

}