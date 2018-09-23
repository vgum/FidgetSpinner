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
	
	public HashMap Spinner;
	private final int nRows;
	private MatrixTile[] rows;
	private MatrixTile[] columns;
	private Rectangle rect;

	public Matrix(int nRows) {
		this.nRows = nRows;
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
		 //Graphics2D g2 = (Graphics2D) g;
	     //for(int i = 0; i < nRows; i++) {
	    //	rows = (MatrixTile[]) Spinner.get(i);
	    //	for (int j = 0; j < rows.length; j++) {
	    //		Rectangle tile = rows[j].getTile();
	    //		tile.x = i+9;
	    //		tile.y = j;
	    //		g2.setColor(rows[j].getColor());
	    //		g2.draw(tile);
	    //	}
	    // }
		 g.setColor(Color.BLUE);
		 g.fillRect(0, 0, 100, 30);
		 g.setColor(Color.GREEN);
		 g.fillRect(100, 0, 100, 30);
		 
	  }

	 // public Dimension getPreferredSize() {
	 //   return new Dimension(10, 10); // appropriate constants
	 // }
	
}
