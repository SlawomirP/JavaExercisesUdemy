package javaUdemy;

import java.util.Random;

public class BonusExercises {
    public static void main(String[] args){

        //Zad1 tablice 5 elementowa uzupelnić dowolnie i zsumować

        int arraySize = 5;
        Random r = new Random();
        int addResult = 0;

        int [] intArray = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            System.out.print("Current value of addition: " + addResult + " ");
            intArray[i] = r.nextInt(101) + 1;
            System.out.println("Array index: " + i + ", value:  " + intArray[i]);
            addResult += intArray[i];
        }
        System.out.println("----------------------------");

        // Zad 2 stworzyc tablice dwuwymiarowa 3x5 double, zsumować wiersze i wypisać

        int rows = 3;
        int columns = 5;
        double addResultDouble = 0;

        double[][] doubleArray = new double [rows][columns];

        for(int i = 0; i < rows; i++){
            System.out.print("row " + i + " --> ");
            for(int j = 0; j < columns; j++){
                doubleArray[i][j] = r.nextDouble();
                addResultDouble += doubleArray[i][j];
                System.out.print(" " + doubleArray[i][j]);
            }
            System.out.println(" --> addiction result is: " + addResultDouble);
            System.out.println();
        }
    }
}
