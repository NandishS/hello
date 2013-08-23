import java.awt.Graphics;

import javax.swing.JApplet;


public class HelloApplet extends JApplet{
	public void paint(Graphics g) {
		g.drawString("Hello World",10 , 10);
	}
}
