package org.sourav;


public class Car {
    private Engine engine;
    private int seats;
    private int distance;


    public Car() {
    }

    public Car(Engine engine, int seats, int distance) {
        this.engine = engine;
        this.seats = seats;
        this.distance = distance;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public int getDistance() {
        return distance;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", seats=" + seats +
                ", distance=" + distance + "Kms" +
                '}';
    }
}
