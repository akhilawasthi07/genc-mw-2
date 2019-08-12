package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.mapping.Car;

public interface CarRepository extends CrudRepository<Car, Integer>{

}
