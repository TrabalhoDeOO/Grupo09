package game.entidade;

/**
 * 
 */

/**
 * @author Bruno
 *
 */
public class Dinheiro {
	
	public int quantidade;
	

	/**
	 * 
	 */
	public Dinheiro() {
		this.quantidade = 0;
	}
	
	public Dinheiro(int quantidadeD){

		this.quantidade = quantidadeD;		
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}

