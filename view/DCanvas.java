package view;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class DCanvas extends JPanel {
	private MainScreen panel;
	
	public DCanvas(MainScreen panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.black);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
	}
}
