package game.entidade;

/**
 * 
 */

/**
 * @author Bruno
 *
 */
public class Dinheiro {
	
	
	public String tipo;
	public int quantidade;
	

	/**
	 * 
	 */
	public Dinheiro() {
		// TODO Auto-generated constructor stub
		
		this.tipo = "...";
		this.quantidade = 0;
	}
	
	public Dinheiro(String tipoD, int quantidadeD){
		
		this.tipo = tipoD;
		this.quantidade = quantidadeD;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}

