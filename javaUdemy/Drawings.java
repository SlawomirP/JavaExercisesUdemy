package javaUdemy;

public class Drawings {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
        System.out.println("Task 1");
        int stars = 5;
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Task 2");
//                         *
//                        **
//                       ***
//                      ****
//                     *****
        for (int i = 1; i <= stars; i++) {
            for (int j = stars; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Task 3");
        
        for (int i = 1; i <= stars; i++) {
            for (int j = stars - 1; j >= i; j--) {
                System.out.print("|");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = stars - 1; j >= i; j--) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}