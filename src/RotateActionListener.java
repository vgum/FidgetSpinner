import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotateActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Matrix.rotate = !Matrix.rotate;
		MainWindow.FS.repaint();
		System.out.println("Rotated and repainted");
	}

}
