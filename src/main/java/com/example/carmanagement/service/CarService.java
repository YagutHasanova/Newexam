package com.example.carmanagement.service;


import com.example.carmanagement.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    Car createCar(Car car);
    Car updateCar(Integer id, Car car);

    void deleteCarByID(Integer id);


}
