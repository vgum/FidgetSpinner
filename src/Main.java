package src;

public class Main {

    public static SessionHandler sessionHandler;
    public static MainWindow mainWindow;
    public static Thread t1;

    public static void main(String[] args) {

        sessionHandler = new SessionHandler();
        mainWindow = new MainWindow();

        t1 = new Thread(mainWindow);
        t1.start();

    }

}
