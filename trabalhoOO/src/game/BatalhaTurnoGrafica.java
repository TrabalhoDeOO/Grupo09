package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class BatalhaTurnoGrafica {
	//Dados do players e inimigo
	private int hpP;
	
	private int hpI;
	private int atkP;
	private int atkI;
	private int defP;
	private int defI;
	private int velP;
	private int velI;
	
	//Botões e coisas do gênero
	public Rectangle atacar = new Rectangle(100, 100, 100, 100);
	public Rectangle defesa = new Rectangle (100, 100, 100, 100);
	public Rectangle atacarDef = new Rectangle (100, 100, 100, 100);
	public Rectangle item = new Rectangle (100, 100, 100, 100);
	public Rectangle fugir = new Rectangle (100, 100, 100, 100);
	Font font = new Font ("arial", Font.BOLD, 30);
	public static int HEALTH = 100*2;

	
	public void renderBattle (Graphics b){
		
		Game.State = Game.State.BATTLE;
		Graphics2D b2d = (Graphics2D) b;
		b.setFont(font);
		b.setColor(Color.black);
		
		b.drawString ("BORA LUTAR, PORRA!", 384, 64);
		b.drawString("Nome: ", 32, 128);
	//	b.drawString("Ataque: ", );
	}
}
