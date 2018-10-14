package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import static src.Main.sessionHandler;

public class SaveActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<HashMap<Integer, MatrixTile[]>> spinnerList = new ArrayList<HashMap<Integer, MatrixTile[]>>();

        for (Matrix m : Main.mainWindow.matrixHolder.matrixList) {
            HashMap<Integer, MatrixTile[]> tempSpinner = m.Spinner;
            spinnerList.add(tempSpinner);
       for (Matrix m : Main.mainWindow.matrixHolder.matrixList) {
                HashMap<Integer, MatrixTile[]> tempSpinner = m.Spinner;
                spinnerList.add(tempSpinner);
        }

        sessionHandler.WriteObjectToFile(spinnerList);
    }

}