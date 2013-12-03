package game.framework;

import game.Game;
import game.STATE;

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
		
		if(mx>= Game.WIDTH/3 + 120 && mx <= Game.WIDTH /3 +320 && Game.State==Game.State.MENU){
			if (my>= 150 && my<=200){
				//Pressed Play Button
				Game.State = Game.State.GAME;
			}
			//Quit Button
				if (my>= 550 && my<=600){
					//Pressed Quit Button
					System.exit(1);
				}				
			//Help Button
				if(my>=250 && my<=300){
					Game.State= Game.State.HELP;
					}
			//About Button
				if(my>=350 && my<=400){
					Game.State = Game.State.ABOUT;
					}
			//Credit Button
				if(my>=450 && my<=500){
					Game.State = Game.State.CREDIT;
					}
				}		
			
			//Back Button
				if(mx>= Game.WIDTH/3 + 120 && mx <= Game.WIDTH /3 +320){
					if (my>= 600 && my<=650){
				//Pressed Back Button
						Game.State = Game.State.MENU;
					}
				}		
			}

	public void mouseReleased(MouseEvent arg0) {
		
	}

}
