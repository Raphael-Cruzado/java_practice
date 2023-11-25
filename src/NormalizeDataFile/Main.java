package NormalizeDataFile;

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        String dataPath = "C:\\Users\\rapha\\IdeaProjects\\java_practice\\src\\NormalizeDataFile\\";

        Scanner input = new Scanner(System.in);
        ArrayList<Double> myData = null;

        // Collect data file name from user
        System.out.print("Enter data file name: ");
        String dataFileName = input.nextLine();

        // get the data from the file
        myData = loadData(dataPath + dataFileName);
        // normalize the data
        normalize(myData);
        // output the normalized data to the required file
        saveData(myData);


    }


    // Part 01 - Compute Average
    public static double getAverage(ArrayList<Double> values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    // Part 02 - Find Min
    public static double getMin(ArrayList<Double> values) {
        double min = Double.POSITIVE_INFINITY;
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Part 03 - Find Max
    public static double getMax(ArrayList<Double> values) {
        double max = Double.NEGATIVE_INFINITY;
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // Part 04 - Center Data
    public static void center(ArrayList<Double> values) {
        double average = getAverage(values);
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) - average);
        }
    }

    // Part 05 - Scale Data
    public static void scale(ArrayList<Double> values, double newRange) {
        double currentRange = getMax(values) - getMin(values);
        double scaleFactor = newRange / currentRange;
        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) * scaleFactor);
        }
    }

    // Part 06 - Normalize Data
    public static void normalize(ArrayList<Double> values) {
        center(values);
        scale(values, 100.0);
    }

    // Part 07 - Load Data
    public static ArrayList<Double> loadData(String fileName) throws IOException {
        ArrayList<Double> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(Double.parseDouble(line));
            }
        }
        return data;
    }

    // Part 08 - Save Data
    public static void saveData(ArrayList<Double> values) throws IOException {
        try (PrintWriter writer = new PrintWriter("normal.dat")) {
            for (double value : values) {
                writer.printf("%.2f%n", value);
            }
        }
    }

}

