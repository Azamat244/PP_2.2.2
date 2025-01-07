package Service;

import model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars();

    public List<Car> getAnyCars(List<Car> cars, Integer count);
}
