package de.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Fenster extends Frame{
	
	
	
	public Fenster() {
		super("Ein tolles Fenster");
		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		
		g.drawLine(50, 50, 100, 100);
		g.fillOval(50, 50, 30, 30);
		
		//Color c = new Color(40, 31, 255);
		g.drawString("Hallo Fenster", 50, 200);
		g.setColor(Color.PINK);
		g.drawString("Hallo Fenster", 50, 100);
		
		
	}
	
	
	public static void main(String[] args) {
		new Fenster();
	}

}
