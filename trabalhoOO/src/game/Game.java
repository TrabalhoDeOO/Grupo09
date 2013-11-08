package game;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 512;
	public static final int HEIGTH = WIDTH / 12 * 9;
	public static final int SCALE = 2;
	public static final String TITLE = "Are you a neanderthal?";
	
	private int fps;
	private int ticks;
	private boolean running = false;
	private Thread thread;
	
	public synchronized void start(){
}
	public void run(){
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
			while (delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
		
		if (System.currentTimeMillis() - timer > 1000){
			timer += 1000;
			int fps = frames;
			int ticks = updates;
			System.out.println("FPS: " + frames + "TICKS: " + updates);
			updates = 0;
			frames = 0;
		}
		}
		stop();
		}
	
	
	private void render() {
	}
	
	private void tick() {
	}
	
	public synchronized void stop(){
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		new Window (WIDTH, HEIGTH, TITLE, new Game());
			
	}
	public int getTicks() {
		return ticks;
	}
	public void setTicks(int ticks) {
		this.ticks = ticks;
	}
	public int getFps() {
		return fps;
	}
	public void setFps(int fps) {
		this.fps = fps;
	}
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
