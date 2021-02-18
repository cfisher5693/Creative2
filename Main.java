import javax.swing.JFrame;

import view.MainScreen;

public class Main {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(550, 35);
		var main = new MainScreen(window);
		main.init();
		window.pack();
		window.setVisible(true);
	}
}