package game.framework;

import game.Game;
import game.STATE;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//Classe Responsável por adicionar os comandos de teclado
public class KeyInput extends KeyAdapter {

	Handler handler;
	

	public KeyInput (Handler handler){
		this.handler = handler;

	}
	//Adicionando eventos quando pressionar algumas teclas
	Game game = new Game();
	public void keyPressed (KeyEvent e){
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_ESCAPE){	
			Game.State = Game.State.SUBMENU;
		}
		//	if (Game.State == Game.State.SUBMENU){
				// Estudar melhor
				if (key == KeyEvent.VK_ENTER)
					game.run();
							
				if (key ==KeyEvent.VK_SPACE)
					Game.State = Game.State.GAME;
				
				if (key == KeyEvent.VK_ESCAPE){
				//	System.exit(1);
				}
		//	}		
	//	}
		
		if(Game.State == STATE.GAME){
		for (int i=0; i< handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if (tempObject.getId() ==ObjectId.Player){
				if(key == KeyEvent.VK_UP && !tempObject.isJumping() ){
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
