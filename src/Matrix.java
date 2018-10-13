package src;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Matrix extends JPanel implements MouseListener {
	
	public HashMap<Integer, MatrixTile[]> Spinner;
	public int nRows;
	public boolean rotate = false;
	public String matrixName;
	public double ra;
	public Graphics2D g2;
	private Integer offsetX = 150;
	private Integer offsetY = 75;
	
	private MatrixTile[] rows;

	public Matrix(int nRows) {
		this.ra = 70.0;
		this.setBorder(new EmptyBorder(100, 100, 100, 100));
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

	public void setRA(double angle) {
		this.ra=this.ra + angle;
	}

	public Matrix(HashMap<Integer, MatrixTile[]> s) {
		this.ra = 0.0;
		this.nRows = s.get(0).length;
		this.Spinner = s;
		addMouseListener(this);

	}


	protected void paintComponent(Graphics g) {
		Integer lap = 0;
		//while (lap<20) {
		 super.paintComponent(g);
		 this.g2 = (Graphics2D) g;
		 Rectangle tile = null;
		AffineTransform old = g2.getTransform();
		//g2.rotate(Math.toRadians(10));
		//draw shape/image (will be rotated)
		//g2.setTransform(old);
		double lambda = Math.sqrt(200*200+200*200)/2;
		//AffineTransform old = g2.getTransform();
		g2.translate(offsetX,offsetY);
		//g2.rotate(Math.toRadians(45));
		//g2.setTransform(old);

		//g2.translate(2*lambda*(Math.sin(Math.toRadians(this.ra-45))),-lambda*(Math.cos(Math.toRadians(this.ra))));
		//System.out.println("Angle: " + this.ra+" X axis: " +lambda*(Math.sin(Math.toRadians(this.ra-45))) + " Y axis: " + -lambda*(Math.cos(Math.toRadians(this.ra))));
		System.out.println("Lambda: " + lambda);
		//g2.rotate(Math.toRadians(this.ra));
		//g2.rotate(Math.toRadians(45), rectangle.getX() + rectangle.width/2, rectangle.getY() + rectangle.height/2);
		g2.rotate(Math.toRadians(this.ra), 100, 100);

		//g2.setTransform(old);


		//Graphics2D g2 = (Graphics2D) g;

			for (int i = 0; i < nRows; i++) {
				rows = (MatrixTile[]) Spinner.get(i);
				for (int j = 0; j < rows.length; j++) {
					tile = rows[j].getTile();
					tile.x = j * 40;
					tile.y = i * 40;
					g2.setColor(rows[j].getColor());
					g2.fillRect(tile.x + 1, tile.y + 1, tile.width - 1, tile.height - 1);
					g2.setColor(Color.BLACK);
					g2.draw(tile);

				}
			}

			//ra += 10;
			//lap++;
			g2.setTransform(old);
		//}

	  }
	
	public boolean getRotate() {
		return rotate;
	}

	@Override

	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");

		if(e.getButton() == MouseEvent.BUTTON1) {
			//System.out.println("Clicked left");
			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					//System.out.println("Checking tiles" + e.getX() + ":" + e.getY());
					if(tile.getTile().contains(e.getX()-offsetX, e.getY()-offsetY)) {
						//System.out.println("Contains");
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

/*	@Override
	public void run() {
		while (true) {
			System.out.println("In run status is: " + this.rotate);
			if (this.rotate) {
				try {
					this.setRA(5.0);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Main.mainWindow.window.repaint();
				repaint();
				System.out.println("Repainting with angle: " + this.ra);
			}
			else {
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Not rotating");
			}

		}
	}*/
}
