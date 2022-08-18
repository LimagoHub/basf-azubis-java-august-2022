package de.game;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class BouncingBall extends Frame{
	
	private static final int SIZE = 500;
	private BufferStrategy strategy;
	private boolean gameover = false;
	
	private int x,y;
	private int xSpeed, ySpeed;
	
	public BouncingBall() {
		setSize(SIZE, SIZE);
		x = y = SIZE /2;
		xSpeed = ySpeed = 1;
		setVisible(true);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
	}

	
	public static void main(String[] args) {
		new BouncingBall().run();

	}

	private void run() {
		
		while(! gameover) {
			calculateScene();
			renderScene();
			// Warten
		}
		
	}

	private void calculateScene() {
		x += xSpeed;
		y += ySpeed;
		
		if(x > getWidth() || x < 0)
			xSpeed *= -1;
		
		if(y > getHeight() || y < 0)
			ySpeed *= -1;
			
	}

	private void renderScene() {
		Graphics g = strategy.getDrawGraphics();
		g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.fillOval(x, y, 20, 20);
		g.dispose();
		strategy.show();
		
	}

}
