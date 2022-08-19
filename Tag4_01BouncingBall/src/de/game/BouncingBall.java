package de.game;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.time.Duration;
import java.time.Instant;

import static java.awt.event.KeyEvent.*;
import static java.lang.Math.*;

public class BouncingBall extends Frame{
	
	private static final int SIZE = 800;
	private BufferStrategy strategy;
	private boolean gameover = false;
	private int score = 0;
	
	
	private Ball ball = new Ball(SIZE / 2, SIZE /2, 30, 30);
	private Paddle paddle = new Paddle(600, SIZE-50, 200, 20);
	public BouncingBall() {
		setSize(SIZE, SIZE);
		addKeyListener(new MyKeyListener());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
	}

	
	public static void main(String[] args) {
		new BouncingBall().run();

	}

	private void run() {
		
		try {
			while(! gameover) {
				Instant start = Instant.now();
				calculateScene();
				renderScene();
				Instant ende = Instant.now();
				Duration duration = Duration.between(start, ende);
				//long wartezeit = 17-duration.toMillis();
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	private void calculateScene() {
		ball.x += ball.getxSpeed();
		ball.y += ball.getySpeed();
		
		if(ball.x > getWidth() || ball.x < 0)
			ball.setxSpeed(ball.getxSpeed() * -1);
		
		if(ball.y < 0)
			ball.setySpeed(ball.getySpeed() * -1);
		
		if (ball.y > getHeight()) {
			gameover = true;
		}
		
		if(ball.intersects(paddle)) {
			ball.setySpeed(ball.getySpeed() * -1);
			ball.y -= 5;
			score ++;
		}
			
	}

	private void renderScene() {
		Graphics g = strategy.getDrawGraphics();
		g.clearRect(0, 0, getWidth(), getHeight());
		if(gameover)
			g.drawString("Game Over", getWidth() / 2, getHeight() / 2);
		g.drawString("Score = " + score, 50, 100);
		ball.draw(g);
		paddle.draw(g);
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
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case VK_RIGHT:
				paddle.x +=10;
				break;
			case VK_LEFT:
				paddle.x -=10;
				break;
		
			}
		}
	}

}
