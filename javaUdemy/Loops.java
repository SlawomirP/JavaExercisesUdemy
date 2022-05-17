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
    }
}
