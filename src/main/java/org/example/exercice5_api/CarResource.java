package org.example.exercice5_api;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cars")
public class CarResource {
    private CarService carService;

    @Inject
    public CarResource(CarService carService) {
        this.carService = carService;
    }

    // CREATION D'UNE VOITURE
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Car addCar(int id, String brand, int year, String color) {
        carService.save(id, brand, year, color);
        return carService.findById(id);
    }

    // RECUPERATION D'UNE VOITURE PAR SON ID
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Car getCar(@PathParam("id") int id) {
        Car car = carService.findById(id);
        return car;
    }

    // RECUPERATION DE TOUTES LES VOITURES
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getAllCars() {
        List<Car> cars = carService.findAll();
        if(cars != null && cars.size() > 0) {
            return null;
        }
        return cars;
    }
}
