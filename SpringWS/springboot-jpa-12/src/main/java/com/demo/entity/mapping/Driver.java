package com.demo.entity.mapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
//	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@OneToOne(cascade= CascadeType.ALL)
	private License license;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Collection<Car> cars = new ArrayList<Car>();

	public Driver() {
		super();
	}

	public Driver(String name) {
		super();
		this.name = name;
	}

	public Driver(String name, License license) {
		super();
		this.name = name;
		this.license = license;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public Collection<Car> getCars() {
		return cars;
	}

	public void setCars(Collection<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", license=" + license + ", cars=" + cars + "]";
	}


}
