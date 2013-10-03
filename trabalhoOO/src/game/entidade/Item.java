package game.entidade;

public class Item {
	public String nomeItem;
	public int codItem;
	public String bonus;

	public Item() {
		this.nomeItem = "...";
		this.codItem= 0;
		this.bonus= "...";
	}
	
	public Item(String nomeItem, int codItem, String bonus){
		this.nomeItem= nomeItem;
		this.codItem= codItem;
		this.bonus= bonus;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getCodItem() {
		return codItem;
	}

	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
		
}
