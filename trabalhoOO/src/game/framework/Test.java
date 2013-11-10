package game.framework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Test extends GameObject{
	
	
public Test(float x, float y, ObjectId id) {
		super(x, y, id);
	}

public void tick(LinkedList<GameObject> object) {
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int) x, (int)y, 30, 60);
	}
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getVelX() {
		return velX;

	}

	public float getVelY() {
		return velY;
	}

	public void setVelX(float velX) {
		this.velX = velX;
	}

	public void setVelY(float velY) {
		this.velY = velY;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

}
