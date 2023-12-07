package geometry;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		JFrame frame = new JFrame();
		frame.setContentPane(drawing);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(500,500);
		p1.draw(g);
		
		Line l1 = new Line(new Point(500,200), new Point(500,400));
		l1.draw(g);
		
		Rectangle r1 = new Rectangle(new Point(400,200),50,50);
		Circle c1 = new Circle(new Point(300,200),50);
		Donut d1 = new Donut(new Point(200,200),50,30);
		
		r1.draw(g);
		c1.draw(g);
		d1.draw(g);	
	}

}
