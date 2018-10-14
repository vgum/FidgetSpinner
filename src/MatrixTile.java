package src;

import java.awt.Color;
import java.awt.Rectangle;
import java.io.Serializable;

public class MatrixTile implements Serializable {

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
	}

	public MatrixTile(int id) {
		tile = new Rectangle(width,width);
		this.id = id;
		this.color = defaultColor;
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
