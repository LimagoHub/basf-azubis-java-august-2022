package de.gui;

import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.gui.PaintClone.Form;

public class MyMenuBar extends MenuBar {
	
	
	public MyMenuBar(PaintClone paintClone) {
		
		
		Menu menu;
		MenuItem menuItem;
		
		menu = new Menu("Datei");
		
		createItem(menu, "beenden", e->paintClone.dispose());
		
		add(menu);
		
		menu = new Menu("Formen");
		
		createItem(menu, "Linie", e->paintClone.setForm(Form.LINIE));
		createItem(menu, "Oval", e->paintClone.setForm(Form.OVAL));
		createItem(menu, "Rechteck", e->paintClone.setForm(Form.RECHTECK));
		menu.addSeparator();
		createItem(menu, "Löschen", e->paintClone.setForm(Form.LÖSCHEN));
		
		
		
		add(menu);
		
		menu = new Menu("Farben");
		
		createItem(menu, "weiss", e->paintClone.setColor(Color.WHITE));
		createItem(menu, "schwarz", e->paintClone.setColor(Color.BLACK));
		createItem(menu, "rot", e->paintClone.setColor(Color.RED));
		createItem(menu, "grün", e->paintClone.setColor(Color.GREEN));
		createItem(menu, "blau", e->paintClone.setColor(Color.BLUE));
		createItem(menu, "gelb", e->paintClone.setColor(Color.YELLOW));
		createItem(menu, "pink", e->paintClone.setColor(Color.PINK));
		
		add(menu);
	}

	private void createItem(Menu menu, String label, ActionListener listener) {
		MenuItem menuItem;
		menuItem = new MenuItem(label);
		menuItem.addActionListener(listener);
		menu.add(menuItem);
	}

}
