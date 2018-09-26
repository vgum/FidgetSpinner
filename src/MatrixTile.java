

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MatrixTile extends JPanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int width = 40;
	private final int id;
	private final Color defaultColor = Color.BLACK;
	private Rectangle tile;
	private Color color;
	
	public MatrixTile(Color color, int id) {
		this.id = id;
		tile = new Rectangle(width,width);
		this.color = color;
		addMouseListener(this);
	}
	
	public MatrixTile(int id) {
		tile = new Rectangle(width,width);
		this.id = id;
		this.color = defaultColor;
		addMouseListener(this);
	}
	
	public Color getColor() {
		return color;
	}
	
	public void changeColor(Color color) {
		this.color = color;
	}
	public Rectangle getTile() {
		return tile;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(tile.contains(e.getX(),e.getY())) {
			System.out.println("HEEEEEEY");
		}
		System.out.println("You just clicked a tile hurray!!!!");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("This is a tile");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
