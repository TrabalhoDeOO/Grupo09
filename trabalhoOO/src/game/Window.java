package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window{
	
	public Window (int WIDTH, int HEIGTH, String TITLE, Game game){
		
		game.setPreferredSize(new Dimension (Game.WIDTH * Game.SCALE, Game.HEIGTH * Game.SCALE));
		game.setMaximumSize(new Dimension (WIDTH * Game.SCALE, Game.HEIGTH * Game.SCALE));
		game.setMinimumSize(new Dimension (WIDTH * Game.SCALE, Game.HEIGTH * Game.SCALE));
		
		JFrame frame = new JFrame(Game.TITLE);
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
						
		game.start();
	}

	public static void main(String args[]) {
		
	}
}