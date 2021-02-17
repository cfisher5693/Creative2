package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Drawer {
	public class Pos {
		public int x;
		public int y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private Pos[] p = new Pos[3];
	private Color color = Color.white;

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
