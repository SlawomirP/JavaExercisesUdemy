package javaUdemy;

public class Loops {
    public static void main(String[] args){

        // Numbers 0-->30, 30-->0
        int amountNumbers = 30;

        for(int i = 0; i <= amountNumbers; i++){
           System.out.print(i + " ");
        }
        System.out.println();
        for (int i = amountNumbers; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
