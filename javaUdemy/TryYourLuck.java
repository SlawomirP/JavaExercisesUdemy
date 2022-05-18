package pl.javaUdemyCwik;

import java.util.Random;
import java.util.Scanner;

public class TryYourLuck {
    public static void main(String[] args){
//        program radomise the number (0-100), user try to guess, 5 attempts

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int drawnNumber = r.nextInt(101);
        int attempts = 5;

        for(int i = 1; i <= attempts; i++){
            System.out.println("Please, write your number now ...");
            int userNumber = scanner.nextInt();
            if (userNumber == drawnNumber){
                System.out.println("Great, you guessed !!!");
                break;
            } else if ( userNumber < drawnNumber) {
                System.out.println("Ups... your number is too small");
            } else {
                System.out.println("Ups... your number is too high");
            }
        }
        System.out.println("------------END-------------");
    }
}
