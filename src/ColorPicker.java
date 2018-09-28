


import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import static java.awt.Color.GREEN;

public class ColorPicker extends JButton implements ActionListener, ChangeListener {

    public Color chosenColor;
    public JColorChooser tcc;


    public ColorPicker() {

        this.setText("Colors");
        this.addActionListener(this);
        System.out.println("Added Action Listener");
        chosenColor = Color.RED;


    }

    public Color currentColor() {
        return chosenColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Clicked Color Button");
        chosenColor = JColorChooser.showDialog(
                ColorPicker.this,
                "Choose Background Color", GREEN);
        //System.out.println("New Color Chosen? " + chosenColor);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
