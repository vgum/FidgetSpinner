package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class RotateActionListener implements ActionListener, Serializable {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Main.mainWindow.FS.rotate = !Main.mainWindow.FS.rotate;
		Main.mainWindow.FS.repaint();
		System.out.println("Rotated and repainted");
	}

}
