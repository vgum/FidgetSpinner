
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BasicStroke;
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
	private boolean firstTime = true;

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
		 super.paintComponent(g);
		 super.paintComponent(g);
		 Graphics2D g2 = (Graphics2D) g;
		 //super.paintComponent(g);
		 Rectangle tile = null;
		 //g2.setStroke(new BasicStroke(5));
		 for(int i = 0; i < nRows; i++) {			 
	    	rows = (MatrixTile[]) Spinner.get(i);
	    	for (int j = 0; j < rows.length; j++) {
	    		tile = rows[j].getTile();
	    		tile.x = j * 40;
	    		tile.y = i * 40;
	    		g2.setColor(rows[j].getColor());
	    	//	if(!rows[j].isFilled()) {
	    	//		g2.draw(tile);
	    	//	} else {
	    			int x = 69;
	    			g2.fillRect(tile.x+1, tile.y+1, tile.width-1, tile.height-1);
	    			g2.setColor(Color.BLACK);
	    			g2.draw(tile);
	    	//	}
	    	}
	     }
	  }
	
	public void SwingUtilitiesisRightMouseButton(MouseEvent e) {
		System.out.println("it workkkkkkks");
	}

	@Override
	
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			//firstTime = false;
			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					if(tile.getTile().contains(e.getX(), e.getY())) {
						System.out.println("Yey wow we found the tile " + Spinner.get(i)[j].id);
						tile.changeColor(Color.GREEN);
						//this.invalidate();
						
						//this.revalidate();
						//this.repaint();
						//this.rede
						//this.setVisible(true);
						////thirepaint();
						//this.setVisible(false);
						break;
					}
					//this.invalidate();
					//>this.revalidate();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					this.repaint();
					//this.doLayout();
				
				}
			}
		}	
		if(e.getButton() == MouseEvent.BUTTON3) {
			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					if(tile.getTile().contains(e.getX(), e.getY())) {
						System.out.println("Yey wow we found the tile " + Spinner.get(i)[j].id);
						tile.changeColor(Color.WHITE);
						//this.invalidate();
						
						//this.revalidate();
						//this.repaint();
						//this.rede
						//this.setVisible(true);
						////thirepaint();
						//this.setVisible(false);
						break;
					}
					//this.invalidate();
					//>this.revalidate();
					this.repaint();
					this.repaint();
					this.repaint();
					//this.doLayout();
				
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
