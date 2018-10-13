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
			}
			else {
				m.ra = 0.0;
				Main.mainWindow.BtnSpin.setText("Spin");
			}
//			if(m.rotate){
//				Main.mainWindow.t1.start();
//			}
//			else {
//				Main.mainWindow.t1.pause();
//			}

			System.out.println("Rotate status is " + m.rotate);
	}

}
