package game.framework;

import game.Game;
import game.STATE;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;

//Classe Responsável por adicionar os comandos de teclado
public class KeyInput extends KeyAdapter {

	Handler handler;
	private HashMap <String, AudioPlayer> sfx;

	public KeyInput (Handler handler){
		this.handler = handler;

	}
	//Adicionando eventos quando pressionar algumas teclas
	Game game = new Game();
	public void keyPressed (KeyEvent e){
		int key = e.getKeyCode();
		
		if (Game.State==Game.State.GAME && key == KeyEvent.VK_ESCAPE){	
			Game.State = Game.State.SUBMENU;
		}
			if (Game.State == Game.State.SUBMENU){				
				// Estudar melhor
			//	if (key == KeyEvent.VK_ENTER)
				//	game.start();
							
				if (key ==KeyEvent.VK_SPACE)
					Game.State = Game.State.GAME;
				
				if (key == KeyEvent.VK_Q)
					System.exit(1);				
			}		
		
		if(Game.State == STATE.GAME){
			
			sfx = new HashMap<String, AudioPlayer>();
			sfx.put("jump", new AudioPlayer("/jump.mp3"));
			
		for (int i=0; i< handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if (tempObject.getId() ==ObjectId.Player){
				if(key == KeyEvent.VK_UP && !tempObject.isJumping() ){
					sfx.get("jump").play();
					tempObject.jumping =true;
					tempObject.setVelY(-8);
				}
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(3);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(-3);
				}
			}		
		}
	}

	public void keyReleased (KeyEvent e){
	int key = e.getKeyCode();
		
		for (int i=0; i< handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if (tempObject.getId() ==ObjectId.Player){
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
				if(key == KeyEvent.VK_UP) tempObject.setVelY(0);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);				
			}
		}	
	}
}
