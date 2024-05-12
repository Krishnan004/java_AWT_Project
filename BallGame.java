package AWT.learning;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class BallGame extends Frame implements MouseMotionListener  {
	
	int circleX=200,circleY=200,circleRadius=20;
	
	public BallGame() {
		// TODO Auto-generated constructor stub
		setSize(800,800);
		setLayout(null);
		setVisible(true);
		setTitle("BallGame");
	}
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		addMouseMotionListener(this);
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval(circleX, circleY,2* circleRadius, 2*circleRadius);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BallGame();

	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		
		circleX=x;
		circleY=y;
		repaint();
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		if(x < circleX+circleRadius) {
			circleX=x+50;
		}
		if(x > circleX+circleRadius) {
			circleX=x-50;
		}
		if(y < circleY+circleRadius) {
			circleY=y+50;
		}
		if(y > circleY+circleRadius) {
			circleY=y-50;
		}
		repaint();
	}

}
