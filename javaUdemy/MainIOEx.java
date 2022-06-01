import java.io.*;
import java.util.Scanner;

public class MainIOEx {
    public static void main(String[] args){
        String readLine;
        int marksNumber = 0;


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write your text ...");
//        String yourText = scanner.nextLine();
        int index = 1;

        try {
            FileReader fileReader = new FileReader("/home/slawp/Pulpit/JavaEx/fragment.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("Copy.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            while ((readLine = bufferedReader.readLine()) != null) {
                System.out.println(readLine);

                bufferedWriter.write(readLine + "\n");


//                marksNumber += readLine.length();
//                System.out.println("----Actual marks number is " + marksNumber);

//                if (readLine.contains(yourText)){
//                    System.out.println(readLine);
//                }

            }

            bufferedReader.close();
            bufferedWriter.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("File error !!");
        }
    }
}
