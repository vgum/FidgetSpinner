package src;

import javax.swing.*;

public class repaintThread implements Runnable {

    public JPanel tPanel;

    public repaintThread(JPanel panel) {

        tPanel = panel;
        // store parameter for later user
    }

    @Override
    public void run() {
        //while(true) {
         //   tPanel.repaint();
            //System.out.println("Repaint");
       // }
    }
}