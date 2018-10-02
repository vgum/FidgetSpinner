import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class MainWindow {

	public static JFrame window;
	public static JPanel panel;
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

	public static void main(String[] args) {

		window = new JFrame();
		window.setSize(648,480);
		window.setTitle("Fidget Spinner Maker");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);

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
		editArea.add(BtnAdd);
		editArea.add(BtnClr);
		editArea.add(BtnSpin);

		cp = new ColorPicker();
		editArea.add(cp);

		conStraints = new GridBagConstraints();
		conStraints.insets = new Insets(80,150,80,80);
		conStraints.anchor = GridBagConstraints.CENTER;

		//Add spinner
		Matrix FS = new Matrix(6);
		conStraints.anchor = GridBagConstraints.CENTER;
		conStraints.fill = GridBagConstraints.BOTH;
		conStraints.gridx = 2;
		conStraints.gridy = 2;
		conStraints.gridheight = 1;
		conStraints.weightx = 1;
		conStraints.weighty = 1;
		fidgetArea.add(FS, conStraints);

		window.add(panel);
		window.setVisible(true);

	}


}
	