package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ClearActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Matrix m = Main.mainWindow.matrixHolder.matrixList.get(SetMatrixActionListener.currentMatrix);
		MatrixTile tile;
		for(int i = 0; i < m.nRows; i++)  {
			for(int j = 0; j < m.nRows; j++) {
				tile = m.Spinner.get(i)[j];
				tile.changeColor(Color.WHITE);
			}
		}
		m.repaint();
	}
	
}
