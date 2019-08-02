package com.cts.basic.model;

public class Car {

	private Engine e;
	private int year;
	private String brand;
	
	Car(){}
	Car(Engine e){
		this.e = e;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Car [e=" + e + ", year=" + year + ", brand=" + brand + "]";
	}
	
	
	
	
}
