package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bandi on 12/5/2016.
 */
public class GUIWindow extends JFrame{

    private Matrix m1 = new Matrix(0,0);
    private Matrix m2 = new Matrix (0,0);
    JLabel lblTitle = new JLabel("Matrix Lab");
    JLabel lblm1 = new JLabel();
    JButton btnGenerate = new JButton("Generate");
    JButton btnEnter = new JButton("Enter Manually");
    DefaultListModel model = new DefaultListModel();
    JList lstAnswer = new JList(model);
    JScrollPane pane = new JScrollPane(lstAnswer);

    public GUIWindow(){
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,2));
        btnGenerate.addActionListener(new generateListener());
        btnEnter.addActionListener(new enterListener());
        container.add(lblTitle);
        container.add(btnGenerate);
        container.add(btnEnter);
        container.add(pane);
    }

    public class generateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int Rows = 0;
            Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter Rows"));
            int Columns = 0;
            Columns = Integer.parseInt(JOptionPane.showInputDialog("Enter Columns"));
            Matrix m1 = new Matrix(Rows, Columns);
            int lower = Integer.parseInt(JOptionPane.showInputDialog("Enter Lowest Random number"));
            int upper = Integer.parseInt(JOptionPane.showInputDialog("Enter largest random number"));
            m1.fillRandomMatrix(Rows, Columns,lower, upper);
            int j = 0;
            String output = "";

            for (int i = 0; i < m1.getMyRows(); i++) {
                // outputString = outputString + " - ";
                for (j = 0; j < m1.getMyColumns(); j++) {
                    //outputString = outputString + this.myNumbers[i][j];
                    output = output + "," + m1.getElem(i,j);
                }
              //  model.add(String.valueOf(m1.getElem(i,j));
                System.out.println(output);
                output  = "";
            }
        }
    }
    public class enterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //int Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter Rows"));
           // int Columns = Integer.parseInt(JOptionPane.showInputDialog("Enter Columns"));
            int Rows = 0;
            Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter Rows"));
            int Columns = 0;
            Columns = Integer.parseInt(JOptionPane.showInputDialog("Enter Columns"));
            Matrix m2 = new Matrix(Rows, Columns);
           // System.out.println(Rows + "," + Columns);
            //m2.inputMatrix(Rows, Columns);
           // m2.inputMatrix(Rows,Columns);
            for (int i = 0; i < Rows; i++) {
                for (int j = 0; j < Columns; j++) {
                    //System.out.println(i + "," + j);
                    m2.setElem(i,j, Integer.parseInt(JOptionPane.showInputDialog("Enter value")));
                }
            }
            String output = "";
            for (int i = 0; i < m2.getMyRows(); i++) {
                // outputString = outputString + " - ";
                for (int j = 0; j < m2.getMyColumns(); j++) {
                    //outputString = outputString + this.myNumbers[i][j];
                   //System.out.println(m1.getElem(i,j));
                   // lstAnswer.add(new JLabel(""+m2.getElem(i,j)));
                    output = output + "," + m2.getElem(i,j);
                }
                System.out.println(output);
                output  = "";
            }

        }
    }
}
