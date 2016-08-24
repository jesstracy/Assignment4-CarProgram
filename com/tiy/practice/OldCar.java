package com.tiy.practice;

public class OldCar extends Car {

	public OldCar() {
		super();
	}
	
	int tryToStartCount = 0;

	/*public void startCar() {
		if (this.carStatus.equals("started")) {
			System.out.println("You cannot start a car that has already been started!");
		} else if (this.tryToStartCount == 2) {
			this.carStatus = "started";
			System.out.println("Your car has been started!");
			this.tryToStartCount = 0;
		} else {
			this.tryToStartCount++;
			System.out.println("Your car did not start. Please try again later.");
		}
	}*/

	public void startCar() throws Exception {
		if (this.carStatus.equals("started")) {
			throw new Exception("Your car has already been started!");
		} else if (this.tryToStartCount < 2) {
			this.tryToStartCount++;
			throw new Exception("Your car did not start. Try again later.");
		} else {
			this.carStatus = "started";
			this.tryToStartCount = 0;
		}
	} 
}