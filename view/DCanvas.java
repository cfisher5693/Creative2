package view;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.util.ArrayList;
import model.Drawer;

public class DCanvas extends JPanel {
	private MainScreen panel;
	private ArrayList<Drawer> drawings = new ArrayList<>();
	
	public DCanvas(MainScreen panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(var d: drawings) {
			d.render(g2);
		}
	}

	public ArrayList<Drawer> getDrawings() {
		return drawings;
	}
}
