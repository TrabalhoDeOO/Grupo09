/**
 * 
 */
package game.entidade;

/**
 * @author Bruno
 *
 */
public class Arma extends Item {

	protected int bonusA;
	/**
	 * 
	 */
	public Arma() {
		super ();
		this.bonusA = 0;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nomeItem
	 * @param codItem
	 * @param bonus
	 */
	public Arma(String nomeItem, int codItem, int bonus) {
		super(nomeItem, codItem);
		this.bonusA = bonus;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\nBonus: +%d Atk\n--------\n", nomeItem, codItem, bonusA);
	}

	public int getBonus() {
		return this.bonusA;
	}

	public void setBonusA(int bonusA) {
		this.bonusA = bonusA;
	}
	
	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%d\nDescrição: %s\nBônus: +%d Atk\n",this.nomeItem, this.codItem, this.desc, this.bonusA);
	}
	
	

}
