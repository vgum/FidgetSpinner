package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class RotateActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Matrix m = Main.mainWindow.matrixHolder.matrixList.get(SetMatrixActionListener.currentMatrix);
		m.rotate = !m.rotate;
		if (m.rotate) {
			Main.mainWindow.BtnSpin.setText("Stop");
			System.out.println("Starting spin");
		}
		else {
			m.ra = 0.0;
			Main.mainWindow.BtnSpin.setText("Spin");
			System.out.println("Stopping spin");
		}
//			if(m.rotate){
//				Main.mainWindow.t1.start();
//			}
//			else {
//				Main.mainWindow.t1.pause();
//			}


	}

}
