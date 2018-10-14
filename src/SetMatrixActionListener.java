package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetMatrixActionListener implements ActionListener {

    static Integer currentMatrix = 0;
    private Integer newMatrix;


    public SetMatrixActionListener(Integer i){
        this.newMatrix = i;

    }

    public Integer newValue(){
        return newValue();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.mainWindow.drawMatrix(Main.mainWindow.matrixHolder.matrixList.get(currentMatrix), Main.mainWindow.matrixHolder.matrixList.get(newMatrix));
        currentMatrix = this.newMatrix;
    }

}