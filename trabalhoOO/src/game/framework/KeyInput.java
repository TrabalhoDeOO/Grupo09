package game.framework;

import game.Game;
import game.STATE;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//Classe Respons�vel por adicionar os comandos de teclado
public class KeyInput extends KeyAdapter {

	Handler handler;
	

	public KeyInput (Handler handler){
		this.handler = handler;

	}
	//Adicionando eventos quando pressionar algumas teclas
	public void keyPressed (KeyEvent e){
		int key = e.getKeyCode();
		
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
		if (key == KeyEvent.VK_ESCAPE){
			System.exit(1);
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