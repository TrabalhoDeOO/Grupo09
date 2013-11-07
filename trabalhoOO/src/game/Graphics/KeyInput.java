package game.Graphics;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import game.*;

public class KeyInput extends KeyAdapter {

	Main game;
	
	public KeyInput (Main game){
		this.game = game;
	}
	
	public void keyPressed (KeyEvent e){
		game.keyPressed(e);
	}
	
	public void keyReleased (KeyEvent e){
		game.keyReleased(e);
	}
}
