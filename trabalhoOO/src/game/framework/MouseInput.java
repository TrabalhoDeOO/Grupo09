package game.framework;

import game.Game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

	public MouseInput() {
	}

	public void mouseClicked(MouseEvent arg0) {
		
	}

	public void mouseEntered(MouseEvent arg0) {
		
	}

	public void mouseExited(MouseEvent arg0) {
		
	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(mx>= Game.WIDTH/3 + 120 && mx <= Game.WIDTH /3 +320){
			if (my>= 150 && my<=200){
				//Pressed Play Button
				Game.State = Game.State.GAME;
			}
		}
		
		//Quit Button
		if(mx>= Game.WIDTH/3 + 120 && mx <= Game.WIDTH /3 +320){
			if (my>= 550 && my<=600){
				//Pressed Quit Button
				System.exit(1);
			}
		}
	}

	public void mouseReleased(MouseEvent arg0) {
		
	}

}
