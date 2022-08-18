package de.game;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends AbstractItem {

	
	private int xSpeed, ySpeed;

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed = ySpeed = 1;
				
	}



	public int getxSpeed() {
		return xSpeed;
	}



	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}



	public int getySpeed() {
		return ySpeed;
	}



	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}



	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, width, height);
	}

}
