package game;

import game.Graphics.BufferedImageLoader;
import game.entidade.Player;
import game.framework.Handler;
import game.framework.KeyInput;
import game.framework.ObjectId;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1;
	public static final int WIDTH = 1024;
	public static final int HEIGTH = 768;
	public static final String TITLE = "Are you a neanderthal?";
	
	//private BufferedImage spriteSheet = null;
	private BufferedImage background = null;
	private boolean running = false;
	private Thread thread;
		
	//Object
	Handler handler;
	
	public void init(){
		requestFocus();
		BufferedImageLoader loader = new BufferedImageLoader();
		handler = new Handler();
		handler.addObject(new Player( null, null, 1, 50,460, handler, ObjectId.Player));
		handler.createLevel();
		
		this.addKeyListener(new KeyInput(handler));
		try{			
			background = loader.loadImage("/background.png");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public synchronized void start(){
		if (running)
			return;
			
			running = true;
			thread = new Thread(this);
			thread.start();
}
	public void run(){
		init();
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
					
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println("FPS: " + frames + " TICKS: " + updates);
				frames = 0;
				updates = 0;
			}
		}
		stop();
		}
	
		private void tick() {
		handler.tick();
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null){
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		//////////////////////////////////
			
		
		g.drawImage(background, 0, 0, null);
		handler.render(g);
		/////////////////////////////////
		g.dispose();
		bs.show();
	}
	
	public synchronized void stop(){
	}
	
	public static void main(String args[]) {
		new Window (WIDTH, HEIGTH, TITLE, new Game());
			
	}
	
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	
}
