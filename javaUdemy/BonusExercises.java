package javaUdemy;

import java.util.Random;

public class BonusExercises {
    public static void main(String[] args){
        //Zad1
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
    }
}
