package com.demo.entity;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


public class User {

	@NotEmpty(message="Userid can not be blank")
	@Email
	private String userid;
	
	@Size(min=3, max=8)
	private String pwd;
	
	
	private String phone;
	
//	@Valid
//	private Address address;
	
	@Min(18)
	@Max(50)
	private int age;
	
//	@Past(message="It is not valid date")
//	@NotNull(message="Can not leave it blank 1")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Past
	private Date dob;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String password) {
		this.pwd = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", pwd=" + pwd + ", phone="
				+ phone + ", age=" + age + ", dob="
				+ dob + "]";
	}
	
	
}
