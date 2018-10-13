<<<<<<< HEAD
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
=======
package src;

import javax.swing.*;
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba

import java.awt.*;
import java.util.concurrent.TimeUnit;

import static src.Main.t1;

public class MainWindow implements Runnable{

	public  JFrame window;
	public  GridBagConstraints conStraints;
	public  ColorPicker cp;
	public  MatrixHolder matrixHolder;

	private  JButton BtnSave;
	private  JButton BtnClr;
	public  JButton BtnSpin;
	public  JPanel fidgetArea;


	public MainWindow(){

		  JPanel panel;

		  this.BtnSave = new JButton("Save");
		  this.BtnClr = new JButton("Clear");
		  this.BtnSpin = new JButton("Spin");
		  JButton BtnS1 = new JButton("Spinner 1");
		  JButton BtnS2 = new JButton("Spinner 2");
		  JButton BtnS3 = new JButton("Spinner 3");
		  JButton BtnS4 = new JButton("Spinner 4");
		  JPanel sidebar = new JPanel(new GridLayout(10, 1));
		  this.fidgetArea = new JPanel(new GridBagLayout());
		  JPanel editArea = new JPanel(new GridLayout(1, 4));




<<<<<<< HEAD
public class MainWindow {

	public static JFrame window;
	public static JPanel panel;
	public static GridBagConstraints conStraints;
	public static ColorPicker cp = new ColorPicker();
	public static Matrix FS;
	
	private static JButton BtnAdd = new JButton("Add");
	private static JButton BtnClr = new JButton("Clear");
	public static JButton BtnSpin = new JButton("Spin");
	private static JButton BtnS1 = new JButton("Spinner 1");
	private static JButton BtnS2 = new JButton("Spinner 2");
	private static JButton BtnS3 = new JButton("Spinner 3");
	private static JButton BtnS4 = new JButton("Spinner 4");
	private static JPanel sidebar = new JPanel(new GridLayout(10, 1));
	private static JPanel fidgetArea = new JPanel(new GridBagLayout());
	private static JPanel editArea = new JPanel(new GridLayout(1, 4));
	

	public static void main(String[] args) {

		window = new JFrame();
=======
		this.matrixHolder = new MatrixHolder();



		this.window = new JFrame();
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
		window.setSize(648,480);
		window.setTitle("Fidget Spinner Maker");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		BtnClr.addActionListener(new ClearActionListener());
		BtnSpin.addActionListener(new RotateActionListener());
		BtnSave.addActionListener(new SaveActionListener());
		BtnS1.addActionListener(new SetMatrixActionListener(0));
		BtnS2.addActionListener(new SetMatrixActionListener(1));
		BtnS3.addActionListener(new SetMatrixActionListener(2));
		BtnS4.addActionListener(new SetMatrixActionListener(3));


		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setSize(400,250);

		panel.setLayout(new BorderLayout());
		panel.add(sidebar, BorderLayout.WEST);
		fidgetArea.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(fidgetArea, BorderLayout.CENTER);
		panel.add(editArea, BorderLayout.SOUTH);
		Border emptyBorder = BorderFactory.createEmptyBorder(80, 0, 0, 0);
		
		sidebar.setBorder(emptyBorder);
		sidebar.add(BtnS1);
		sidebar.add(BtnS2);
		sidebar.add(BtnS3);
		sidebar.add(BtnS4);
		editArea.add(BtnSave);
		editArea.add(BtnClr);
		editArea.add(BtnSpin);
<<<<<<< HEAD
		editArea.add(cp);

		conStraints = new GridBagConstraints();
		conStraints.insets = new Insets(80,150,80,80);
		conStraints.anchor = GridBagConstraints.CENTER;
=======

		this.cp = new ColorPicker();
		editArea.add(this.cp);
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba

		drawMatrix(this.matrixHolder.matrixList.get(1), this.matrixHolder.matrixList.get(0));

		window.add(panel);
		window.setVisible(true);



	}

	public void drawMatrix(Matrix o, Matrix n){
		this.conStraints = new GridBagConstraints();
		this.conStraints.insets = new Insets(0,0,0,0);
		this.conStraints.anchor = GridBagConstraints.CENTER;
		this.fidgetArea.remove(o);
		this.conStraints.anchor = GridBagConstraints.CENTER;
		this.conStraints.fill = GridBagConstraints.BOTH;
		this.conStraints.gridx = 2;
		this.conStraints.gridy = 2;
		this.conStraints.gridheight = 1;
		this.conStraints.weightx = 1;
		this.conStraints.weighty = 1;
		//n.setBorder(BorderFactory.createLineBorder(Color.red));
		this.fidgetArea.add(n, this.conStraints);
		window.revalidate();
		window.repaint();
	}

	@Override
	public void run() {
		while (true) {
			Integer i = SetMatrixActionListener.currentMatrix;
			Matrix m = this.matrixHolder.matrixList.get(i);
			//System.out.println("Rotate boolean is : " + i);
			if (m.rotate) {
				try {
					m.setRA(5.0);
					Thread.sleep(15);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Main.mainWindow.window.repaint();
				m.repaint();
				System.out.println("Repainting with angle: " + m.ra);
			}
			else {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//System.out.println("Not rotating");
			}

		}
	}
}
	