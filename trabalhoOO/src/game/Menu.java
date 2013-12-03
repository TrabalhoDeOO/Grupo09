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
	public Rectangle backButton = new Rectangle(Game.WIDTH/3 + 120, 600, 200, 50);
	
	Font font2 = new Font ("arial", Font.BOLD, 30);
	public boolean inicial = true;
	
	public void renderMenu(Graphics g){
//		if (inicial==true){
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.black);
		g.drawString("Rock the History!!!", Game.WIDTH/3 + 40, 100);
					
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
	//		}
		}
					
	public void renderHelp (Graphics h){
		inicial=false;
		Graphics2D h2d = (Graphics2D) h;
		
		h.setFont(font2);
		h.setColor(Color.black);
		h.drawString("Os controles se resumem a:", Game.WIDTH/3, Game.HEIGHT/3);
		h.drawString("Setas para se mover e pular;", Game.WIDTH/3, Game.HEIGHT/3+100);
		h.drawString("Espaço para confirmar",Game.WIDTH/3, Game.HEIGHT/3 +150);
		h.drawString("Esc para pausar", Game.WIDTH/3, Game.HEIGHT/3+ 200);
		h.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		h2d.draw(backButton);
	}

	public void renderBattle (Graphics i){
	//	inicial=false;
		Graphics2D i2d = (Graphics2D) i;
		}
	
	public void renderAbout (Graphics j){
	//	inicial=false;
		Graphics2D j2d = (Graphics2D) j;
		
		j.setFont(font2);
		j.setColor(Color.black);
		j.drawString("O jogo se passa em uma pré historia fantasiosa, onde é",  Game.WIDTH/6, Game.HEIGHT/3);
		j.drawString("possível ter um Homo Neanderthal enfretando seres como Dinossauros,", Game.WIDTH/6, Game.HEIGHT/3+50);
		j.drawString("Bichos-preguiça gigantes e coisas do genero.",  Game.WIDTH/6, Game.HEIGHT/3+100);
		
		j.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		j2d.draw(backButton);
	}
	
	public void renderCredit (Graphics k){
	//	inicial=false;
		Graphics2D k2d = (Graphics2D) k;
		
		k.setFont(font2);
		k.setColor(Color.black);
		k.drawString("Agradecimentos",  Game.WIDTH/6, Game.HEIGHT/3);
		k.drawString("[ Galera q receberá os agradecimentos]", Game.WIDTH/6, Game.HEIGHT/3+50);
		k.drawString("Equipe Técnica: ",  Game.WIDTH/6, Game.HEIGHT/3+100);
		k.drawString("Bruno Torrontteguy - ????????",  Game.WIDTH/6+ 100, Game.HEIGHT/3+150);
		k.drawString("Danilo Barros - ????????",  Game.WIDTH/6+ 100, Game.HEIGHT/3+200);
		k.drawString("Paulo Markes - ???????",  Game.WIDTH/6+ 100, Game.HEIGHT/3+250);
		k.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		k2d.draw(backButton);
	}
	
	public void renderSubmenu (Graphics l){
	//	inicial=false;
		Graphics2D l2d = (Graphics2D) l;
		
		l.setFont(font2);
		l.setColor(Color.black);
		l.drawString("O que você quer aqui, humano?",  Game.WIDTH/6, Game.HEIGHT/3);
		l.drawString("Q: Nos abandonar", Game.WIDTH/6, Game.HEIGHT/3+50);
		l.drawString("Espaço: voltar para onde você não deveria ter saído",  Game.WIDTH/6, Game.HEIGHT/3+100);
	//	l.drawString("Enter: Reiniciar o jogo",  Game.WIDTH/6, Game.HEIGHT/3+150);
		
		//l.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		//l2d.draw(backButton);
	}
}