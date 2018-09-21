package src;

import java.awt.Color;
import java.awt.Rectangle;

public class MatrixTile {
	
	private final int width = 5;
	private final int id;
	private final Color defaultColor = Color.GREEN;
	private Rectangle tile;
	private Color color;
	
	public MatrixTile(Color color, int id) {
		this.id = id;
		tile = new Rectangle(width,width);
		this.color = color;
	}
	
	public MatrixTile(int id) {
		tile = new Rectangle(width,width);
		this.id = id;
		this.color = defaultColor;
	}
	
	public void changeColor(Color color) {
		this.color = color;
	}

}
