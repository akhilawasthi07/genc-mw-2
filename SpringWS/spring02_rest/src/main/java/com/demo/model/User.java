package com.demo.model;

public class User {
	private int id;
	private int age;
	private String user_login;
	private String user_pass;
	
	public User() {}
	public User(int age, String user_login, String user_pass) {
		this.age = age;
		this.user_login = user_login;
		this.user_pass = user_pass;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUser_login() {
		return user_login;
	}
	public void setUser_login(String user_login) {
		this.user_login = user_login;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", user_login=" + user_login + ", user_pass=" + user_pass + "]";
	}
	
	
	
}
