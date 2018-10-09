package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


public class SetMatrixActionListener implements ActionListener, Serializable {

    static Integer oldMatrix = 0;
    Integer newMatrix;


    public SetMatrixActionListener(Integer i){
        this.newMatrix = i;

    }

    public Integer newValue(){
        return newValue();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Main.mainWindow.drawMatrix(Main.mainWindow.matrixHolder.matrixList.get(oldMatrix), Main.mainWindow.matrixHolder.matrixList.get(newMatrix));
       oldMatrix = this.newMatrix;
    }

}