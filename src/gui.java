import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class gui extends JPanel {
	
	public void paint(Graphics b) {
		int[] c = new int[] {1200,1400,1400,1200,1000,1000};
		int[] d = new int[] {100,200,400,500,400,200};
		Graphics2D G = (Graphics2D) b;
		G.setColor(Color.blue);
		G.drawPolygon(c,d,6);
	}

	public static void main(String[] args) {
		JFrame a = new JFrame();
		a.add(new gui());
		a.setSize(1440,900);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
