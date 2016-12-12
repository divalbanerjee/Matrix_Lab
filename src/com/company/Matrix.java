package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by bandi on 11/30/2016.
 */
/*rubric
    fill randomly, from user(keyboard), and from file
 */

public class Matrix {
    private double[][] myNumbers;
    private int myRows;
    private int myColumns;


    public Matrix(int Rows, int Columns) {
        this.myRows = Rows;
        this.myColumns = Columns;
        this.myNumbers = new double[Rows][Columns];
    }


    public double getElem(int Rows, int Columns) {
        return this.myNumbers[Rows][Columns];
    }

    public void setElem(int Row, int Column, int Value) {
        this.myNumbers[Row][Column] = Value;
    }


    public void fillRandomMatrix(int Rows, int Columns, int lower, int upper) {
        this.myRows = Rows;
        this.myColumns = Columns;
        this.myNumbers = new double[Rows][Columns];
        Random random = new Random();

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
               // System.out.println(i + "," + j);
                this.myNumbers[i][j] = random.nextInt(upper) + lower;
            }
        }
    }

    public void inputMatrix() {
        // Rows =0;
        // Rows = Integer.getInteger(JOptionPane.showInputDialog("Enter number of rows"));
        //Columns = 0;
        // Columns = Integer.getInteger(JOptionPane.showInputDialog("Enter number of Columns"));
/*
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                this.myNumbers[i][j] = Integer.getInteger(JOptionPane.showInputDialog("Enter value"));
            }
        }
        */
        //  this.myRows = Rows;
        //  this.myColumns = Columns;
        //  this.myNumbers = new double[Rows][Columns];
        int Rows = 0;
        Rows = Integer.parseInt(JOptionPane.showInputDialog("Enter Rows"));
        int Columns = 0;
        Columns = Integer.parseInt(JOptionPane.showInputDialog("Enter Columns"));
        Matrix m2 = new Matrix(Rows, Columns);

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                //System.out.println(i + "," + j);
                m2.setElem(i, j, Integer.parseInt(JOptionPane.showInputDialog("Enter value")));
            }
        }
    }

    public int getMyRows(){
        return this.myRows;
    }

    public int getMyColumns(){
        return this.myColumns;
    }

    public void outPutToConsole(){
        String output = "";
        for (int i = 0; i < this.getMyRows(); i++) {
            // outputString = outputString + " - ";
            for (int j = 0; j < this.getMyColumns(); j++) {
                output = output + "," + this.getElem(i,j);
            }
            System.out.println(output);
            output  = "";
        }
    }

    @Override
    public String toString() {

        String outputString  ="";
        for (int i = 0; i < this.myRows; i++) {
            for (int j = 0; j < this.myColumns; j++) {
                System.out.println(this.myNumbers[i][j]);
            }
        }
        return outputString;
    }
}
