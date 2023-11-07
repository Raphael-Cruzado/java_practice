// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HighwayInfo {
    public static void main(String[] args) {
        printHighwayInfo(90);
        printHighwayInfo(290);
        printHighwayInfo(185);
    }

    public static void printHighwayInfo(int highway) {
        // conditions: 1) primary or auxiliary? 2) which freeway is it serving? 3) even or odd?
        // math: 1) primary: 1-99 | auxiliary: 100-999
        //       2) the freeway it services is what the last two digits are
        //       3) even: east/west | odd: north/south

        String numberAsString = Integer.toString(highway);
        int digitCount = numberAsString.length();

        // variables used
        String highWayType;
        String service;
        String direction;

        // calculations
        highWayType = (highway >= 1 && highway <= 99) ? "primary" : "auxiliary";

        direction = (highway % 2 == 0) ? "east/west" : "north/south";

        if (digitCount >= 3) {
            service = "";
        } else {
            service = String.format("%s", numberAsString.length());
        }

        if (digitCount < 3) {
            System.out.printf("The %d is %s, going %s.%n", highway, highWayType, direction);
        } else if (digitCount == 3){
            System.out.printf("The %d is %s, serving the %s, going %s %n", highway, highWayType, service, direction);
        }
    }
}