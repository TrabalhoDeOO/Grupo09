/**
 * 
 */
package game.entidade;

import game.entidade.Dinheiro;
import game.entidade.Inimigo;
import game.entidade.Item;



/**
 * @author Bruno
 *
 */
public class Loot {
	
	private Inimigo inimigo;
	private Dinheiro conchas = new Dinheiro();
	private Item item;	
	
	public Loot(Inimigo inimigo){
		this.inimigo = inimigo;
	
	}
	
	public Loot(Dinheiro concha, Item item){
		this.item = item;
		this.conchas = concha;		
	}
	

	public Dinheiro getConchas() {
		return conchas;
	}

	public void setConchas(Dinheiro conchas) {
		this.conchas = conchas;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}
	
	public void setInimigo(Inimigo inimigo){
		this.inimigo = inimigo;
	}
	
	public void listarLoot(){
		System.out.println("o monstro " + inimigo.getNome() + " dropou:");
		
		//System.out.println(this.item);
		System.out.println(this.item.descricao());
				
		System.out.println(this.conchas.getQuantidade()+" Conchas");

	}
	

}
