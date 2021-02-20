package edu.unicienciabga.estructura;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Vector dialog = new Vector();
        dialog.pack();
        dialog.setVisible(true);
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                Runtime.getRuntime().exit(0);
            }
        });
    }
}
