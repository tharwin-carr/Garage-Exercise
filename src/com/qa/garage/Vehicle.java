package com.qa.garage;

public class Vehicle extends Garage {

	// Attributes
	
	private String brand;
	private int numTires;
	private String color;

	// Constructors
	
	
	// default vehicle if no attributes are given
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
	
	// Setters
	
	public void setBrand(String newBrand) {
		this.brand =  newBrand;
	}
	
	public void setNumTires(int newNumTires) {
		this.numTires = newNumTires;		
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}

}
