

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;

public class MainWindow {

	public static JFrame window;
	public static JButton b1,b2,b3,b4;
	public static JPanel panel;
	public static GridBagLayout gLayout;
	public static GridBagConstraints conStraints;
<<<<<<< HEAD
	public static Matrix FS;
=======
	private static Matrix matrix;
>>>>>>> parent of baafd9a... New layout
	public static ColorPicker cp;
	
	public static void main(String[] args) {
		
		window = new JFrame();
		window.setSize(648,480);
		window.setTitle("Fidget Spinner Maker");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		
		panel = new JPanel();
		panel.setLayout(gLayout = new GridBagLayout());
		panel.setBackground(Color.WHITE);
		window.add(panel);
		
		/////////// COLUMN 1 /////////////////
		conStraints = new GridBagConstraints();
		conStraints.anchor = GridBagConstraints.NORTHWEST;
<<<<<<< HEAD
		conStraints.fill = GridBagConstraints.HORIZONTAL;
=======
		conStraints.fill = GridBagConstraints.VERTICAL;
>>>>>>> parent of baafd9a... New layout
		
		conStraints.weightx = 0.3;
		conStraints.weighty = 0.3;
		
<<<<<<< HEAD
		b1= new JButton("Run");
=======
		b1= new JButton("Spinner 1");
>>>>>>> parent of baafd9a... New layout
		conStraints.gridx = 0;
		conStraints.gridy = 0;
		panel.add(b1, conStraints);
		
<<<<<<< HEAD
		b2 = new JButton("Clear");
		b2.addActionListener(new ClearActionListener());
=======
		b2 = new JButton("Spinner 2");
>>>>>>> parent of baafd9a... New layout
		conStraints.gridx = 0;
		conStraints.gridy = 1;
		panel.add(b2, conStraints);
	
<<<<<<< HEAD
		b3 = new JButton("Save");
=======
		b3 = new JButton("Spinner 3");
>>>>>>> parent of baafd9a... New layout
		conStraints.gridx = 0;
		conStraints.gridy = 2;
		panel.add(b3, conStraints);
		System.out.println(MainWindow.b3);
<<<<<<< HEAD
		
=======

		////////// COLUMN 2 /////////////////
		//conStraints.anchor = GridBagConstraints.NORTH;

>>>>>>> parent of baafd9a... New layout
		cp = new ColorPicker();
		conStraints.gridx = 0;
        conStraints.gridy = 3;
		panel.add(cp,conStraints);
		System.out.println(MainWindow.cp);
<<<<<<< HEAD

		////////// COLUMN 2 /////////////////
		//conStraints.anchor = GridBagConstraints.NORTH;
		
		//Add spinner
		FS = new Matrix(5);
=======
		
		//Add spinner
		Matrix FS = new Matrix(5);
>>>>>>> parent of baafd9a... New layout
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
	