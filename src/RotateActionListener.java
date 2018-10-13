import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.SwingUtilities;
import javax.swing.text.View;

public class RotateActionListener implements ActionListener, Runnable {

	@Override
	public void actionPerformed(ActionEvent arg0) {
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
		
	}

}
