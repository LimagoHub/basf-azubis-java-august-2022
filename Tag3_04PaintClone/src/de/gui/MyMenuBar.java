package de.gui;

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
		
		
		menuItem = new MenuItem("Rechteck");
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new MenuItem("Löschen");
		menu.add(menuItem);
		
		add(menu);
		
		menu = new Menu("Farben");
		
		menuItem = new MenuItem("Weiss");
		menu.add(menuItem);
		
		menuItem = new MenuItem("Schwarz");
		menu.add(menuItem);
		

		menuItem = new MenuItem("Rot");
		menu.add(menuItem);
		
		menuItem = new MenuItem("Grün");
		menu.add(menuItem);
		
		menuItem = new MenuItem("Blau");
		menu.add(menuItem);
		
		menuItem = new MenuItem("Pink");
		menu.add(menuItem);
		
		add(menu);
	}

	private void createItem(Menu menu, String label, ActionListener listener) {
		MenuItem menuItem;
		menuItem = new MenuItem(label);
		menuItem.addActionListener(listener);
		menu.add(menuItem);
	}

}
