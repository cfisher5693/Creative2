package view;

import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainScreen {
	private JFrame window;
	private DCanvas canvas;
	private JButton clearButton = new JButton("Clear");
	private String[] colorNames = new String[] {"White", "Red", "Yellow", "Blue", "Green", "Orange", "Purple", "Pink", "Brown"};
	private JComboBox<String> colorList = new JComboBox<>(colorNames);

	public MainScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);
		southPanel.add(colorList);
		southPanel.add(clearButton);
		canvas = new DCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);
		//final DrawingEventListener listener = new DrawingEventListener(this);
		//clearButton.addActionListener(listener);
	}
}
