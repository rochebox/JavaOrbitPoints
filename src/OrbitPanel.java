import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class OrbitPanel extends JPanel implements MouseListener, ActionListener{
	
	private static final long serialVersionUID = -6612396446201779741L;
	//
	ArrayList<OurPoint2> pList = new ArrayList<OurPoint2>();
	int pWidth, pHeight;
	Color bColor = new Color(212, 253, 255);
	Timer t;
	
	
	public OrbitPanel(int w, int h) {
		pWidth = w;
		pHeight = h;
		this.setBackground(bColor);
		
		 t = new Timer(50, this);
		
		t.restart();
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(bColor);
		g.fillRect(0, 0, pWidth, pHeight);
		
		
		int pointSize = 11;
		for(OurPoint2 p: pList) {
			g.setColor(Color.BLACK);
			g.fillOval(p.getX()-5, p.getY()-5, pointSize, pointSize);
			p.drawOuterCircle(g);
			
		}
	}
	
	private void addPoint(int newX, int newY) {
		
		pList.add( 
				new OurPoint2(new Point(newX, newY))
				);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("You clicked me");
		addPoint(e.getX(), e.getY());
		repaint();
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Timer is working");
		for(OurPoint2 p: pList) {
			p.movePoint();
		}
		repaint();
		
	}
	

}
