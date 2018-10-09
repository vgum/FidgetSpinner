package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotateActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Matrix m = Main.mainWindow.matrixHolder.matrixList.get(SetMatrixActionListener.currentMatrix);
		m.rotate = !m.rotate;
		m.repaint();
		System.out.println("Rotated and repainted");
	}

}
