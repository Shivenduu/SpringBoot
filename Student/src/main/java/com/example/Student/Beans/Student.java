package com.example.Student.Beans;

public class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public Student(int id, String name, String mob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.address = address;
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
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String mob;
	private String address;
	

}
