import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.util.HashMap;

public class Matrix extends JPanel implements MouseListener {
	
	public HashMap<Integer, MatrixTile[]> Spinner;
	private final int nRows;
	private MatrixTile[] rows;

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
	  }

	@Override
	
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					if(tile.getTile().contains(e.getX(), e.getY())) {
						tile.changeColor(MainWindow.cp.currentColor());
						break;
					}
					this.repaint();
				}
			}
		}	
		if(e.getButton() == MouseEvent.BUTTON3) {
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
