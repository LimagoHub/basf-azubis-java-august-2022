package de.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Fenster extends Frame implements KeyListener , MouseListener{
	
	private static final int STEP = 2;
	private static final int SIZE = 500;
	private String message = "Hallo Fenster";
	private int x, y;
	
	public Fenster() {
		super("Ein tolles Fenster");
		x = y = SIZE / 2;
		addKeyListener(this);
		addMouseListener(this);
		setSize(SIZE, SIZE);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		
		
		g.drawString(message, 50, 100);
		g.drawRect(x, y, 30, 30);
		
	}
	
	
	public static void main(String[] args) {
		new Fenster();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			dispose();
			break;

		case KeyEvent.VK_RIGHT:
			x += STEP;
			break;

		case KeyEvent.VK_LEFT:
			x -= STEP;
			break;

		case KeyEvent.VK_UP:
			y -= STEP;
			break;

		case KeyEvent.VK_DOWN:
			y += STEP;
			break;

		
		}
		
		
		
		message = "Taste wurde gedrückt";
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		message = "Maus ist zuhaus!";
		repaint();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		message = "Maus ist raus!";
		repaint();
		
	}

}
