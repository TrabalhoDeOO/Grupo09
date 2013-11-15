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
	public int bonus;

	public Consumivel() {
		super();
		this.bonusC = 0;
	}

	public Consumivel(String nomeItem, int codItem, int bonus, int valor) {
		super(nomeItem, codItem, valor);
		this.bonusC = bonus;
	}
	
	public String toString(){
		return String.format("--------\nNome Item: %s\nCodigo: %d\n" +
				"Bonus: recupera %d de HP\nValor: %d Concha(s)\n--------\n", this.nomeItem,
				this.codItem, this.bonusC, this.valor);
	}

	public int getBonus() {
		return this.bonusC;
	}

	public void setBonusC(int bonusC) {
		this.bonusC = bonusC;
	}
	
	@Override
	public String descricao() {
		 
		return String.format("%s\t-\t%d\nDescrição: %s\n" +
				"Bônus: Recupera +%d Hp\nValor: %d Concha(s)\n",this.nomeItem, this.codItem,
				this.desc, this.bonusC, this.valor);
	}
	
}
