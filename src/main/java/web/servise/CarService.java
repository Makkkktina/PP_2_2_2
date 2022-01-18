package web.servise;

import org.springframework.stereotype.Service;
import web.config.Car;

import java.util.List;
@Service
public interface CarService {
    List<Car> getCars(int count);
}
