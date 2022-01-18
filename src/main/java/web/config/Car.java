package web.config;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();


        cars.add(new Car("Toyota Camry", "Silver", 2020));
        cars.add(new Car("Honda Civic", "Blue", 2021));
        cars.add(new Car("Ford Mustang", "Red", 2022));
        cars.add(new Car("BMW X5", "Black", 2023));
        cars.add(new Car("Tesla Model 3", "White", 2024));


        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Color: " + car.getColor());
            System.out.println("Year: " + car.getYear());
            System.out.println("--------------------");
        }
    }
}