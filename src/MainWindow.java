

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

//HC Comment

public class MainWindow {
	
	public static JFrame window;
	public static JButton b1,b2,b3,b4;
	public static JPanel panel;
	public static GridBagLayout gLayout;
	public static GridBagConstraints conStraints;
	private static Matrix matrix;
	
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
		conStraints.fill = GridBagConstraints.VERTICAL;
		
		conStraints.weightx = 0.1;
		conStraints.weighty = 0.1;
		
		b1= new JButton("Spinner 1");
		conStraints.gridx = 0;
		conStraints.gridy = 0;
		panel.add(b1, conStraints);
		
		b2 = new JButton("Spinner 2");
		conStraints.gridx = 0;
		conStraints.gridy = 1;
		panel.add(b2, conStraints);
	
		b3 = new JButton("Spinner 3");
		conStraints.gridx = 0;
		conStraints.gridy = 2;
		panel.add(b3, conStraints);

		////////// COLUMN 2 //////////////////
		
		//Add spinner
		conStraints.anchor = GridBagConstraints.NORTHWEST;
		Matrix FS = new Matrix(5);
		conStraints.gridx = 1;
		conStraints.gridy = 1;
		panel.add(FS, conStraints);
		
		window.setVisible(true);
	}
}
	