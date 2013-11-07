package game.Graphics;

import java.awt.image.BufferedImage;
import game.*;

public class Textures {
	
	public BufferedImage player, enemy, boss, ground, plant, rock;
	
	private SpriteSheet ss;
	
	public Textures(Main main) {
		// Acrescentar dados nas demais classes!!!!
		ss = new SpriteSheet(main.getSpriteSheet());
		
		getTextures();
	}

		private void getTextures(){
			player = ss.grabImage(1, 1, 60, 60);
			enemy = ss.grabImage(2, 2, 120, 120);
			//consertar o tamanho e posi��o do Boss
			boss = ss.grabImage(1, 1, 540, 360);
			ground = ss.grabImage(4, 1, 60, 60);
			//Deus, como lidar?
			plant = ss.grabImage(5, 2, 120, 120);
			//rever isso a� tamb�m, produ��o.
			player = ss.grabImage(6, 1, 60, 60);
		}
}
