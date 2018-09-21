package src;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.HashMap;

public class Matrix extends JPanel {
	
	private HashMap Spinner;
	private MatrixTile[] rows;
	private MatrixTile[] columns;
	private Rectangle rect;

	public Matrix(int nRows) {
		Spinner = new HashMap<Integer, MatrixTile[]>();
		int id = 0;
		MatrixTile[] row = new MatrixTile[nRows];
		for (int i = 0; i < nRows; i ++) {
			for (int j = 0; j < nRows; j++) {
				row[j] = new MatrixTile(id);
				id++;
			}
			Spinner.put(i, row);
		}
	}
	
	protected void paintComponent(Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;
		
		super.paintComponent(g2);  
		g2.setColor(Color.RED);  
	    g2.fillRect(0,0,10,10);
		//g2.draw(rect);  
	     
	  }

	 // public Dimension getPreferredSize() {
	 //   return new Dimension(10, 10); // appropriate constants
	 // }
	
}
