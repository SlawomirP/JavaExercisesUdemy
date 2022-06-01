import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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


            while ((readLine = bufferedReader.readLine()) != null) {
                System.out.println(index + ". " +readLine);
                index++;

//                marksNumber += readLine.length();
//                System.out.println("----Actual marks number is " + marksNumber);

//                if (readLine.contains(yourText)){
//                    System.out.println(readLine);
//                }
            }
        } catch (IOException e) {
            System.out.println("File error !!");
        }
    }
}
