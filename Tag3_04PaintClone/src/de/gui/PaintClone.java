package de.gui;

import java.awt.Color;
import java.awt.Frame;

public class PaintClone extends Frame {
	
	
	private static final int SIZE = 500;
	
	public enum Form {LINIE, OVAL, RECHTECK, LÖSCHEN};
	
	private Color color = Color.WHITE;
	private Form form = Form.LINIE;
	
		
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public PaintClone() {
		setMenuBar(new MyMenuBar(this));
		setResizable(false);
		setSize(SIZE, SIZE);
	}

	public static void main(String[] args) {
		new PaintClone().setVisible(true);

	}

}
