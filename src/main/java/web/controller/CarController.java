package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Car;
import web.servise.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(Model model, @RequestParam(required = false, defaultValue = "5") Integer count) {
        List<Car> cars;
        if (count >= 5) {
            cars = carService.getCars(5);
        } else {
            cars = carService.getCars(count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}