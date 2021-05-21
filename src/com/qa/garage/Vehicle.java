package com.qa.garage;

public abstract class Vehicle extends Garage {

	// Attributes
	
	private String brand;
	private int numTires;
	private String color;

	// Constructors
	
	public Vehicle() {
		super();
		this.brand = "???";
		this.numTires = 2;
		this.color = "???";
	}
	
	public Vehicle(String brand, int numTires, String color) {
		super();
		this.brand = brand;
		this.numTires = numTires;
		this.color = color;
	}

	// Getters
	
	public String getBrand() {
		return brand;
	}
	
	public int getNumTires() {
		return numTires;
	}
	
	public String getColor() {
		return color;
	}

}
