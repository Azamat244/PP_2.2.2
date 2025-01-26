package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Green", 1000));
        cars.add(new Car("BMW", "Blue", 2000));
        cars.add(new Car("Audi", "Red", 3000));
        cars.add(new Car("Mercedes", "Yellow", 4000));
        cars.add(new Car("Ford", "Green", 5000));
    }

    public List<Car> getAnyCars(Integer count) {
        List <Car> newCar;
        newCar = cars.stream().limit(count).toList();
        return newCar;
    }

}
