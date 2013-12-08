package game.framework;

import java.awt.Graphics;
import java.util.LinkedList;

import game.Game;

public class Level1 extends Game{

	public LinkedList<GameObject> object = new LinkedList<GameObject>();

	private static final long serialVersionUID = 1L;
	protected GameObject tempObject;

		Handler obj = new Handler();
			
		public void createLevel1(){
			//obj = new GameObject();	
		//Lateral esquerda da fase
		for (int yy=0; yy <HEIGHT; yy+=32)
			obj.addObject(new Block(0, yy, ObjectId.Block));
		
		// Lateral direita da fase
		for (int yy=0; yy <512; yy+=32)
			obj.addObject(new Block(Game.WIDTH-23, yy, ObjectId.Block));
		
		//Çhão da fase
		for (int xx=0; xx<800; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-23, ObjectId.Block));
		for (int xx=896; xx<1152; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-23, ObjectId.Block));
		for (int xx=1248; xx<Game.WIDTH; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-23, ObjectId.Block));
							
		//Início da primeira pedra
		for (int xx=288; xx<352; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-55, ObjectId.Block));
		for (int xx=352; xx<416; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx=416; xx<448; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-119, ObjectId.Block));
		for (int xx=448; xx<480; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-151, ObjectId.Block));
		for (int xx=480; xx<608; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-183, ObjectId.Block));
		for (int xx=608; xx<672; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-151, ObjectId.Block));
		for (int xx=608; xx<640; xx+=32)
			obj.addObject(new Block (xx, Game.HEIGHT-119, ObjectId.Block));
		// Essa parte irá desaparecer para dar lugar á passagem secreta
		for (int yy= Game.HEIGHT-87; yy<Game.HEIGHT-23; yy+=32)
			obj.addObject(new Block (576, yy, ObjectId.Block));
		// Fim da primeira pedra
		
		// 2a pedra
		for (int xx=992; xx<1024; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-55, ObjectId.Block));
		for (int xx=1024; xx<1056; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx=1056; xx<1088; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-119, ObjectId.Block));
		for (int xx=1088; xx<1152; xx+=32)
			obj.addObject(new Block(xx, Game.HEIGHT-151, ObjectId.Block));
		for (int yy= 607; yy<Game.HEIGHT-23; yy+=32)
			obj.addObject(new Block (1120, yy, ObjectId.Block));
			
		// 3a pedra
		for (int xx= 1248; xx<1280; xx+=32)
			obj.addObject( new Block(xx, Game.HEIGHT-55, ObjectId.Block));
		for (int xx= 1280; xx<1344; xx+=32)
			obj.addObject( new Block(xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx= 1344; xx<Game.WIDTH; xx+=32)
			obj.addObject( new Block(xx, Game.HEIGHT-119, ObjectId.Block));	
	
		}
	}