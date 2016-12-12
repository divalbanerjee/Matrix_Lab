package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bandi on 12/12/2016.
 */


public class MatrixDisplayPanel extends JPanel {

    Matrix myDisplayMatrix;
    Font myFont = new Font("Helvetica", Font.BOLD, 30);

    public MatrixDisplayPanel(){

    }

    public MatrixDisplayPanel(Matrix displayMatrix){

    }

    public void setMatrix(Matrix DisplayMatrix){
        this.myDisplayMatrix = DisplayMatrix;
    }

    public void paintComponent(Graphics g){
        String output = "";
        int VerticalShift = 0;
        for (int i = 0; i < myDisplayMatrix.getMyRows(); i++) {
            // outputString = outputString + " - ";
            for (int j = 0; j < myDisplayMatrix.getMyColumns(); j++) {
                if(j == 1){
                    output = output + myDisplayMatrix.getElem(i, j);
                }

                else if( j != 1) {
                    output = output + "," + myDisplayMatrix.getElem(i, j);
                }
            }
            g.drawString(output,10,VerticalShift);
            output  = "";
        }
    }

    
}
