package com.example.carmanagement.controller;

import com.example.carmanagement.entity.Car;
import com.example.carmanagement.service.CarService;
import com.example.carmanagement.service.CarServiceImp;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
@RequiredArgsConstructor
public class CarController {
    private final CarServiceImp carService;

    @GetMapping
    public List<Car> getAllaCars() {
        return carService.getAllCars();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car createCar(@RequestBody Car car){
        return carService.createCar(car);
    }

    @PutMapping
    public Car updateCar(@PathVariable Integer id, @RequestBody Car car){
        return carService.updateCar(id, car);
    }

}
