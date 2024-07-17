package org.example.exercice5_api;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CarService {
    public CarService() {
    }

    private List<Car> carList = new ArrayList<>();

    public Car save(int id, String brand, int year, String color) {
        Car car1 = new Car(1, "Citroen", 2013, "grise");
        carList.add(car1);

        Car car = new Car(id, brand, year, color);
        carList.add(car);
        return car;
    }

    public Car findById(int id) {
        Car car = carList.get(id);
        return car;
    }

    public List<Car> findAll() {
        return carList;
    }

    public void deleteById(int id) {
        carList.remove(id);
    }
}
