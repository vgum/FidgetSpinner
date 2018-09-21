import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bar extends JComponent {

    Bar() {
        setPreferredSize(new Dimension(25, 75));
    }

    public void paintComponent(Graphics g) {
    	
    	
    	
    	
Color red = new Color(255,0,0);
		
		g.setColor(red);
        super.paintComponent(g);
        
        g.fillRect(0, 0, 100, 10);
    }
}