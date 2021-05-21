package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	// Stores all vehicles in a list
	List<Vehicle> lot = new ArrayList<>();

	// Method that iterates through the vehicle list and calculates a bill for each
	// type of vehicle
	public double getBill() {
		double bill = 0;

		for (Vehicle v : lot) {
			if (v instanceof Car)
				bill += 1000;
			else if (v instanceof Motorcycle)
				bill += 500;
			else
				bill += 200;
		}

		return bill;
	}
	
	//adds new vehicle to lot
	public void addVehicle(Vehicle v) {
		lot.add(v);
	}
	
	
	//removes vehicle from lot
	public void removeVehicle(Vehicle v) {
		lot.remove(v);
	}
	
	
	//clears out the lot
	public void emptyGarage() {
		lot.removeAll(lot);
	}
	
	//trying to remove vehicles by type using build in iterator....

}
