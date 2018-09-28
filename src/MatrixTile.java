
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MatrixTile {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int width = 40;
	public final int id;
	public final Color defaultColor = Color.WHITE;
	private Rectangle tile;
	private Color color;
	
	public MatrixTile(Color color, int id) {
		this.id = id;
		tile = new Rectangle(width,width);
		this.color = color;
		//addMouseListener(this);
	}
	
	public MatrixTile(int id) {
		tile = new Rectangle(width,width);
		this.id = id;
		this.color = defaultColor;
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		//addMouseListener(this);
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


}
