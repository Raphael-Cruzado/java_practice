package AaPractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Main {
    public static void main(String [] args) {
        Airplane airbus330 = new Airplane();

        airbus330.addPassengers(3);
        airbus330.addPassengers(2);

        System.out.println(airbus330.getAvailableSeats() + " seats");


    }
}
