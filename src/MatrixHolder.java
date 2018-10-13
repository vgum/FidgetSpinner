package src;

import java.util.ArrayList;
import java.util.HashMap;

public class MatrixHolder extends ArrayList {

    public int currentSpinner;
    private static final long serialVersionUID = 1L;
    public ArrayList<Matrix> matrixList;
    public static ArrayList<HashMap<Integer, MatrixTile[]>> savedSpinners;

    public MatrixHolder() {
        this.currentSpinner = 1;
        this.matrixList = new ArrayList<Matrix>();

        try {
            savedSpinners = (ArrayList<HashMap<Integer, MatrixTile[]>>) Main.sessionHandler.ReadObjectFromFile("./save/spinners.txt");

            if (savedSpinners != null) {
                for (HashMap<Integer, MatrixTile[]> s : savedSpinners) {
                    this.matrixList.add(new Matrix(s));
                }
            }
        }
        catch (Exception e) {
            createNewMatrix();
            System.out.println("Exception while reading file...");

        }
        if(savedSpinners==null){
            System.out.println("There is no saved spinners available");
            createNewMatrix();
        }

    }

    public void createNewMatrix() {
        System.out.println("Creating new spinners...");
        this.matrixList.add(new Matrix(5));
        this.matrixList.add(new Matrix(5));
        this.matrixList.add(new Matrix(5));
        this.matrixList.add(new Matrix(5));
    }



}