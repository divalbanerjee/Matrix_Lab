package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        int Rows = 0;
        Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter Rows"));
        int Columns = 0;
        Columns = Integer.parseInt(JOptionPane.showInputDialog("Enter Columns"));
        Matrix m1 = new Matrix(Rows, Columns);
        int lower = Integer.parseInt(JOptionPane.showInputDialog("Enter Lowest Random number"));
        int upper = Integer.parseInt(JOptionPane.showInputDialog("Enter largest random number"));
        m1.fillRandomMatrix(Rows, Columns,lower, upper);
        JOptionPane.showMessageDialog(null,m1.toString());
       // Matrix m2 = new Matrix();

        Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter Rows"));
        Columns = Integer.parseInt(JOptionPane.showInputDialog("Enter Columns"));
        */

        JFrame theGUI = new GUIWindow();

        theGUI.setTitle("GUI Program");
        theGUI.setSize(800,1100);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        theGUI.setVisible(true);
    }
}
