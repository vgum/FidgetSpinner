package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import static java.awt.Color.GREEN;

public class ColorPicker extends JButton implements ActionListener {

    public Color chosenColor;

    public ColorPicker() {

        this.setText("Colors");
        this.addActionListener(this);
        chosenColor = Color.RED;
    }

    public Color currentColor() {
        return chosenColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chosenColor = JColorChooser.showDialog(
                ColorPicker.this,
                "Choose Background Color", GREEN);
    }

}
