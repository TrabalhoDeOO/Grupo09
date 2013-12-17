package game.entidade;
import game.Game;
import game.framework.GameObject;
import game.framework.Handler;
import game.framework.ObjectId;
import game.interfaces.SetandoBonus;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.LinkedList;




public class Player extends GameObject implements SetandoBonus {
	
	public static int SKILLS = 0;
	
	public String nome;
	public String sexo;
	public ArrayList<Item> mochila = new ArrayList<Item>();
	public int lvl;
	public int atk = (this.lvl*4);
	public int def =  (this.lvl*4);
	public int hp = (this.atk/2+this.def*2);
	private int hpMax = (this.atk/2+this.def*2);
	public int speed =  (int)((this.lvl*3)+(this.atk*0.65)-(this.def*0.4));
	public int jump;
	public int xp;
	private int xpMax = (this.lvl*5);
	public int bonusDef;
	public int bonusAtk;
	public int bonusHp;
	public Arma arma = null;
	public Vestimenta roupa = null;
	Game game = new Game();
	
	private int concha;
	
	public Player(String nomeP, String sexoP, int lvlP, float x, float y, Handler handler, ObjectId id){
		super(x,y, id);	
		this.nome = nomeP;
		this.sexo = sexoP;
		this.lvl = lvlP;
		this.xp = 0;
		concha = 0;
		this.x = x;
		this.y = y;
		setStatus();
		this.id = id;
		this.handler = handler;
		
	}
	
	public Player(ObjectId id) {
		super(0,0,id);
		this.nome = "sem nome";
		this.sexo = "nao informado";
		this.lvl = 0;
		this.xp = 0;
		concha=0;
		setStatus();
		handler = null;
	}

	private void setStatus(){
		this.atk =  (this.lvl*4);
		this.def = (this.lvl*2);
		this.hp = (this.atk/2+this.def*2);
		this.hpMax = (this.atk/2+this.def*2);
		this.speed = (int)((this.lvl*3)+(this.atk*0.65)-(this.def*0.4));
		this.jump = 20;
		//this.xp = 0;
		this.xpMax = (this.lvl*5);
		if(arma!= null){
			verificarItem(arma);
		}
		if(roupa!=null){
			verificarItem(roupa);
		}
		
	}
	
	public String getStatus(){
		return String.format("%s - %s\tLevel: %d\nAtk: %d\t\tDef: %d\n" +
				"Hp: %d/%d\tSpeed: %d\nJump: %d\tExp: %d/%d\n", this.nome,
				this.sexo,this.lvl,this.atk,this.def,this.hp, this.hpMax,
				this.speed,this.jump,this.xp,this.xpMax);
	}
	
	public void addDinheiro(int conchas){
		int antConcha = this.concha;
		if(this.concha<999){
			this.concha+=conchas;
			
			while(this.concha>999){
				this.concha--;
			}
			System.out.println("Você se tornou "+(this.concha-antConcha)+" Conchas" +
					" mais rico\n");
		}else{
			System.out.println("Limite de Conchas alcançado\n");
		}
		
	}
	
	public void removeDinheiro(int conchas){
		if((this.concha-conchas)>=0){
			this.concha-=conchas;
			System.out.println("Você se tornou "+conchas+" Conchas" +
					" mais pobre\n");
		}else{
			System.out.println("Você não possui Conchas o suficiente\n");
		}
	}
		
	public void addXp(int xp){
		this.xp += xp;
		verificarXp();
	}
	
	private void verificarXp(){
		 while (this.xp >= this.xpMax){
			 this.xp -= this.xpMax;
			 int newlvl = this.lvl + 1;
			 System.out.println("\tLVL UP!!!!!!!\n");
			 setLvl(newlvl);
			 if(newlvl%5==0){
				 if(this.SKILLS<=3){
					 this.SKILLS +=1; 
					 listarSkills();
				 }
			 }
		}
		 System.out.println(getStatus()+"\n");
	}
	
	public InimigoEvento Skill(InimigoEvento inimigo, int opcao){
		switch(opcao){
			case 1://Berserk
				break;
			case 2://Taunt
				break;
			case 0:System.out.println("Nenhuma skill");
				break;
		}
		return inimigo;
	}
	
	public void tick(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
		setStatus();
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk){
		this.atk= atk;
	}
	
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp<=this.hpMax){
			this.hp = hp;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getConcha() {
		return concha;
	}

	public void setConcha(int concha) {
		this.concha = concha;
	}

	public ArrayList<Item> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<Item> mochila) {
		this.mochila = mochila;
	}

	public int getHpMax() {
		return hpMax;
	}
	
	public int getXpMax() {
		return xpMax;
	}
	

	public Arma getArma() {
		return arma;
	}

	public Vestimenta getRoupa() {
		return roupa;
	}

	public boolean validaPlayer(String sexo){
		boolean validacao;
		
		String mulher = "mulher";
		String homem = "homem";
		
		if(sexo.equalsIgnoreCase(mulher)){
			validacao = true;
		}else if(sexo.equalsIgnoreCase(homem)){
			validacao = true;
		}else{
			System.out.println("Sexo Invalido!");
			validacao = false;
		}
		
		return validacao;
	}
	
	public void adicionaItem(Item item){
		if(item instanceof Arma){
			this.atk = (this.lvl*4);
			this.arma = (Arma) item;
			verificarItem(item);
		}else if(item instanceof Vestimenta){
			this.def = (this.lvl*2);
			this.roupa = (Vestimenta) item;
			verificarItem(item);
		}else if(item instanceof Consumivel){
			if (mochila.size()>4){
				System.out.println("mochila cheia");
			}else{
				mochila.add(item);
			}
		}
	}
	public void verificarItem (Item item){
		
		if(item instanceof Arma){
			
			 setAtk((this.lvl*4));
			int atk = item.getBonus()+this.atk;
			addBonusAtk(atk);
		}else if(item instanceof Vestimenta){
			setDef((this.lvl*2));
			int def = item.getBonus()+this.def;
			addBonusDef(def);
		}else if(item instanceof Consumivel){
			int hpRecuperada = item.getBonus()+this.hp;
			addBonusHp(hpRecuperada);
			
		}
			
	}

	@Override
	public void addBonusHp(int hp) {
		
		if(hp>this.hpMax){
			System.out.println("+ " +(this.hpMax-this.hp) + " hp");
			setHp(this.hpMax);
		}else if(hp<this.hpMax){
			System.out.println("+ " +(hp-this.hp) + " hp");
			setHp(hp);
		}
	}

	@Override
	public void addBonusAtk(int atk) {
		setAtk(atk);
	}

	@Override
	public void addBonusDef(int def) {
		setDef(def);
	}
	
	public void listarMochila(){
		for(int i = 0;i< this.mochila.size(); i++){
			System.out.println(i + " - Nome Item: "+ this.mochila.get(i).getNomeItem()+ "\n    Bonus: recupera  "+
		this.mochila.get(i).getBonus() +" de HP\n" + " Valor: " + this.mochila.get(i).getValor() + " conchas\n");
		}
	}
	
	public void listarSkills(){
		ArrayList<String> skills = new ArrayList<String>();
		skills.add("1: -\tBerserk:\n" +
				"Você entra em um estado de histeria e acaba atacando tudo e todos\n" +
				"em seu caminho. O lado bom da loucura é que não exite mais senso de\n" +
				"misericórdia.");
		skills.add("2: -\tTaunt 2:\n" +
				"Provoca o inimigo obrigando ele a atacalo, os proximos 2 ataques serao\n" +
				"considerados como se voce estivesse bloqueando mas voce podera atacar livremente\n");
		
		if(this.SKILLS>0){
			for(int i=0;i<this.SKILLS;i++){
				System.out.println(skills.get(i));
			}
		}else{
			System.out.println("Nenhuma habilidade disponível.");
		}
	}
		
	// A partir daqui, os dados sao referentes á implementação gráfica do player
	
	private float widthP = 32, heightP = 64;
	private float gravity = 0.5f;
	private final float MAX_SPEED = 10;
	
	private Handler handler;
	BatalhaTurno battle = new BatalhaTurno();
	InimigoEvento ie = new InimigoEvento(id);
	int vidas = 3; /* número de vidas */
	boolean teste1 = false;
	
	public void tick(LinkedList<GameObject> object) {
		x += velX;
		y += velY;

		//Gravidade atuando
		if(falling || jumping){
			velY +=gravity;
					
		if (velY > MAX_SPEED)
			velY = MAX_SPEED;
		}
		Collision(object);		
		}

	private void Collision(LinkedList<GameObject> object){
		for (int i=0; i<handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);		
			// Colisão na base
						if(tempObject.getId()== ObjectId.Block){
						if (getBounds().intersects(tempObject.getBounds())){
							y = tempObject.getY() - heightP;
							velY = 0;
							falling = false;
							jumping = false;
						} else 
							falling = true;
						}	
			
			// Colisão na base com o inimigo
				if(tempObject.getId()==ObjectId.InimigoT){					
					if(getBounds().intersects(tempObject.getBounds())){
						ie = (InimigoEvento) tempObject;
						battle.batalha(this, ie);
						y = tempObject.getY() - heightP;
						velY = 0;
						falling = false;
						jumping = false;
						handler.removeObject(ie);
					}
				}
			//Colisão no topo
				if (getBoundsTop().intersects(tempObject.getBounds())){
					y = tempObject.getY() +32;
					velY = 0;	
					}				
			
				// Colisão no topo com o inimigo
				if(tempObject.getId()==ObjectId.InimigoT){
					if(getBoundsTop().intersects(tempObject.getBounds())){
						ie = (InimigoEvento) tempObject;
						battle.batalha(this, ie);
						handler.removeObject(ie);
						y = tempObject.getY() + heightP;
						
					}
				}
			//Colisão na direita
			if (getBoundsRigth().intersects(tempObject.getBounds())){
				x = tempObject.getX() - widthP;	
				
				//Colisão na direita com o inimigo
				if (tempObject.getId() == ObjectId.InimigoT){
						Game.State = Game.State.BATTLE;
					ie = (InimigoEvento) tempObject;
		//			battle.batalha(this, ie);
					handler.removeObject(ie);
					if (getBoundsRigth().intersects(tempObject.getBounds())){
						x = tempObject.getX() - 64;
						}
					}
				}
						
			//Colisão na esquerda
			if (getBoundsLeft().intersects(tempObject.getBounds())){					
					x = tempObject.getX() +32;
					//Colisão na direita com o inimigo
					if (tempObject.getId() == ObjectId.InimigoT){
						if (getBoundsLeft().intersects(tempObject.getBounds())){
							x = tempObject.getX() + 64;	
						//	Game.State = Game.State.BATTLE;
							ie = (InimigoEvento) tempObject;
							battle.batalha(this, ie);
							handler.removeObject(ie);
						}
					}
				}
			
		}		
	}
			
	//Renderizador dos gráficos, imagens e o que mais utilizar
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect((int)x, (int)y, (int)widthP, (int) heightP);
		}
	
	public Rectangle getBounds() {
		return new Rectangle ( (int) ((int)x+((widthP/2)-((widthP/2)/2))), (int) ((int)y+(heightP/2)), (int)widthP/2, (int) heightP/2);
	}
	
	public Rectangle getBoundsTop() {
		return new Rectangle ( (int) ((int)x+((widthP/2)-((widthP/2)/2))), (int) y, (int)widthP/2, (int) heightP/2);
	}
	
	public Rectangle getBoundsRigth() {
		return new Rectangle ((int) ((int)x+widthP-6), (int)y+5, (int)5, (int) heightP-10);
	}
	
	public Rectangle getBoundsLeft() {
		return new Rectangle ((int)x, (int)y+5, (int)5, (int) heightP-10);
	}	
	
	protected float getX (int X){
		return x;
	}
}

