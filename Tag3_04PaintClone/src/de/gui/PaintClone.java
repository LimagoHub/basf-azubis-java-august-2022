package de.gui;

import java.awt.Frame;

public class PaintClone extends Frame {
	
	
	private static final int SIZE = 500;
	
	
	 public PaintClone() {
		setMenuBar(new MyMenuBar(this));
		setResizable(false);
		setSize(SIZE, SIZE);
	}

	public static void main(String[] args) {
		new PaintClone().setVisible(true);

	}

}
