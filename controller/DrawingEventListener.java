package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.Drawer;

import java.awt.Color;

import view.MainScreen;

public class DrawingEventListener implements ActionListener, MouseListener {
	private MainScreen panel;
	private Color color = Color.white;
	private int w = 10;
	private int h = 10;
	private Drawer drawer = new Drawer();

	public DrawingEventListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == panel.getClearButton()) {
			panel.getCanvas().getDrawings().clear();
			panel.getCanvas().repaint();
		} else if(source == panel.getColorList()) {
			String str = (String) panel.getColorList().getSelectedItem();
			if(str == "White") color = Color.white;
			if(str == "Red") color = Color.red;
			if(str == "Blue") color = Color.blue;
			if(str == "Yellow") color = Color.yellow;
			if(str == "Green") color = Color.green;
			if(str == "Orange") color = Color.orange;
			if(str == "Gray") color = Color.gray;
			if(str == "Pink") color = Color.pink;
			if(str == "Magenta") color = Color.magenta;
			if(str == "Cyan") color = Color.cyan;
		} else if(source == panel.getSizeList()) {
			String s = (String) panel.getSizeList().getSelectedItem();
			if(s == "Very Small") {
				w = 10;
				h = 10;
			} if(s == "Small") {
				w = 50;
				h = 50;
			} if(s == "Medium") {
				w = 100;
				h = 100;
			} if(s == "Big") {
				w = 150;
				h = 150;
			} if(s == "Very Big") {
				w = 200;
				h = 200;
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		drawer = new Drawer();
		drawer.x = e.getX();
		drawer.y = e.getY();
		drawer.w = w;
		drawer.h = h;
		drawer.setColor(color);
		panel.getCanvas().getDrawings().add(drawer);
		panel.getCanvas().repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
}
