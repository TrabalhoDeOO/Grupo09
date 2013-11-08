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

	public Arma() {
		super ();
		this.bonusA = 0;
	}

	public Arma(String nomeItem, int codItem, int bonus, int valor) {
		super(nomeItem, codItem, valor);
		this.bonusA = bonus;
	}
	
	@Override
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\n" +
				"Bonus: +%d Atk\nValor: %d Conchas\n--------\n", nomeItem, codItem, bonusA, valor);
	}

	public int getBonus() {
		return this.bonusA;
	}

	public void setBonusA(int bonusA) {
		this.bonusA = bonusA;
	}
	
	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%d\nDescrição: %s\nBônus: +%d Atk\nValor: %d Conchas" +
				"\n",this.nomeItem, this.codItem, this.desc, this.bonusA, this.valor);
	}
	
	

}
