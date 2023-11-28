package AaPractice;

public class Airplane {
    private int totalSeats;
    private int passengers;

    public Airplane() {
        this.totalSeats = 300;
        this.passengers = 0;
    }

    public void addPassengers(int passengers) {
        this.passengers = this.passengers + passengers;
    }

    public int getAvailableSeats() {
        return this.totalSeats - this.passengers;
    }
}


