package game.framework;

import game.Game;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler extends Game{
	
	public LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	private GameObject tempObject;
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
	public void createLevel(){
		//Lateral esquerda da fase
		for (int yy=0; yy <HEIGTH; yy+=40)
			addObject(new Block(0, yy, ObjectId.Block));
		
		// Lateral direita da fase
		for (int yy=0; yy <HEIGTH; yy+=40)
			addObject(new Block(Game.WIDTH-32, yy, ObjectId.Block));

		//Plataforma
		for (int xx=200; xx<320; xx+=40)
			addObject(new Block(xx, 580, ObjectId.Block));
		
		for (int xx=360; xx<600; xx+=40)
			addObject(new Block (xx, 580, ObjectId.Block));
		//Çhão da fase
		for (int xx=0; xx<320; xx+=40)
			addObject(new Block(xx, Game.HEIGTH-32, ObjectId.Block));
		
		for (int xx=440; xx<600; xx+=40)
			addObject(new Block (xx, Game.HEIGTH-32, ObjectId.Block));
		
		for (int xx=680; xx<720; xx+=40)
			addObject(new Block (xx, Game.HEIGTH-32, ObjectId.Block));
		

		for (int xx=720; xx<760; xx+=40)
			addObject(new Block (xx, Game.HEIGTH-72, ObjectId.Block));
		
		for (int xx=760; xx<800; xx+=40)
			addObject(new Block (xx, Game.HEIGTH-112, ObjectId.Block));
		
		for (int xx=800; xx<880; xx+=40)
			addObject(new Block (xx, Game.HEIGTH-152, ObjectId.Block));
		//for (int xx=0; xx<Game.WIDTH; xx+=40)
			//addObject(new Block(xx, Game.HEIGTH-32, ObjectId.Block));
		
		
	}
}

