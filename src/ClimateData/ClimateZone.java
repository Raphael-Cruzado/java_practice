package ClimateData;
// Implement your ClimateZone class in this file
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClimateZone {
    private ArrayList<City> cityList;

    // Default constructor
    public ClimateZone() {
        this.cityList = new ArrayList<>();
    }

    // Overloaded constructor
    public ClimateZone(String rosterFileName) throws IOException {
        this.cityList = new ArrayList<>();
        Scanner scanner = new Scanner(new File(rosterFileName));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            String cityName = words[0];
            String state = words[1];
            double highTemp = Double.parseDouble(words[2]);
            double lowTemp = Double.parseDouble(words[3]);

            addCity(cityName, state, highTemp, lowTemp);
        }
        scanner.close();
    }

    // Public method to add a city
    public void addCity(String name, String state, double highTemp, double lowTemp) {
        City newCity = new City(name, state, highTemp, lowTemp);
        cityList.add(newCity);
    }

    // Public method to get the city count
    public int getCityCount() {
        return cityList.size();
    }

    // Public method to get a city by name and state
    public City getCityByName(String name, String state) {
        for (City city : cityList) {
            if (city.getName().equalsIgnoreCase(name) && city.getState().equalsIgnoreCase(state)) {
                return city;
            }
        }
        return null;
    }

    // Public method to print the hottest cities
    public void printHottestCities() {
        Collections.sort(cityList, (c1, c2) -> Double.compare(c2.getHighTemp(), c1.getHighTemp()));
        printTopCities(2);
    }

    // Public method to print the coldest cities
    public void printColdestCities() {
        Collections.sort(cityList, (c1, c2) -> Double.compare(c1.getLowTemp(), c2.getLowTemp()));
        printTopCities(2);
    }

    // Public method to print all cities
    public void printAllCities() {
        for (City city : cityList) {
            city.printInfo();
        }
    }

    // Private method to print the top N cities
    private void printTopCities(int n) {
        for (int i = 0; i < Math.min(n, cityList.size()); i++) {
            cityList.get(i).printInfo();
        }
    }
}
