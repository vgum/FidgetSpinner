

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;

public class Matrix extends JPanel implements MouseListener {
	
	public HashMap<Integer, MatrixTile[]> Spinner;
	private final int nRows;
	private MatrixTile[] rows;
	private MatrixTile[] columns;
	private Rectangle rect;
	public Rectangle tile;

	public Matrix(int nRows) {
		this.nRows = nRows;
		Spinner = new HashMap<Integer, MatrixTile[]>();
		int id = 0;
		for (int i = 0; i < nRows; i ++) {
			MatrixTile[] row = new MatrixTile[nRows];
			for (int j = 0; j < nRows; j++) {
				row[j] = new MatrixTile(id);
				id++;
			}
			Spinner.put(i, row);
		}
		addMouseListener(this);
		
	}
	
	protected void paintComponent(Graphics g) {  
		 Graphics2D g2 = (Graphics2D) g;
		 Rectangle tile = null;
		 for(int i = 0; i < nRows; i++) {			 
	    	rows = (MatrixTile[]) Spinner.get(i);
	    	for (int j = 0; j < rows.length; j++) {
	    		tile = rows[j].getTile();
	    		tile.x = j * 40;
	    		tile.y = i * 40;
	    		rows[j].addMouseListener(rows[j]);
	    		g2.setColor(rows[j].getColor());
	    		g2.draw(tile);
	    		//g2.fillRect(tile.x, tile.y, tile.width, tile.height);
	    	}
	     }
	  }

	@Override
	public void mouseClicked(MouseEvent e) {
		MatrixTile tile;
		for(int i = 0; i < nRows; i++)  {
			for(int j = 0; j < nRows; j++) {
				tile = Spinner.get(i)[j];
				if(tile.getTile().contains(e.getY(), e.getX())) {
					System.out.println("Yey wow we found the tile " + Spinner.get(i)[j].id);
					tile.changeColor(Color.GREEN);
					break;
				}

			}
		}
				
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}
	
}
