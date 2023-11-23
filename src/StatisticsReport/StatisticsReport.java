package StatisticsReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


class StatisticsReport {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String parentPath = "C:\\Users\\rapha\\IdeaProjects\\java_practice\\src\\StatisticsReport\\";
        String inputFileName = parentPath + getFileName("Enter input filename : ");

        reportStatistics(inputFileName);
    }

    public static String getFileName(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }


    public static void reportStatistics(String fileName) throws IOException {
        Scanner fileReader = new Scanner(new File(fileName));

        int lineCount = 0;
        int sum = 0;
        float average = 0;
        int min = Integer.MAX_VALUE; // * initializes min with Max value *
        int max = Integer.MIN_VALUE; // * initializes min with Min value *


        while(fileReader.hasNext()) {
            lineCount++;
            int intData = Integer.parseInt(fileReader.nextLine());

            sum += intData;
            average = (float) sum / lineCount;

            min = Math.min(min, intData); // it's like this: <----- MAX and compares inData
            max = Math.max(max, intData); // it's like this: (-)MIN and compares intData ----->
        }

        System.out.println("Sum is     : " + sum);
        System.out.printf("Average is : %.2f%n", average);
        System.out.println("Min is     : " + min);
        System.out.println("Max is     : " + max);
    }

    public static void printFile(String fileName) throws IOException {
        Scanner myFileReader = new Scanner(new FileInputStream(fileName));
        while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }


}
