package AaPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter ;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;


class practice {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String parentPath = "C:\\Users\\rapha\\IdeaProjects\\java_practice\\src\\StatisticsReport\\";

        String inputFileName = parentPath + getFileName("Enter input filename : ");
        // String outputFileName = parentPath + getFileName("Enter input filename : ");

        // reportStatistics(inputFileName, outputFileName);

        printFile(inputFileName);
        // print out the contents of the output file to
        // verify that the output file is correct
        // System.out.println("\n" + outputFileName + " contents :");
        // printFile(outputFileName);
    }

    // make no changes to this method
    public static String getFileName(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }


    public static void reportStatistics(String inputFile, String outputFile) throws IOException {
        Scanner fileReader = new Scanner(new File(inputFile));

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

    }
    /* 1) Write a public static method named reportStatistics.
          Be sure to add the 'throws IOException' clause to the method header
          This method should take two String arguments (an input file name and an output file name).
          This method should have a return type of void.
          This method should read in all of the integers from the input file.
          This method should compute the sum (int), average (float), min (int) and max (int) values.
          from the data in the input file.
          This method should output these statistics to the output file.
          The output should look like this (average should have two digits to the right of the decimal point):
             Sum is     : 45
             Average is : 5.00
             Min is     : 1
             Max is     : 9
    */


    // make no changes to this method
    public static void printFile(String fileName) throws IOException {
        Scanner myFileReader = new Scanner(new FileInputStream(fileName));
        while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }
}
