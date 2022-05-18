package pl.javaUdemyCwik;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args){
// how many numbers are to be add
// ask about those numbers
//  add them

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to sum ?");

        int quantity = scanner.nextInt();
        int sumResult = 0;
        int [] numbersArray = new int[quantity];

        for(int i = 0; i < numbersArray.length; i++){
            System.out.println("Write your number:");
            int receivedNumber = scanner.nextInt();
            numbersArray[i] = receivedNumber;
            sumResult += numbersArray[i];
        }
        System.out.println("Summation result is " + sumResult);
    }
}
