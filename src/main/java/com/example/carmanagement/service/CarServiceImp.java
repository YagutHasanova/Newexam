package com.example.carmanagement.service;

import com.example.carmanagement.entity.Car;
import com.example.carmanagement.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService{

    private final CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);

    }

    @Override
    public Car updateCar(Integer id, Car car) {
        return null;
    }

    @Override
    public void deleteCarByID(Integer id) {

    }
}
