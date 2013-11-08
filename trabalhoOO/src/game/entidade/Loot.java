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
	private int conchas =0;
	private Item item;	
	
	public Loot(Inimigo inimigo){
		this.inimigo = inimigo;
	
	}
	
	public Loot(int concha, Item item){
		this.item = item;
		this.conchas = concha;		
	}

	public Loot(int conchas, Item item, Inimigo inimigo) {
		this.inimigo = inimigo;
		this.conchas = conchas;
		this.item = item;
	}

	public int getConchas() {
		return conchas;
	}

	public void setConchas(int conchas) {
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
		System.out.println("O Inimigo " + inimigo.getNome() + " deixou cair:");
		
		System.out.println(this.conchas+" Conchas\n\t+");
		
		System.out.println(this.item.descricao());
				
		

	}
	

}
