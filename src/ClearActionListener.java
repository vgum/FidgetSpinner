package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.io.Serializable;

public class ClearActionListener implements ActionListener, Serializable {

	@Override
	public void actionPerformed(ActionEvent e) {
		MatrixTile tile;
		for(int i = 0; i < Main.mainWindow.FS.nRows; i++)  {
			for(int j = 0; j < Main.mainWindow.FS.nRows; j++) {
				tile = Main.mainWindow.FS.Spinner.get(i)[j];
				tile.changeColor(Color.WHITE);
			}
		}
		Main.mainWindow.FS.repaint();
	}
	
}
