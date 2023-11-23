package CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


class CopyFile {
    public static void main(String[] args) throws IOException {
        String parentPath = "C:\\Users\\rapha\\IdeaProjects\\java_practice\\src\\AaPractice\\";
        makeCopy(parentPath + "original.dat", parentPath + "copy.dat");

        printFile(parentPath + "copy.dat");
    }

    public static void makeCopy(String inputFileName, String outputFileName) throws IOException {
        Scanner myFileReader = new Scanner(new FileInputStream(inputFileName));
        PrintWriter myFileWriter = new PrintWriter(new FileOutputStream(outputFileName));

        while (myFileReader.hasNextLine()) {
            String inputString = myFileReader.nextLine();
            myFileWriter.write(inputString + "\n");
        }

        myFileWriter.flush();
        myFileWriter.close();

        myFileReader.close();
    }

    // make no changes to this printFile method
    public static void printFile(String fileName) throws IOException {
        Scanner myFileReader = new Scanner(new FileInputStream(fileName));
        while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }
}
