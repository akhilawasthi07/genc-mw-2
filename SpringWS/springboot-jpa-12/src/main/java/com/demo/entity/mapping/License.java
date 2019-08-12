package com.demo.entity.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class License {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int year;

	public License() {
		super();
	}

	public License(int year) {
		super();
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "License [id=" + id + ", year=" + year + "]";
	}

}
