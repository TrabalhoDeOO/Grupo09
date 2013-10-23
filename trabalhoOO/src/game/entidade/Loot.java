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
	private Dinheiro conchaPq = new Dinheiro("pequena", 0);
	private Dinheiro conchaGr = new Dinheiro("grande", 0);
	private Dinheiro conchaMed = new Dinheiro("media", 0);
	
	
	public Loot(Inimigo inimigo){
		this.inimigo = inimigo;
	
	}
	
	public Loot(Dinheiro concha, Item item){
		
		int conchaP=conchaPq.getQuantidade(), conchaM=conchaMed.getQuantidade(), conchaG=conchaGr.getQuantidade();
		
		this.item = item;
		this.conchas = concha;
		
		Dinheiro dinheiroNovo = concha;
		
		if (dinheiroNovo.getTipo().equalsIgnoreCase(conchaGr.getTipo())){
			
			conchaG += dinheiroNovo.getQuantidade();
			
		}else	if (dinheiroNovo.getTipo().equalsIgnoreCase("media")){
			do{
				if(conchaM < 100){
					conchaM += dinheiroNovo.getQuantidade();
				}else {
					conchaM = conchaM - 100;
					conchaG+=1;
				}
				
			}while(conchaM >= 100);
			
			
		}else	if (dinheiroNovo.getTipo().equalsIgnoreCase("pequena")){
			
		do{
			
			if(conchaP<100){
				conchaP+=dinheiroNovo.getQuantidade();
			}else{
				conchaP-=100;
				conchaM+=1;
			}
			do{
				if(conchaM >= 100){
					
					conchaM = conchaM - 100;
					conchaG+=1;
				}
				
			}while(conchaM >= 100);
		}while(conchaP >= 100);
		
		}else{
			System.out.println("Tamanho invalido");
		}
		
		conchaPq.setQuantidade(conchaP);
		conchaMed.setQuantidade(conchaM);
		conchaGr.setQuantidade(conchaG);
		
		
		
		
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
		
		System.out.println(this.item);
		
		System.out.println(this.conchaPq.getTipo() + " " + this.conchaPq.getQuantidade());
		System.out.println(this.conchaMed.getTipo() + " " + this.conchaMed.getQuantidade());
		System.out.println(this.conchaGr.getTipo() + " " + this.conchaGr.getQuantidade());
		
		
	}
	

}
