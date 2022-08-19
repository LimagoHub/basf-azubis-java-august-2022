package de.game;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends AbstractItem {

	public Paddle(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
