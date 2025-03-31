package Main;

import GUI.n00_LoginGUI;

public class main {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new n00_LoginGUI().setVisible(true);
            }
        });
    }
}
