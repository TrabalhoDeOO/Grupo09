package game.entidade.grimorio;


import game.entidade.Item;
import game.entidade.Loot;
import game.entidade.Rand;
import java.util.Random;

public class JavaliBoss extends Boss {

	public JavaliBoss() {
		super("Javali Gigante", 10 , "Boss");
		// TODO Auto-generated constructor stub
		Rand rand = new Rand();
		Item lootI;
		GrimorioItens grimorioI = new GrimorioItens();
		
		int lootD;
		Loot loot2;
		
		JavaliBoss.this.criarDescricao("Por muito tempo acreditaram que sua existência era apenas uma lenda\n" +
				"contada pra assustar as crianças e os mais covades. Sua lenda dizia que um Javali gigantesco\n" +
				"uma vez usurpou o titulo do rei da montanha, o Pterodactil, desde então ele vive no topo,\n" +
				"vigiando e guardando o seu trono de possíveis invasores." +
				"\nSe algum dia o vir corra - corra e não olhe pra trás - poderá ser sua ultima visão");
		int novoAtributo;
		int novoAtributo2;
		
		novoAtributo = JavaliBoss.this.getAtk()+10;
		novoAtributo2 = JavaliBoss.this.getHp()+20;
		JavaliBoss.this.setAtk(novoAtributo);
		JavaliBoss.this.setHp(novoAtributo2);
		novoAtributo = JavaliBoss.this.getSpe()-20;
		novoAtributo2 = JavaliBoss.this.getDef()+10;
		JavaliBoss.this.setSpe(novoAtributo);
		JavaliBoss.this.setDef(novoAtributo2);
		
		lootD = rand.Random(5, 10);
		
		if(rand()==0){
			lootI = grimorioI.getGrimorioItens().get(29);
		}else if(rand()==1){
			lootI = grimorioI.getGrimorioItens().get(19);
		}else if(rand()==2){
			lootI = grimorioI.getGrimorioItens().get(29);
		}else{
			lootI = grimorioI.getGrimorioItens().get(9);
		}
		
		loot2 = new Loot(lootD, lootI, JavaliBoss.this);
		JavaliBoss.this.criarLoot(loot2);
		
		
		
	}
	
	

	@Override
	public int calculaSkill(int hp) {
		int dano;
		dano = hp/2;
		
		// TODO Auto-generated method stub
		return dano;
	}
	
	private int rand(){
		Random rand = new Random();
		int var;
		//20% de chance para cada item
		var=rand.nextInt(5);
		return var;
	}	

}
