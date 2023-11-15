package PrintSeats;

import java.util.Scanner;

public class PrintSeats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        char currentColumnLetter;

        numRows = input.nextInt();
        numColumns = input.nextInt();

        for (currentRow = 1; currentRow <= numRows; currentRow++) {
            // Iterate over columns (using letters)
            for (currentColumnLetter = 'A'; currentColumnLetter < 'A' + numColumns; currentColumnLetter++) {
                // Print the seat
                System.out.print(currentRow + "" + currentColumnLetter + " ");
            }
        }
        System.out.println();
    }
}
