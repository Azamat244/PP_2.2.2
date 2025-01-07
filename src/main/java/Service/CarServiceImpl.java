package Service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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

    public List<Car> getCars() {
        return cars;
    }


    public List<Car> getAnyCars(List<Car> cars, Integer count) {
        List<Car> newCars = new ArrayList<>();
        if ((count >= cars.size()) || (count <= 0)) {
            return cars;
        }
        for (int i = 0; i < count; i++) {
            newCars.add(cars.get(i));
        }
        return newCars;
    }

}
