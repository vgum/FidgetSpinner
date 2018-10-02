import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ClearActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		MatrixTile tile;
		for(int i = 0; i < Matrix.nRows; i++)  {
			for(int j = 0; j < Matrix.nRows; j++) {
				tile = Matrix.Spinner.get(i)[j];
				tile.changeColor(Color.WHITE);
			}
		}
		MainWindow.FS.repaint();
	}
	
}