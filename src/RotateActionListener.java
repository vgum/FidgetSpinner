package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.SwingUtilities;
import javax.swing.text.View;

public class RotateActionListener implements ActionListener, Runnable {

	@Override
	public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
		Matrix.rotate = !Matrix.rotate;	
		if(Matrix.rotate) {
			MainWindow.BtnSpin.setText("Stop");
		} else {
			MainWindow.BtnSpin.setText("Spin");
		}
		
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	for(int i = 0; i<5; i++) {
					try {
						TimeUnit.SECONDS.sleep(1);
						Matrix.degrees += 10;
						MainWindow.FS.revalidate();
						MainWindow.FS.repaint(1);
						System.out.println("sleept for one");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    }
		});
		
		//for(int i = 0; i<5; i++) {
		//		try {
		//			TimeUnit.SECONDS.sleep(1);
		///			Matrix.degrees += 10;
		//			MainWindow.FS.revalidate();
		//			MainWindow.FS.repaint(1);
		//			System.out.println("sleept for one");
		//		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//}
			
	}

	@Override
	public void run() {
		 new Thread() {
		        public void run() {
		        	for(int i = 0; i<5; i++) {
						try {
							Thread.sleep(1000);;
							Matrix.degrees += 10;
							MainWindow.FS.revalidate();
							MainWindow.FS.repaint(50L);
							System.out.println("sleept for one");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
		        }
		    }.run();
		
=======
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

<<<<<<< HEAD

>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
=======
			System.out.println("Rotate status is " + m.rotate);
>>>>>>> parent of a7e9fdf... Tidy up file read messages and random prints
	}

}
