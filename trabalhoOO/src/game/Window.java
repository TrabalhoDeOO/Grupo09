package game;

import java.awt.Canvas;
import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.image.BufferStrategy;
//import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Window extends Canvas implements Runnable {
	
	//Dados estáticos
	//private static final long serialVersionUID = 1L;
	//public static final int WIDTH = 512;
//	public static final int HEIGTH = WIDTH / 12 * 9;
//	public static final int SCALE = 2;
//	public static final String TITLE = "Are you a neanderthal?";
	
/*	private BufferedImage image = new BufferedImage(WIDTH, HEIGTH, BufferedImage.TYPE_INT_RGB);
	private BufferedImage background = null;
	private boolean running = false;
	private Thread thread;
			
/*	private synchronized void start(){
		if (running)
		return;
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	private synchronized void stop(){
		if (!running)
			return;
		
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(1);
	}
	*/
	public void run(){
		/*init();
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int updates =0;
		int frames = 0;
		long timer = System.currentTimeMillis();
		
		while (running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
		
		if (System.currentTimeMillis() - timer > 1000){
			timer += 1000;
			System.out.println(updates+ " Ticks, Fps " + frames);
			updates = 0;
			frames = 0;
		}
		}
		stop();*/
	}
	
	
	//private void init() {
		// TODO Auto-generated method stub
		
//	}

	public void tick() {
		}

	/*private void render(){
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		////////////////////////////////
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		//g.setColor(Color.red);
		g.fillRect(0, 0, 800, 800);
		g.drawImage(background, 0,0, null);
		
		
		///////////////////////////////////////
		g.dispose();
		bs.show();	
	}*/
	
	public static void main(String args[]){
		Window game = new Window();
		
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
	
					
		//game.start();
	}

}
