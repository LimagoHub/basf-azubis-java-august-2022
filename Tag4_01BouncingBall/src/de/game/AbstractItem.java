package de.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class AbstractItem extends Rectangle {

	public AbstractItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbstractItem(Dimension d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public AbstractItem(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	public AbstractItem(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public AbstractItem(Point p, Dimension d) {
		super(p, d);
		// TODO Auto-generated constructor stub
	}

	public AbstractItem(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public AbstractItem(Rectangle r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	
	public abstract void draw(Graphics g) ;

}
