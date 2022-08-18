package de.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Linie extends Frame {
	
	private static final int SIZE = 500;
	private int x1,y1,x2,y2;
	
	public Linie() {
		addWindowListener(new MyWindowListener());
		addMouseListener(new MyMouseListener());
		x1 = x2 = y1 = y2 = -1;
		setSize(SIZE, SIZE);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}

	public static void main(String[] args) {
		
		new Linie().setVisible(true);
	}
	
	

	class MyMouseListener extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			x1 = e.getX();
			y1 = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			x2 = e.getX();
			y2 = e.getY();
			repaint();
		}
		
	}

	class MyWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}
	}
}
