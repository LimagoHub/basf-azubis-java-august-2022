package de.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

public class Linie extends Frame {
	
	private static final int SIZE = 500;
	
	private BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);
	
	public Linie() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		addMouseListener(new MyMouseListener());
		setResizable(false);
		setBackground(Color.BLACK);
		setSize(SIZE, SIZE);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, SIZE, SIZE,this);
	}

	public static void main(String[] args) {
		
		new Linie().setVisible(true);
	}
	
	

	class MyMouseListener extends MouseAdapter{
		
		private int x,y;

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			Graphics schattenfenster = image.getGraphics();
			schattenfenster.drawLine(x, y, e.getX(), e.getY());
			schattenfenster.dispose();
			repaint();
		}
		
	}

//	class MyWindowListener extends WindowAdapter {
//		@Override
//		public void windowClosing(WindowEvent e) {
//			dispose();
//		}
//	}
}
