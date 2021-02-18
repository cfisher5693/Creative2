package view;

import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.DrawingEventListener;


public class MainScreen {
	private JFrame window;
	private DCanvas canvas;
	private JButton clearButton = new JButton("Clear");
	private String[] colorNames = new String[] {"White", "Red", "Yellow", "Blue", "Green", "Orange", "Magenta", "Pink", "Gray", "Cyan"};
	private String[] sizes = new String[] {"Very Small", "Small", "Medium", "Big", "Very Big"};
	public JComboBox<String> colorList = new JComboBox<>(colorNames);
	public JComboBox<String> sizeList = new JComboBox<>(sizes);

	public MainScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);
		southPanel.add(colorList);
		southPanel.add(clearButton);
		southPanel.add(sizeList);
		canvas = new DCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);
		final DrawingEventListener listener = new DrawingEventListener(this);
		clearButton.addActionListener(listener);
		colorList.addActionListener(listener);
		sizeList.addActionListener(listener);
		canvas.addMouseListener(listener);
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public DCanvas getCanvas() {
		return canvas;
	}

	public JFrame getWindow() {
		return window;
	}

	public JComboBox<String> getColorList() {
		return colorList;
	} 

	public JComboBox<String> getSizeList() {
		return sizeList;
	}
}
