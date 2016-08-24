/*package com.tiy.practice;

import java.util.Scanner;

public class Day4RunnerLab2 {
	public static void main(String[] args) throws Exception {
		Day4RunnerLab2 programRunner = new Day4RunnerLab2();
		programRunner.runCarProgramExtension2();
	}

/*
	public void runCarProgram() {
		System.out.println("Welcome to the car program!");

		Scanner myScanner = new Scanner(System.in);

		System.out.print("How many cars do you have? ");
		int numOfCars = myScanner.nextInt();
		myScanner.nextLine();

		System.out.println("Your number of cars: " + numOfCars);

		//Array of car objects
		Car[] myCars = new Car[numOfCars];
		//Make a new car object in the array for each car the user has
 		for (int counter = 0; counter < numOfCars; counter++) {
			myCars[counter] = new Car();
			System.out.println("What is the make of car " + (counter + 1) + "?");
			myCars[counter].make = myScanner.nextLine();
			System.out.println("What is the model of car " + (counter + 1) + "?");
			myCars[counter].model = myScanner.nextLine();
			System.out.println("What is the color of car " + (counter + 1) + "?");
			myCars[counter].color = myScanner.nextLine();
		}

		System.out.println();
		System.out.println("Here are your cars...");

		for (int dispCounter = 0; dispCounter < myCars.length; dispCounter++) {
			System.out.println("Car " + (dispCounter + 1) + ": ");
			System.out.println("\tMake: " + myCars[dispCounter].make);
			System.out.println("\tModel: " + myCars[dispCounter].model);
			System.out.println("\tColor: " + myCars[dispCounter].color);
		}

		Boolean keepPlaying1 = true;

		//************* First loop ****************************************
		while (keepPlaying1) {
			Boolean keepPlaying2 = true;
			System.out.println();
			System.out.println("Which car would you like to use? ");
			int carChoice = myScanner.nextInt();
			System.out.println("You chose car " + carChoice + ".");

			//************* Second loop ***************************************
			while (keepPlaying2) {
				System.out.println("What would you like to do?");
				System.out.println(" (1) Start the car");
				System.out.println(" (2) Stop the car");
				System.out.println(" (3) Accelerate");
				System.out.println(" (4) Brake");
				System.out.println(" (5) Print Info");
				System.out.println(" (6) Use another car");
				System.out.println(" (7) End program");

				System.out.println();
				int userChoice = myScanner.nextInt();

				// Do the command the user asked, and check conditions.
				if (userChoice == 1) {
					if (myCars[carChoice - 1].carStatus == "not started") {
						myCars[carChoice - 1].startCar();
						System.out.println("Status: " + myCars[carChoice - 1].carStatus);
					} else {
						System.out.println("You can't start a car that has already been started!");
					}
				} 
				else if (userChoice == 2) {
					if (myCars[carChoice - 1].carStatus == "started") {
						myCars[carChoice - 1].stopCar();
						System.out.println("Status: " + myCars[carChoice - 1].carStatus);
						myCars[carChoice - 1].currentSpeed = 0;
					} else {
						System.out.println("You can't stop a car that is already stopped!");
					}
				} 
				else if (userChoice == 3) {
					if (myCars[carChoice - 1].carStatus == "started" && myCars[carChoice - 1].currentSpeed <= 82) {
						myCars[carChoice - 1].accelerate();
						System.out.println("The car's speed is now " + myCars[carChoice - 1].currentSpeed + " mph.");
					} else if (!(myCars[carChoice - 1].currentSpeed <= 82)) {
						System.out.println("The car cannot accelerate past 85 mph!");
					} else {
						System.out.println("The car cannot accelerate because it has not been started!");
					}
				} 
				else if (userChoice == 4) {
					if (myCars[carChoice - 1].currentSpeed > 0) {
						myCars[carChoice - 1].brake();
						System.out.println("The car's speed is now " + myCars[carChoice - 1].currentSpeed + " mph.");
					} else {
						System.out.println("The car can't break because it is not moving.");
					}
				} 
				else if (userChoice == 5) {
					myCars[carChoice - 1].printInfo();
				} 
				else if (userChoice == 6) {
					keepPlaying2 = false;
				}
				else if (userChoice == 7) {
					keepPlaying1 = false;
					keepPlaying2 = false;
				}
				else {
					System.out.println("Not valid...");
				}
			}
		//*************** End second loop **********************************************
		}
		//*************** End first loop ***********************************************
	}
*/

/*
	public void runCarProgramExtension2() throws Exception {
		System.out.println("Welcome to the car program!");

		Scanner myScanner = new Scanner(System.in);

		System.out.print("How many cars do you have? ");
		int numOfCars = myScanner.nextInt();
		myScanner.nextLine();

		System.out.println("Your number of cars: " + numOfCars);

		//Array of car objects
		Car[] myCars = new Car[numOfCars];
		//Make a new car object in the array for each car the user has
 		for (int counter = 0; counter < numOfCars; counter++) {
 			System.out.println("What type of car is car " + (counter + 1) + "? (1) Regular car, (2) Minivan, (3) Old car, (4) Sports car");
			int typeInput = myScanner.nextInt();
			myScanner.nextLine();
			if (typeInput == 1) {
				myCars[counter] = new Car();
				myCars[counter].type = 1;
				myCars[counter].typeString = "Car";
			} else if (typeInput == 2) {
				myCars[counter] = new MiniVan();
				myCars[counter].type = 2;
				myCars[counter].typeString = "Minivan";
			} else if (typeInput == 3) {
				myCars[counter] = new OldCar();
				myCars[counter].type = 3;
				myCars[counter].typeString = "Old car";
			} else if (typeInput == 4) {
				myCars[counter] = new SportsCar();
				myCars[counter].type = 4;
				myCars[counter].typeString = "Sports car";
			}
			System.out.println("What is the make of car " + (counter + 1) + "?");
			myCars[counter].make = myScanner.nextLine();
			System.out.println("What is the model of car " + (counter + 1) + "?");
			myCars[counter].model = myScanner.nextLine();
			System.out.println("What is the color of car " + (counter + 1) + "?");
			myCars[counter].color = myScanner.nextLine();
		}

		System.out.println();
		System.out.println("Here are your cars...");

		for (int dispCounter = 0; dispCounter < myCars.length; dispCounter++) {
			System.out.println("Car " + (dispCounter + 1) + ": ");
			System.out.println("\tType: " + myCars[dispCounter].typeString);
			System.out.println("\tMake: " + myCars[dispCounter].make);
			System.out.println("\tModel: " + myCars[dispCounter].model);
			System.out.println("\tColor: " + myCars[dispCounter].color);
		}

		Boolean keepPlaying1 = true;

		while (true) {
			System.out.println();
			System.out.println("Which car would you like to use? ");
			int carChoice = myScanner.nextInt();
			System.out.println("You chose car " + carChoice + ".");

			chooseCarOptionVersion2(myCars, carChoice);
		}
	}

	
	/*public void chooseCarOption(Car[] myCars, int carChoice) throws Exception { 
		while (true) {
				System.out.println("What would you like to do?");
				System.out.println(" (1) Start the car");
				System.out.println(" (2) Stop the car");
				System.out.println(" (3) Accelerate");
				System.out.println(" (4) Brake");
				System.out.println(" (5) Print Info");
				System.out.println(" (6) Use another car");
				System.out.println(" (7) End program");

				System.out.println();
				Scanner myScanner = new Scanner(System.in);
				int userChoice = myScanner.nextInt();

				// Do the command the user asked, and check conditions.
				if (userChoice == 1) {
					if (myCars[carChoice - 1].carStatus.equals("not started")) {
						myCars[carChoice - 1].startCar();
						System.out.println("Status: " + myCars[carChoice - 1].carStatus);

					} else {
						System.out.println("You can't start a car that has already been started!");
					}
				} 
				else if (userChoice == 2) {
					if (myCars[carChoice - 1].carStatus.equals("started")) {
						myCars[carChoice - 1].stopCar();
						System.out.println("Status: " + myCars[carChoice - 1].carStatus);
						myCars[carChoice - 1].currentSpeed = 0;
					} else {
						System.out.println("You can't stop a car that is already stopped!");
					}
				} 
				else if (userChoice == 3) {
					if (!(myCars[carChoice - 1].type == 2) && !(myCars[carChoice - 1].type == 4)) {	
						if ((myCars[carChoice - 1].carStatus.equals("started")) && ((myCars[carChoice - 1].currentSpeed + 5) <= 85)) {
							myCars[carChoice - 1].accelerate();
							System.out.println("The car's speed is now " + myCars[carChoice - 1].currentSpeed + " mph.");
						} else if (!((myCars[carChoice - 1].currentSpeed + 5) <= 85)) {
							System.out.println("The car cannot accelerate past 85 mph!");
							myCars[carChoice - 1].currentSpeed = 85;
						} else {
							System.out.println("The car cannot accelerate because it has not been started!");
						}
					} else if (myCars[carChoice - 1].type == 2) {
						if ((myCars[carChoice - 1].carStatus.equals("started")) && ((myCars[carChoice - 1].currentSpeed + 3) <= 85)) {
							myCars[carChoice - 1].accelerate();
							System.out.println("The car's speed is now " + myCars[carChoice - 1].currentSpeed + " mph.");
						} else if (!((myCars[carChoice - 1].currentSpeed + 3) <= 85)) {
							System.out.println("The car cannot accelerate past 85 mph!");
							myCars[carChoice - 1].currentSpeed = 85;
						} else {
							System.out.println("The car cannot accelerate because it has not been started!");
						}
					} else if (myCars[carChoice - 1].type == 4) {
						if ((myCars[carChoice - 1].carStatus.equals("started")) && ((myCars[carChoice - 1].currentSpeed + 10) <= 85)) {
							myCars[carChoice - 1].accelerate();
							System.out.println("The car's speed is now " + myCars[carChoice - 1].currentSpeed + " mph.");
						} else if (!((myCars[carChoice - 1].currentSpeed + 10) <= 85)) {
							System.out.println("The car cannot accelerate past 85 mph!");
							myCars[carChoice - 1].currentSpeed = 85;
						} else {
							System.out.println("The car cannot accelerate because it has not been started!");
						}
					}
				} 
				else if (userChoice == 4) {
					if (myCars[carChoice - 1].currentSpeed > 0) {
						myCars[carChoice - 1].brake();
						System.out.println("The car's speed is now " + myCars[carChoice - 1].currentSpeed + " mph.");
					} else {
						System.out.println("The car can't break because it is not moving.");
					}
				} 
				else if (userChoice == 5) {
					myCars[carChoice - 1].printInfo(myCars[carChoice - 1].currentSpeed);
				} 
				else if (userChoice == 6) {
					for (int dispCounter = 0; dispCounter < myCars.length; dispCounter++) {
						System.out.println("Car " + (dispCounter + 1) + ": ");
						System.out.println("\tType: " + myCars[dispCounter].typeString);
						System.out.println("\tMake: " + myCars[dispCounter].make);
						System.out.println("\tModel: " + myCars[dispCounter].model);
						System.out.println("\tColor: " + myCars[dispCounter].color);
					}
					break;
				}
				else if (userChoice == 7) {
					break;
				}
				else {
					System.out.println("Not valid...");
				}
			} 
	} */
/*
	// This version will attempt to use exceptions instead of if statements.
	public void chooseCarOptionVersion2(Car[] myCars, int carChoice) throws Exception { 
		while (true) {
				System.out.println("What would you like to do?");
				System.out.println(" (1) Start the car");
				System.out.println(" (2) Stop the car");
				System.out.println(" (3) Accelerate");
				System.out.println(" (4) Brake");
				System.out.println(" (5) Print Info");
				System.out.println(" (6) Use another car");
				System.out.println(" (7) End program");

				System.out.println();
				Scanner myScanner = new Scanner(System.in);
				int userChoice = myScanner.nextInt();

				// Do the command the user asked, and check conditions.
				if (userChoice == 1) {
					try {
						myCars[carChoice - 1].startCar();
					} catch (Exception exception) {
						exception.getMessage();
					}
					// This works too!! Without exception in startCar() method.
					/*try {
						if (myCars[carChoice - 1].carStatus.equals("started")) {
							throw new Exception("You can't start a car that has already been started!");
						}
						myCars[carChoice - 1].startCar();
					} catch (Exception exception) {
						exception.getMessage();
					}*/
/*				} 
				else if (userChoice == 2) {
					try {
						myCars[carChoice - 1].stopCar();
						myCars[carChoice - 1].currentSpeed = 0;
					}
					catch (Exception exception) {
						exception.getMessage();
					}
				} 
				else if (userChoice == 3) {
					try {
						myCars[carChoice - 1].accelerate();
					} catch (Exception exception) {
						exception.getMessage();
					}
				} 
				else if (userChoice == 4) {
					try {
						myCars[carChoice - 1].brake();
					} catch (Exception exception) {
						exception.getMessage();
					}
				} 
				else if (userChoice == 5) {
					myCars[carChoice - 1].printInfo(myCars[carChoice - 1].currentSpeed);
				} 
				else if (userChoice == 6) {
					for (int dispCounter = 0; dispCounter < myCars.length; dispCounter++) {
						System.out.println("Car " + (dispCounter + 1) + ": ");
						System.out.println("\tType: " + myCars[dispCounter].typeString);
						System.out.println("\tMake: " + myCars[dispCounter].make);
						System.out.println("\tModel: " + myCars[dispCounter].model);
						System.out.println("\tColor: " + myCars[dispCounter].color);
					}
					break;
				}
				else if (userChoice == 7) {
					break;
				}
				else {
					System.out.println("Not valid...");
				}
			} 
	} 

} */