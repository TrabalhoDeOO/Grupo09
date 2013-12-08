package game;

import game.entidade.InimigoEvento;
import game.entidade.Player;
import game.entidade.grimorio.Grimorio;
import game.framework.AudioPlayer;
import game.framework.BufferedImageLoader;
import game.framework.Handler;
import game.framework.KeyInput;
import game.framework.MouseInput;
import game.framework.ObjectId;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
//import game.framework.Level1;
//import game.framework.Level1;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1;
	public static final int WIDTH = 1399;
	public static final int HEIGHT = 758;
	public static final String TITLE = "Rock the History!";
	
	//private BufferedImage spriteSheet = null;
	private BufferedImage background = null;
	private boolean running = false;
	private Thread thread;
	private Menu menu;
	Grimorio grim = new Grimorio();
	Handler handler;
	private AudioPlayer bgm;
	Player player;
	int vida = 2;
	boolean backgroundMenu = true;
	BufferedImageLoader loader = new BufferedImageLoader();

	//	Level1 nivel1;
	
	public static STATE State = STATE.MENU;

	public void init(){	
		handler = new Handler();
		bgm = new AudioPlayer("/level1-1.mp3");
		bgm.play();
		requestFocus();
		BufferedImageLoader loader = new BufferedImageLoader();
		//Setando o background
		try{			
			background = loader.loadImage("/fase1-1.png");
		} catch (IOException e){
		e.printStackTrace();
			}
		//nivel1 = new Level1();
		player = new Player( "HUURGH", "homem", 1, 50,460, handler, ObjectId.Player);
		handler.addObject(player);		
		//Inimigo 1
		InimigoEvento ie = grim.getGrimorioInimigos().get(0);
		ie.setX(160);
		ie.setY(HEIGHT-87);
		ie.setHandler(handler);
		ie.setObjectId(ObjectId.InimigoT);
		handler.addObject(ie);
		//Inimigo 2
		ie = grim.getGrimorioInimigos().get(1);
		ie.setX(544);
		ie.setY(HEIGHT-247);
		ie.setHandler(handler);
		ie.setObjectId(ObjectId.InimigoT);
		handler.addObject(ie); 
		//Inimigo 3
		ie = grim.getGrimorioInimigos().get(10);
		ie.setX(928);
		ie.setY(HEIGHT-87);
		ie.setHandler(handler);
		ie.setObjectId(ObjectId.InimigoT);
		handler.addObject(ie);
		//Inimigo 4
		ie = grim.getGrimorioInimigos().get(2);
		ie.setX(1280);
		ie.setY(HEIGHT-151);
		ie.setHandler(handler);
		ie.setObjectId(ObjectId.InimigoT);
		handler.addObject(ie);
	//	nivel1.createLevel1();
		handler.createLevel1();
		
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(new MouseInput());
		menu = new Menu();				
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
		//		System.out.println("FPS: " + frames + " TICKS: " + updates);
				frames = 0;
				updates = 0;
			}
		}
		stop();
		}
	
		private void tick() {
			if (State== STATE.GAME){
				handler.tick();
			}    
			// Morte no cenário
			if (player.getY()>=775){
				player.setHp(0);
			}  /* Morte em batalha */
			if (player.getHp() <=0 && vida>=1){
				vida --;
				handler.removeObject(player);
				init();
			} else if (player.getHp() ==0 && vida==0){				
				State = STATE.MENU;	
			}			
		}
			
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null){
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		Graphics h = bs.getDrawGraphics();
		Graphics b = bs.getDrawGraphics();
		Graphics j = bs.getDrawGraphics();
		Graphics k = bs.getDrawGraphics();
		Graphics l = bs.getDrawGraphics();
		
		g.drawImage(background, 0, 0, null);
		if(State == STATE.GAME){
			handler.render(g);
		} 
		else if (State== STATE.MENU){
			if(vida ==0){
				vida=2;				
			}
			menu.renderMenu(g);
		} else if (State ==STATE.HELP){
			menu.renderHelp(h);
		} else if (State==STATE.ABOUT){
			menu.renderAbout(j);
		} else if (State==STATE.CREDIT){
			menu.renderCredit(k);
		} else if (State== STATE.SUBMENU){
			menu.renderSubmenu(l);
		} else if (State==STATE.BATTLE){
			
		}		
		g.dispose();
		bs.show();
	}
	
	public synchronized void stop(){
	}
	
	public static void main(String args[]) {
		new Window (WIDTH, HEIGHT, TITLE, new Game());	
	}
	
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;	
	}
	public void setBackground(String path){
		try {
			background = loader.loadImage(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
/*
if (State !=STATE.GAME && State!=STATE.BATTLE){
BufferedImageLoader loader = new BufferedImageLoader();
//Setando o background
	try{
	 background = loader.loadImage("/background_menu.png");
} catch (IOException e){
e.printStackTrace();
	}
}	else if (State==STATE.GAME){
	BufferedImageLoader loader = new BufferedImageLoader();
		//Setando o background
		try{			
			background = loader.loadImage("/fase1-1.png");
		} catch (IOException e){
		e.printStackTrace();
	} 
}*/