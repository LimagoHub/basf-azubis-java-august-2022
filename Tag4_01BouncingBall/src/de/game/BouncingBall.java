package de.game;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

public class BouncingBall extends Frame{
	
	private static final int SIZE = 500;
	private BufferStrategy strategy;
	private boolean gameover = false;
	
	
	
	private Ball ball = new Ball(SIZE / 2, SIZE /2, 30, 30);
	
	public BouncingBall() {
		setSize(SIZE, SIZE);
		
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
		ball.x += ball.getxSpeed();
		ball.y += ball.getySpeed();
		
		if(ball.x > getWidth() || ball.x < 0)
			ball.setxSpeed(ball.getxSpeed() * -1);
		
		if(ball.y > getHeight() || ball.y < 0)
			ball.setySpeed(ball.getySpeed() * -1);
		
		
			
	}

	private void renderScene() {
		Graphics g = strategy.getDrawGraphics();
		g.clearRect(0, 0, getWidth(), getHeight());
		ball.draw(g);
		g.dispose();
		strategy.show();
		
	}
	
//	void foo() {
//		Rectangle a = new Rectangle(10, 20, 300, 50);
//		Rectangle b = new Rectangle(10, 10, 200, 50);
//		
//		if( a.intersects(b) )
//			System.out.println("Kollision");
//		
//	}

}
