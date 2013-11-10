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
		for (int xx=0; xx<Game.WIDTH*SCALE; xx+=40)
			addObject(new Block(xx, Game.HEIGTH*cte , ObjectId.Block));
	}
}

