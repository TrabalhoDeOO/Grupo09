package game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class MainGame extends Canvas implements Runnable {
	public static final int WIDTH = 320;
	public static final int HEIGTH = WIDTH / 12 * 9;
	public static final int SCALE = 2;
	public static final String TITLE = "Are you a neanderthal?";
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGTH, BufferedImage.TYPE_INT_RGB);
	private BufferedImage background = null;
	private boolean running = false;
	private Thread thread;
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	private synchronized void start(){
		if (running)
		return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	
	
	public void main(String args[]){
		MainGame game = new MainGame();
		
		game.setPreferredSize(new Dimension (WIDTH * SCALE, HEIGTH * SCALE));
		game.setMaximumSize(new Dimension (WIDTH * SCALE, HEIGTH * SCALE));
		game.setMinimumSize(new Dimension (WIDTH * SCALE, HEIGTH * SCALE));
		
		JFrame frame = new JFrame(MainGame.TITLE);
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	
					
		game.start();
	}

}
