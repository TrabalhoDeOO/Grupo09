package game.framework;

import game.Game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

public class Handler extends Game{
	
	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	protected GameObject tempObject;
	private static float cte = (float) 1.92;
	
	public void tick(){
		for (int i=0; i<object.size(); i++){
			
			tempObject = object.get(i);
			
			tempObject.tick(object);
		}
	}
	
	public void render (Graphics g){
	for (int i=0; i<object.size(); i++){
			
			tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject (GameObject object){
		this.object.remove(object);
	}
	
	// Cenário da primeira fase - Acho q eu preciso modularizar isso.... =\
	
	public void createLevel1(){
		//Lateral esquerda da fase
		for (int yy=0; yy <HEIGHT; yy+=32)
			addObject(new Block(-32, yy, ObjectId.Block));
		
		// Lateral direita da fase
		for (int yy=0; yy <512; yy+=32)
			addObject(new Block(Game.WIDTH-23, yy, ObjectId.Block));
		
		//Çhão da fase
		for (int xx=0; xx<800; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-23, ObjectId.Block));
		for (int xx=896; xx<1152; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-23, ObjectId.Block));
		for (int xx=1248; xx<Game.WIDTH; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-23, ObjectId.Block));
							
		//Início da primeira pedra
		for (int xx=288; xx<352; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-55, ObjectId.Block));
		for (int xx=352; xx<416; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx=416; xx<448; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-119, ObjectId.Block));
		for (int xx=448; xx<480; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-151, ObjectId.Block));
		for (int xx=480; xx<608; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-183, ObjectId.Block));
		for (int xx=608; xx<672; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-151, ObjectId.Block));
		for (int xx=608; xx<640; xx+=32)
			addObject(new Block (xx, Game.HEIGHT-119, ObjectId.Block));
		// Essa parte irá desaparecer para dar lugar á passagem secreta
		for (int yy= Game.HEIGHT-87; yy<Game.HEIGHT-23; yy+=32)
			addObject(new Block (576, yy, ObjectId.Block));
		// Fim da primeira pedra
		
		// 2a pedra
		for (int xx=992; xx<1024; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-55, ObjectId.Block));
		for (int xx=1024; xx<1056; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx=1056; xx<1088; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-119, ObjectId.Block));
		for (int xx=1088; xx<1152; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-151, ObjectId.Block));
		for (int yy= 607; yy<Game.HEIGHT-23; yy+=32)
			addObject(new Block (1120, yy, ObjectId.Block));
			
		// 3a pedra
		for (int xx= 1248; xx<1280; xx+=32)
			addObject( new Block(xx, Game.HEIGHT-55, ObjectId.Block));
		for (int xx= 1280; xx<1344; xx+=32)
			addObject( new Block(xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx= 1344; xx<Game.WIDTH; xx+=32)
			addObject( new Block(xx, Game.HEIGHT-119, ObjectId.Block));
								
	}
	
	public void createLevel2(){
		//Lateral esquerda da fase
		for (int yy=0; yy <HEIGHT; yy+=32)
			addObject(new Block(-32, yy, ObjectId.Block));
		
		// Lateral direita da fase
		for (int yy=0; yy <512; yy+=32)
			addObject(new Block(Game.WIDTH+10, yy, ObjectId.Block));
		
		//Cenário da fase
		for (int xx= 0; xx<192; xx+=32)
			addObject( new Block(xx, Game.HEIGHT-87, ObjectId.Block));
		for (int xx=192; xx<224; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-119, ObjectId.Block));
		for (int xx=224; xx<256; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-151, ObjectId.Block));
		for (int xx=256; xx<288; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-183, ObjectId.Block));
		for (int xx=288; xx<320; xx+=32)
			addObject(new Block(xx, Game.HEIGHT-215, ObjectId.Block));
		for (int yy= 543; yy<Game.HEIGHT-119; yy+=32)
			addObject(new Block (320, yy, ObjectId.Block));
		for (int yy= Game.HEIGHT-119; yy<Game.HEIGHT-87; yy+=32)
			addObject(new Block (288, yy, ObjectId.Block));
		for (int yy= Game.HEIGHT-87; yy<Game.HEIGHT-33; yy+=32)
			addObject(new Block (256, yy, ObjectId.Block));
		for (int xx= 256; xx<384; xx+=32)
			addObject( new Block(xx, Game.HEIGHT-22, ObjectId.Block));
		//Caminho superior
		for (int yy= 512; yy<577; yy+=32)
			addObject(new Block (416, yy, ObjectId.Block));
		for (int xx=448; xx<480; xx+=32)
			addObject(new Block (xx, 512, ObjectId.Block));
		for (int xx=480; xx<512; xx+=32)
			addObject(new Block(xx, 544, ObjectId.Block));
		for (int xx=512; xx<544; xx+=32)
			addObject (new Block(xx, 512, ObjectId.Block));
		for (int xx=544; xx<576; xx+=32)
			addObject(new Block(xx, 480, ObjectId.Block));
		for (int xx=576; xx<600; xx+=32)
			addObject(new Block(xx, 448, ObjectId.Block));
		for (int xx=607; xx<704; xx+=32)
			addObject(new Block(xx, 416, ObjectId.Block));
		for (int yy=448; yy<480; yy+=32)
			addObject(new Block(703, yy, ObjectId.Block));
		for (int yy=352; yy<448; yy+=32)
			addObject(new Block(768, yy, ObjectId.Block));
		for (int yy=448; yy<544; yy+=32)
			addObject(new Block(800, yy, ObjectId.Block));
		for (int xx=800; xx<832; xx+=32)
			addObject(new Block(xx, 352, ObjectId.Block));
		for (int xx=832; xx<864; xx+=32)
			addObject(new Block(xx, 320, ObjectId.Block));
		for (int xx=864; xx<896; xx+=32)
			addObject(new Block(xx, 288, ObjectId.Block));
		for (int xx=896; xx<928; xx+=32)
			addObject(new Block(xx, 256, ObjectId.Block));
		for (int xx=928; xx<1056; xx+=32)
			addObject(new Block(xx, 224, ObjectId.Block));
		for (int xx=1056; xx<1184; xx+=32)
			addObject(new Block(xx, 192, ObjectId.Block));
		for (int xx=1184; xx<1216; xx+=32)
			addObject(new Block(xx, 160, ObjectId.Block));
		for (int yy=160; yy<480; yy+=32)
			addObject(new Block(1216, yy, ObjectId.Block));
		//Caminho inferior
		for (int xx=448; xx<480; xx+=32)
			addObject(new Block(xx, 704, ObjectId.Block));
		for (int xx=480; xx<544; xx+=32)
			addObject(new Block(xx, 672, ObjectId.Block));
		for (int xx=544; xx<576; xx+=32)
			addObject(new Block(xx, 640, ObjectId.Block));
		for (int xx=544; xx<640; xx+=32)
			addObject(new Block(xx, 608, ObjectId.Block));
		for (int xx=640; xx<672; xx+=32)
			addObject(new Block(xx, 640, ObjectId.Block));
		for (int xx=672; xx<704; xx+=32)
			addObject(new Block(xx, 672, ObjectId.Block));
		for (int xx=704; xx<736; xx+=32)
			addObject(new Block(xx, 704, ObjectId.Block));
		for (int xx=832; xx<960; xx+=32)
			addObject(new Block(xx, 704, ObjectId.Block));
		for (int xx=960; xx<992; xx+=32)
			addObject(new Block(xx, 672, ObjectId.Block));
		for (int xx=992; xx<1024; xx+=32)
			addObject(new Block(xx, 640, ObjectId.Block));
		for (int xx=1024; xx<1056; xx+=32)
			addObject(new Block(xx, 608, ObjectId.Block));
		for (int xx=1056; xx<1152; xx+=32)
			addObject(new Block(xx, 576, ObjectId.Block));
		for (int xx=1152; xx<1184; xx+=32)
			addObject(new Block(xx, 640, ObjectId.Block));
		for (int xx=1184; xx<1216; xx+=32)
			addObject(new Block(xx, 672, ObjectId.Block));
		for (int xx=1216; xx<1248; xx+=32)
			addObject(new Block(xx, 704, ObjectId.Block));
		for (int xx=1312; xx<Game.WIDTH; xx+=32)
			addObject(new Block(xx, 736, ObjectId.Block));
		
	}
}

