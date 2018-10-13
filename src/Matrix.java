<<<<<<< HEAD
import javax.swing.JPanel;
import java.awt.geom.AffineTransform;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.util.HashMap;
=======
package src;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.Random;
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
import java.util.concurrent.TimeUnit;

@SuppressWarnings("serial")
public class Matrix extends JPanel implements MouseListener {
	
<<<<<<< HEAD
	public static HashMap<Integer, MatrixTile[]> Spinner;
	public static int nRows;
	public Rectangle tile;
	public static boolean rotate = false;
	public static double degrees = 0.0;
=======
	public HashMap<Integer, MatrixTile[]> Spinner;
	public int nRows;
	public boolean rotate = false;
	public String matrixName;
	public double ra;
	public Graphics2D g2;
	private Integer offsetX = 150;
	private Integer offsetY = 75;
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
	
	private MatrixTile[] rows;

	public Matrix(int nRows) {
<<<<<<< HEAD
		Matrix.nRows = nRows;
		Spinner = new HashMap<Integer, MatrixTile[]>();
=======
		this.ra = 0.0;
		this.setBorder(new EmptyBorder(100, 100, 100, 100));
		this.matrixName = "MatrixName";
		this.nRows = nRows;
		this.Spinner = new HashMap<Integer, MatrixTile[]>();
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
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
		this.ra=(this.ra + angle)%360;
	}

	public Matrix(HashMap<Integer, MatrixTile[]> s) {
		this.ra = 0.0;
		this.nRows = s.get(0).length;
		this.Spinner = s;
		addMouseListener(this);

	}


	protected void paintComponent(Graphics g) {
<<<<<<< HEAD
		Color color;
=======
		Integer lap = 0;
		//while (lap<20) {
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
		 super.paintComponent(g);
		 this.g2 = (Graphics2D) g;
		 Rectangle tile = null;
<<<<<<< HEAD
		 for(int i = 0; i < nRows; i++) {			 
	    	rows = (MatrixTile[]) Spinner.get(i);
	    	for (int j = 0; j < rows.length; j++) {
	    		tile = rows[j].getTile();
	    		tile.x = j * 40;
	    		tile.y = i * 40;

		    	g2.setColor(rows[j].getColor());
		    	//g2.fillRect(tile.x+1, tile.y+1, tile.width-1, tile.height-1);
		    	//Rectangle filling = new Rectangle(tile.x+1, tile.y+1, tile.width-1, tile.height-1);
		    	if(rotate) {
		    		Rectangle filling = new Rectangle(tile.x+1, tile.y+1, tile.width-1, tile.height-1);
		    		AffineTransform tx = new AffineTransform();
		    		tx.rotate(degrees);
		    		Shape newShape = tx.createTransformedShape(filling);
		    		g2.draw(newShape);
		    		g2.setColor(Color.BLACK);
		    		g2.draw(tile);
		    	}
		    	else {
		    		System.out.println("From else");
		    		g2.fillRect(tile.x+1, tile.y+1, tile.width-1, tile.height-1);
		    		g2.setColor(Color.BLACK);
		    		g2.draw(tile);
		    	}
	    	}
	     }
=======
		AffineTransform old = g2.getTransform();
		//g2.rotate(Math.toRadians(10));
		//draw shape/image (will be rotated)
		//g2.setTransform(old);
		//double lambda = Math.sqrt(200*200+200*200)/2;
		//AffineTransform old = g2.getTransform();
		g2.translate(offsetX,offsetY);
		//g2.rotate(Math.toRadians(45));
		//g2.setTransform(old);

		//g2.translate(2*lambda*(Math.sin(Math.toRadians(this.ra-45))),-lambda*(Math.cos(Math.toRadians(this.ra))));
		//System.out.println("Angle: " + this.ra+" X axis: " +lambda*(Math.sin(Math.toRadians(this.ra-45))) + " Y axis: " + -lambda*(Math.cos(Math.toRadians(this.ra))));
		//System.out.println("Lambda: " + lambda);
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

>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
	  }
	
	public boolean getRotate() {
		return rotate;
	}

	@Override

	public void mouseClicked(MouseEvent e) {
		//System.out.println("Clicked");
		Integer xPos = e.getX()-offsetX;
		Integer yPos = e.getY()-offsetY;


		if(e.getButton() == MouseEvent.BUTTON1) {
			//System.out.println("Clicked left");
			MatrixTile tile;
			for(int i = 0; i < nRows; i++)  {
				for(int j = 0; j < nRows; j++) {
					tile = Spinner.get(i)[j];
					//System.out.println("Checking tiles" + e.getX() + ":" + e.getY());
					if(tile.getTile().contains(xPos, yPos)) {
						//System.out.println("Contains");
						if (tile.getColor()==Main.mainWindow.cp.currentColor()) {
							//System.out.println("Same color");
							Random rand = new Random();
							float r = rand.nextFloat() / 2f + 0.5f;
							float g = rand.nextFloat() / 2f + 0.5f;
							float b = rand.nextFloat() / 2f + 0.5f;
							Color randomColor = new Color(r, g, b);
							tile.changeColor(randomColor);
						}
						else {
							tile.changeColor(Main.mainWindow.cp.currentColor());
						}
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
					if(tile.getTile().contains(xPos, yPos)) {

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
