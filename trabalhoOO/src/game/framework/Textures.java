package game.framework;

import java.awt.image.BufferedImage;
import game.*;

// Classe que dita as texturas
public class Textures {
	
	public BufferedImage player, enemy, boss, ground, plant, rock;
	
	private SpriteSheet ss;
	
	public Textures(Main game) {
		// Acrescentar dados nas demais classes!!!!
		ss = new SpriteSheet(game.getSpriteSheet());
		
		getTextures();
	}

		private void getTextures(){
			player = ss.grabImage(1, 1, 60, 60);
			enemy = ss.grabImage(2, 2, 120, 120);
			//consertar o tamanho e posição do Boss
			boss = ss.grabImage(1, 1, 540, 360);
			ground = ss.grabImage(4, 1, 60, 60);
			//Deus, como lidar?
			plant = ss.grabImage(5, 2, 120, 120);
			//rever isso aí também, produção.
			player = ss.grabImage(6, 1, 60, 60);
		}
}
