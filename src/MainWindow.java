import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;

public class MainWindow {

	public static JFrame window;
	public static JButton b1,b2,b3,b4;
	public static JPanel panel;
	public static GridBagLayout gLayout;
	public static GridBagConstraints conStraints;
	public static ColorPicker cp;
	private static JButton BtnAdd = new JButton("Add");
	private static JButton BtnClr = new JButton("Clear");
	private static JButton BtnSpin = new JButton("Spin");
	private static JButton BtnS1 = new JButton("Spinner 1");
	private static JButton BtnS2 = new JButton("Spinner 2");
	private static JButton BtnS3 = new JButton("Spinner 3");
	private static JButton BtnS4 = new JButton("Spinner 4");
	private static JPanel sidebar = new JPanel(new GridLayout(10, 1));
	private static JPanel fidgetArea = new JPanel(new GridBagLayout());
	private static JPanel editArea = new JPanel(new GridLayout(1, 4));
	public static Matrix FS;

	public static void main(String[] args) {
		
		window = new JFrame();
		window.setSize(648,480);
		window.setTitle("Fidget Spinner Maker");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		
		BtnClr.addActionListener(new ClearActionListener());

		panel = new JPanel();
		panel.setLayout(gLayout = new GridBagLayout());
		panel.setBackground(Color.WHITE);
		window.add(panel);
		
		/////////// COLUMN 1 /////////////////
		conStraints = new GridBagConstraints();
		conStraints.anchor = GridBagConstraints.NORTHWEST;
		conStraints.fill = GridBagConstraints.HORIZONTAL;
		conStraints.fill = GridBagConstraints.VERTICAL;
		
		conStraints.weightx = 0.3;
		conStraints.weighty = 0.3;
		
		b1= new JButton("Run");
		b1= new JButton("Spinner 1");
		conStraints.gridx = 0;
		conStraints.gridy = 0;
		panel.add(b1, conStraints);
		
		b2 = new JButton("Clear");
		b2.addActionListener(new ClearActionListener());
		b2 = new JButton("Spinner 2");
		conStraints.gridx = 0;
		conStraints.gridy = 1;
		panel.add(b2, conStraints);
	
		b3 = new JButton("Save");
		b3 = new JButton("Spinner 3");
		conStraints.gridx = 0;
		conStraints.gridy = 2;
		panel.add(b3, conStraints);
		System.out.println(MainWindow.b3);

		////////// COLUMN 2 /////////////////
		//conStraints.anchor = GridBagConstraints.NORTH;

		cp = new ColorPicker();
		conStraints.gridx = 0;
        conStraints.gridy = 3;
		panel.add(cp,conStraints);
		System.out.println(MainWindow.cp);
		
		//Add spinner
		Matrix FS = new Matrix(5);
		FS = new Matrix(6);
		conStraints.anchor = GridBagConstraints.CENTER;
		conStraints.fill = GridBagConstraints.BOTH;
		conStraints.gridx = 1;
		conStraints.gridy = 1;
		conStraints.gridheight = 2;
		conStraints.weightx = 0.8;
		conStraints.weighty = 0.5;
		//conStraints.gridheight = 2;
		panel.add(FS, conStraints);


		
		window.setVisible(true);
	}


}
	