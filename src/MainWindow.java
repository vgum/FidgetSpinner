package src;

import javax.swing.*;

import java.awt.*;
import java.io.Serializable;

public class MainWindow implements Serializable {

	public  JFrame window;
	public  GridBagConstraints conStraints;
	public  ColorPicker cp;
	public  Matrix FS;
	public  MatrixHolder matrixHolder;

	public  JButton BtnSave;
	private  JButton BtnClr;
	private  JButton BtnSpin;
	public  JPanel fidgetArea;
	Matrix M1;
	Matrix M2;
	Matrix M3;
	Matrix M4;

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




		this.matrixHolder = new MatrixHolder();

		this.window = new JFrame();
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
		panel.add(fidgetArea, BorderLayout.CENTER);
		panel.add(editArea, BorderLayout.SOUTH);

		sidebar.add(BtnS1);
		sidebar.add(BtnS2);
		sidebar.add(BtnS3);
		sidebar.add(BtnS4);
		editArea.add(BtnSave);
		editArea.add(BtnClr);
		editArea.add(BtnSpin);

		this.cp = new ColorPicker();
		editArea.add(this.cp);

		drawMatrix(this.matrixHolder.matrixList.get(1), this.matrixHolder.matrixList.get(0));

		window.add(panel);
		window.setVisible(true);

	}

	public void drawMatrix(Matrix o, Matrix n){
		this.conStraints = new GridBagConstraints();
		this.conStraints.insets = new Insets(80,150,80,80);
		this.conStraints.anchor = GridBagConstraints.CENTER;
		this.fidgetArea.remove(o);
		this.conStraints.anchor = GridBagConstraints.CENTER;
		this.conStraints.fill = GridBagConstraints.BOTH;
		this.conStraints.gridx = 2;
		this.conStraints.gridy = 2;
		this.conStraints.gridheight = 1;
		this.conStraints.weightx = 1;
		this.conStraints.weighty = 1;
		this.fidgetArea.add(n, this.conStraints);
		window.revalidate();
		window.repaint();
	}
}
	