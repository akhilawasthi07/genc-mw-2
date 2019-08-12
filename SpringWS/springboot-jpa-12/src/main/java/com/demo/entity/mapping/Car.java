package com.demo.entity.mapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String brand;
	
	@ManyToMany(mappedBy="cars")//(cascade=CascadeType.ALL)//(mappedBy="cars")
	private Collection<Driver> drivers = new ArrayList<Driver>();

	public Car() {
		super();
	}
	
	
	public Car(String brand) {
		super();
		this.brand = brand;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Collection<Driver> getDrivers() {
		return drivers;
	}


	public void setDrivers(Collection<Driver> drivers) {
		this.drivers = drivers;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", drivers=" + drivers + "]";
	}


	
}
