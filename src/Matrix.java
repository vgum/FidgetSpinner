package src;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.io.Serializable;
import java.util.HashMap;

public class Matrix extends JPanel implements MouseListener, Serializable {
	
	public HashMap<Integer, MatrixTile[]> Spinner;
	public int nRows;
	public boolean rotate = false;
	public String matrixName;
	
	private MatrixTile[] rows;

	public Matrix(int nRows) {
		this.matrixName = "I am a Matrix 4";
		this.nRows = nRows;
		this.Spinner = new HashMap<Integer, MatrixTile[]>();
		int id = 0;
		for (int i = 0; i < nRows; i ++) {
			MatrixTile[] row = new MatrixTile[nRows];
			for (int j = 0; j < nRows; j++) {
				row[j] = new MatrixTile(id);
				id++;
			}
			this.Spinner.put(i, row);
		}
		addMouseListener(this);

	}

	public Matrix(HashMap<Integer, MatrixTile[]> s) {
		this.nRows = s.get(0).length;
		this.Spinner = s;
		addMouseListener(this);

	}


	public int getRows(){
		return nRows;
	}
	
	protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 Graphics2D g2 = (Graphics2D) g;
		 Rectangle tile = null;
		 for(int i = 0; i < nRows; i++) {			 
	    	rows = (MatrixTile[]) Spinner.get(i);
	    	for (int j = 0; j < rows.length; j++) {
	    		tile = rows[j].getTile();
	    		tile.x = j * 40;
	    		tile.y = i * 40;
	    		g2.setColor(rows[j].getColor());
	    		g2.fillRect(tile.x+1, tile.y+1, tile.width-1, tile.height-1);
	    		g2.setColor(Color.BLACK);
	    		g2.draw(tile);
	    	}
	     }
		 if(rotate) {
			 g2.translate(300, 200);
			 g2.rotate(45);
		 }
	  }
	
	public boolean getRotate() {
		return rotate;
	}

	@Override

	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {

			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					if(tile.getTile().contains(e.getX(), e.getY())) {

						tile.changeColor(Main.mainWindow.cp.currentColor());
						break;
					}
					this.repaint();
				}
			}
		}	
		else if(e.getButton() == MouseEvent.BUTTON3) {

			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					if(tile.getTile().contains(e.getX(), e.getY())) {

						tile.changeColor(Color.WHITE);
						break;
					}
					this.repaint();	
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
