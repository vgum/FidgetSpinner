package src;

import java.io.*;

public class SessionHandler {

    private static final String filepath="./save/spinners.txt";

    public SessionHandler() {

    }


    public void WriteObjectToFile(Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("Saved all spinners");

        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }

    public Object ReadObjectFromFile(String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("Saved spinners has been loaded");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            System.out.println("Did not find the file: " + filepath);
            //ex.printStackTrace();
            return null;
        }
    }
}