package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Drawer {
	public int x = 0;
	public int y = 0;
	public int w = 10;
	public int h = 10;

	private Color color = Color.white;

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void render(Graphics2D g2) {
		g2.setColor(color);
		g2.fillOval(x-(w/2), y-(h/2), w, h);
	}
}
