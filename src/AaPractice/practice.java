package AaPractice;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class practice {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String parentPath = "C:\\Users\\rapha\\IdeaProjects\\java_practice\\src\\AaPractice\\";
        String fileName = parentPath + getFileName();

        int sum = sumFileContents(fileName);

        System.out.println("The sum is: " + sum);
    }

    public static String getFileName() {
        System.out.print("Enter file name: ");
        return input.nextLine();
    }

    public static int sumFileContents(String fileName) throws IOException {
        int sum = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    sum += fileScanner.nextInt();
                } else {
                    // If the next token is not an integer, skip it
                    fileScanner.next();
                }
            }
        }

        return sum;
    }
}
