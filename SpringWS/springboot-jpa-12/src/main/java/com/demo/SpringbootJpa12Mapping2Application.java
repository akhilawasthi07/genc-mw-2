package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.mapping.Car;
import com.demo.entity.mapping.Driver;
import com.demo.entity.mapping.License;
import com.demo.repo.CarRepository;
import com.demo.repo.DriverRepository;
import com.demo.repo.LicenseRepository;

@SpringBootApplication
public class SpringbootJpa12Mapping2Application implements CommandLineRunner {

	@Autowired
	DriverRepository driverRepository;
	
	@Autowired
	LicenseRepository licenseRepository;

	@Autowired
	CarRepository carRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa12Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");

//		saveDriver();
		
		showDriverCarMapping();
		
	}

	private void showDriverCarMapping() {
		Car car = new Car();
		car.setBrand("Maruti");
		
		Driver driver = new Driver("Mark", new License(2008));
		List<Car> dCars = new ArrayList<Car>();
		dCars.add(new Car("BMW"));
		dCars.add(new Car("XYZ"));
		dCars.add(car);
		
		List<Driver> drivers = new ArrayList<Driver>();
		
		driver.setCars(dCars);
		
		drivers.add(driver);
		drivers.add(new Driver("Carl", new License(2010)));
		car.setDrivers(drivers);
		
		driverRepository.save(driver);
		carRepository.save(car);
	}

	private void saveDriver() {
		Driver driver = new Driver("Arun");
		License license = new License(2006);
		driver.setLicense(license);
		
//		licenseRepository.save(license);
		driverRepository.save(driver);
		
		driverRepository.deleteById(1);
	}


}
