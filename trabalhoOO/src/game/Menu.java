package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {
	
	public Rectangle playButton = new Rectangle(Game.WIDTH/3 + 120, 150, 200, 50);
	public Rectangle helpButton = new Rectangle(Game.WIDTH/3 + 120, 250, 200, 50);
	public Rectangle aboutButton = new Rectangle(Game.WIDTH/3 + 120, 350, 200, 50);
	public Rectangle creditButton = new Rectangle(Game.WIDTH/3 + 120, 450, 200, 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH/3 + 120, 550, 200, 50);

	public void render(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Rock the Story!!!", Game.WIDTH/3 + 40, 100);
		
		Font fnt1 = new Font("arial", Font.BOLD, 30);
		g.setFont(fnt1);
		g.drawString("Jogar!", playButton.x+ 60, playButton.y + 35);
		g2d.draw(playButton);
		g.drawString("Ajude-me!", helpButton.x+ 30, helpButton.y+35);
		g2d.draw(helpButton);
		g.drawString("Sobre", aboutButton.x+ 40, aboutButton.y + 35);
		g2d.draw(aboutButton);
		g.drawString("Créditos", creditButton.x+ 40, creditButton.y + 35);
		g2d.draw(creditButton);
		g.drawString("Sair", quitButton.x+ 60, quitButton.y +35);
		g2d.draw(quitButton);
}

}
