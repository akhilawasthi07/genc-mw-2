package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.mapping.Driver;

public interface DriverRepository extends CrudRepository<Driver, Integer>{

}
