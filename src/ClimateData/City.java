package ClimateData;
// Implement your City class in this file
public class City {
    private String name;
    private String state;
    private double highTemp;
    private double lowTemp;

    // Overloaded constructor
    public City(String name, String state, double highTemp, double lowTemp) {
        this.name = name;
        this.state = state;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public double getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(double highTemp) {
        this.highTemp = highTemp;
    }

    public double getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(double lowTemp) {
        this.lowTemp = lowTemp;
    }

    // Print method
    public void printInfo() {
        System.out.printf("%s, %s (High = %.2f, Low = %.2f)\n", name, state, highTemp, lowTemp);
    }
}
