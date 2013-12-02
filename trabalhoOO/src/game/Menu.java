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

	public void render(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("arial", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
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
}
	public void renderHelp (Graphics h){
		Graphics2D h2d = (Graphics2D) h;
		
		h.setFont(font2);
		h.setColor(Color.white);
		h.drawString("Os controles se resumem a:", Game.WIDTH/3, Game.HEIGHT/3);
		h.drawString("Setas para se mover e pular;", Game.WIDTH/3, Game.HEIGHT/3+100);
		h.drawString("Espaço para confirmar",Game.WIDTH/3, Game.HEIGHT/3 +150);
		h.drawString("Esc para tentar sair", Game.WIDTH/3, Game.HEIGHT/3+ 200);
		h.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		h2d.draw(backButton);
	}

	public void renderBattle (Graphics i){
		Graphics2D i2d = (Graphics2D) i;

		}
	public void renderAbout (Graphics j){
		Graphics2D j2d = (Graphics2D) j;
		
		j.setFont(font2);
		j.setColor(Color.white);
		j.drawString("O jogo se passa em uma pré historia fantasiosa, onde é",  Game.WIDTH/6, Game.HEIGHT/3);
		j.drawString("possível ter um Homo Neanderthal enfretando seres como Dinossauros,", Game.WIDTH/6, Game.HEIGHT/3+50);
		j.drawString("Bichos-preguiça gigantes e coisas do genero.",  Game.WIDTH/6, Game.HEIGHT/3+100);
		
		j.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		j2d.draw(backButton);
	}
	
	public void renderCredit (Graphics k){
		Graphics2D k2d = (Graphics2D) k;
		
		k.setFont(font2);
		k.setColor(Color.white);
		k.drawString("Agradecimentos",  Game.WIDTH/6, Game.HEIGHT/3);
		k.drawString("[ Galera q receberá os agradecimentos]", Game.WIDTH/6, Game.HEIGHT/3+50);
		k.drawString("Equipe Técnica: ",  Game.WIDTH/6, Game.HEIGHT/3+100);
		k.drawString("Bruno Torrontteguy - Desesperado com + de 5 mil linhas de código ",  Game.WIDTH/6+ 100, Game.HEIGHT/3+150);
		k.drawString("Danilo Barros - Nerd Escroto ",  Game.WIDTH/6+ 100, Game.HEIGHT/3+200);
		k.drawString("Paulo Markes - Implementador Gráfico - apenas (e olhe lá)",  Game.WIDTH/6+ 100, Game.HEIGHT/3+250);
		k.drawString("Legenda by: Macunaima ",  Game.WIDTH/6+ 100, Game.HEIGHT/3+300);

		k.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		k2d.draw(backButton);
	}
	
	public void renderSubmenu (Graphics l){
		Graphics2D l2d = (Graphics2D) l;
		
		l.setFont(font2);
		l.setColor(Color.white);
		l.drawString("O que você quer aqui, humano?",  Game.WIDTH/6, Game.HEIGHT/3);
		l.drawString("ESC: Nos abandonar", Game.WIDTH/6, Game.HEIGHT/3+50);
		l.drawString("Espaço: voltar para onde você não deveria ter saído",  Game.WIDTH/6, Game.HEIGHT/3+100);
		l.drawString("Enter: Reiniciar o jogo",  Game.WIDTH/6, Game.HEIGHT/3+150);
		
		//l.drawString("Voltar", backButton.x+ 60, backButton.y +35);
		//l2d.draw(backButton);
	}
}