package javaUdemy;

public class Loops {
    public static void main(String[] args){

        // Numbers 0-->30, 30-->0
        int amountNumbers = 30;
        System.out.println("Task 1");

        for(int i = 0; i <= amountNumbers; i++){
           System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 2");
        for (int i = amountNumbers; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");

        // Only even from 0-30

        for(int i = 0; i <= amountNumbers; i++){
            if(i % 2 == 0)
            System.out.print(i + " ");
        }

        // 10 elements array
        System.out.println();
        System.out.println("Task 4");
        int arraySize = 10;

        int [] arrayTen= new int [arraySize];
        for(int i = 0; i < arrayTen.length; i++){
            arrayTen[i] = i + 1;
            System.out.print(arrayTen[i] + " ");
        }
        System.out.println();
        for(int i = arrayTen.length - 1; i >= 0; i--){
            System.out.print(arrayTen[i] + " ");
        }

        // add array elements
        System.out.println();
        System.out.println("Task 5");
        int addResult = 0;

        for(int i = 0; i < arrayTen.length; i++){
            addResult += arrayTen[i];
        }
        System.out.println("Addition result is " + addResult);
    }
}
