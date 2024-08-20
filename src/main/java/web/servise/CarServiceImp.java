package web.servise;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars;

    public CarServiceImp() {
        this.cars = new ArrayList<>(List.of(
                new Car("BMW", 2025, "Ilyas"),
                new Car("Mercedes-Maybach S 650 Cabriolet", 2013, "Makka"),
                new Car("priora в синем цвете с мотором на 3 литра", 2017, "Ali"),
                new Car("Toyota Tundra", 2025, "Salavat"),
                new Car("supra", 2018, "Hz")
        ));
    }

    @Override
    public List<Car> getCars(int countCars) {
        int displayedCars = Math.min(countCars, cars.size());
        return cars.subList(0, displayedCars);
    }
}