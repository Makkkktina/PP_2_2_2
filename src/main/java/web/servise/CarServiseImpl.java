package web.servise;

import web.config.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService {
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(new Car("Model " + (i + 1), "Color " + (i + 1), 2023 + i));
        }
        return cars;
    }
}