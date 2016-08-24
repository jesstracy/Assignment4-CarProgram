package com.tiy.practice;

public class MiniVan extends Car {

	/*public void accelerate() {
		if (this.carStatus.equals("not started")) {
			System.out.println("You can't accelerate because the car has not been started!");
		} else if ((this.currentSpeed + 3) > 85) {
			System.out.println("You cannot accelerate past 85mph!");
			this.currentSpeed = 85;
			System.out.println("Current speed: " + this.currentSpeed + "mph");
		} else {
			this.currentSpeed += 3;
			System.out.println("Current speed: " + this.currentSpeed + "mph");
		}
	}*/
	public void accelerate() throws Exception {
		if (this.carStatus.equals("not started")) {
			throw new Exception("You must start the car before you can accelerate!");
		}
		if ((this.currentSpeed + 3) > 85) {
			this.currentSpeed = 85;
			System.out.println("Current speed: " + this.currentSpeed + " mph");
			throw new Exception("You cannot exceed 85 mph!");
		}
		this.currentSpeed += 3;
		System.out.println("Current speed: " + this.currentSpeed + " mph");
	}	
}