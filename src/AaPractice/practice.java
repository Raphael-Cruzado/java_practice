package AaPractice;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;


public class practice {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String fileName = getFileName();
        sumFileContents(fileName);

        // int sum = sumFileContents(fileName);

        // System.out.println("The sum is: " + sum);
    }

    public static String getFileName() {
        System.out.print("Enter file name: ");
        return input.nextLine();
    }

    public static void sumFileContents (String fileName) throws IOException{
        FileInputStream localFile = new FileInputStream(fileName);
        Scanner myFileReader = new Scanner(localFile);

        while (myFileReader.hasNextLine()) {
            String line = myFileReader.nextLine();
            System.out.println(line);
        }
    }


}
