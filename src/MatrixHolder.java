package src;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MatrixHolder extends ArrayList implements Serializable {

    public String holderName;
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
            System.out.println("Old Spinners is null...");
            createNewMatrix();
        }

    }

    public void addMatrix(Matrix m){
        matrixList.add(m);

    }

    public void createNewMatrix() {
        System.out.println("Did not find any valid save data, creating new spinners...");
        this.matrixList.add(new Matrix(5));
        this.matrixList.add(new Matrix(5));
        this.matrixList.add(new Matrix(5));
        this.matrixList.add(new Matrix(5));
    }



}