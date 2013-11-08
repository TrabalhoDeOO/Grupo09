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

	public Vestimenta() {
		super();
		this.bonusV = 0;
	}

	public Vestimenta(String nomeItem, int codItem, int bonus, int valor) {
		super(nomeItem, codItem, valor);
		this.bonusV = bonus;
	}
	
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\n" +
				"Bonus: +%d Def\nValor: %d Conchas\n--------\n", this.nomeItem,
				this.codItem, this.bonusV, this.valor);
	}

	public int getBonus() {
		return this.bonusV;
	}

	public void setBonus( int bonusV) {
		this.bonusV = bonusV;
	}

	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%d\nDescrição: %s\n" +
				"Bônus: +%d Def\nValor: %d Conchas\n",this.nomeItem, this.codItem,
				this.desc, this.bonusV, this.valor);
	}
	

}
