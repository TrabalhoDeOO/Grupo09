package game.framework;

import java.awt.Graphics;
import java.util.LinkedList;

public abstract class GameObject {

	protected float x, y;
	protected ObjectId id;
	protected float velX=0, velY=0;
	
	public GameObject (float x, float y, ObjectId id){
		this.x =x;
		this.y=y;
		this.id = id;
	}
	
	public abstract void tick(LinkedList<GameObject> object);
	public abstract void render (Graphics g);
	
	public abstract float getX();
	public abstract float getY();
	public abstract void  setX(float x);
	public abstract void setY( float y);

	public abstract float getvelX();
	public abstract float getvelY();
	public abstract void  setvelX(float velX);
	public abstract void setvelY( float velY);
	
	public abstract ObjectId getId();
	public abstract void setId(ObjectId id);

}
