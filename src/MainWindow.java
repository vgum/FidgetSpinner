<<<<<<< HEAD
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
=======
package src;

>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba

import java.awt.*;

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
>>>>>>> a7e9fdf533ede45946aa396d24d652b87619cdba
		window.setSize(648,480);
		window.setTitle("Fidget Spinner Maker");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		BtnClr.addActionListener(new ClearActionListener());
		BtnSpin.addActionListener(new RotateActionListener());

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setSize(400,250);

		panel.setLayout(new BorderLayout());
		panel.add(sidebar, BorderLayout.WEST);
		panel.add(fidgetArea, BorderLayout.CENTER);
		panel.add(editArea, BorderLayout.SOUTH);
		Border emptyBorder = BorderFactory.createEmptyBorder(80, 0, 0, 0);
		
		sidebar.setBorder(emptyBorder);
		sidebar.add(BtnS1);
		sidebar.add(BtnS2);
		sidebar.add(BtnS3);
		sidebar.add(BtnS4);
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
}
	