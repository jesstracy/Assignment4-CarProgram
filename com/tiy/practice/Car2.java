/*package com.tiy.practice;

public class Car2 {

	String make;
	String model;
	String color;
	int type; //1 for car, 2 for minivan, 3 for old car, 4 for sports car
	String typeString;
	String carStatus = "not started";
	int currentSpeed = 0;

	public void startCar() throws Exception {
		if (this.carStatus.equals("started")) {
			throw new Exception("You can't start a car that is already started!");
		}
		this.carStatus = "started";
	}

	public void stopCar() throws Exception {
		if (this.carStatus.equals("not started")) {
			throw new Exception("You can't stop a car that is already stopped!");
		}
		this.carStatus = "not started";
	}

	public void accelerate() throws Exception {
		if (this.carStatus.equals("not started")) {
			throw new Exception("You must start the car before you can accelerate!");
		}
		if ((this.currentSpeed + 5) > 85) {
			throw new Exception("You cannot exceed 85 mph!");
		}
		this.currentSpeed += 5;
	}

	public void brake() throws Exception {
		if (this.currentSpeed == 0) {
			throw new Exception("You can't brake because the car is not moving.");
		}
		this.currentSpeed -= 1;
	}

	public void printInfo(int carCurrentSpeed) throws Exception {
		carAnimation(carCurrentSpeed);
		System.out.println("Printing the car's info...");
		System.out.println("Type: " + this.typeString);
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("Status: " + this.carStatus);
		System.out.println("Current speed: " + this.currentSpeed);
		System.out.println();
	}

	public static void clearMacScreen() { 
        System.out.print("\033[H\033[2J"); 
    }

	public void carAnimation(int speed) throws Exception {
		clearMacScreen();

		int sleepTime = 95 - speed;

		if (sleepTime == 95) {
			System.out.println("      _________");
			System.out.println("     /|   | |  \\");
			System.out.println(" ___/ |___| |___\\____");
			System.out.println("|_|    -     -     |_|"); 
			System.out.println("|____________________|");
			System.out.println("   (__)       (__)");
		} else {
			System.out.println();
			System.out.println();
			System.out.println("_");
			System.out.println("_|"); 
			System.out.println("_|");
			System.out.println();

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println();
			System.out.println();
			System.out.println("___");
			System.out.println(" |_|"); 
			System.out.println("___|");
			System.out.println();

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println();
			System.out.println();
			System.out.println("\\____");
			System.out.println("   |_|"); 
			System.out.println("_____|");
			System.out.println("_)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("_");
			System.out.println(" \\");
			System.out.println("__\\____");
			System.out.println("     |_|"); 
			System.out.println("_______|");
			System.out.println("(__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("___");
			System.out.println("|  \\");
			System.out.println("|___\\____");
			System.out.println(" -     |_|"); 
			System.out.println("_________|");
			System.out.println("  (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("_____");
			System.out.println("| |  \\");
			System.out.println("| |___\\____");
			System.out.println("   -     |_|"); 
			System.out.println("___________|");
			System.out.println("    (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("_______");
			System.out.println("  | |  \\");
			System.out.println("__| |___\\____");
			System.out.println("     -     |_|"); 
			System.out.println("_____________|");
			System.out.println("      (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("_________");
			System.out.println("|   | |  \\");
			System.out.println("|___| |___\\____");
			System.out.println(" -     -     |_|"); 
			System.out.println("_______________|");
			System.out.println(")       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("  _________");
			System.out.println(" /|   | |  \\");
			System.out.println("/ |___| |___\\____");
			System.out.println("   -     -     |_|"); 
			System.out.println("_________________|");
			System.out.println("__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("    _________");
			System.out.println("   /|   | |  \\");
			System.out.println("__/ |___| |___\\____");
			System.out.println("|    -     -     |_|"); 
			System.out.println("___________________|");
			System.out.println(" (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("      _________");
			System.out.println("     /|   | |  \\");
			System.out.println(" ___/ |___| |___\\____");
			System.out.println("|_|    -     -     |_|"); 
			System.out.println("|____________________|");
			System.out.println("   (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("        _________");
			System.out.println("       /|   | |  \\");
			System.out.println("   ___/ |___| |___\\____");
			System.out.println("  |_|    -     -     |_|"); 
			System.out.println("  |____________________|");
			System.out.println("     (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("          _________");
			System.out.println("         /|   | |  \\");
			System.out.println("     ___/ |___| |___\\____");
			System.out.println("    |_|    -     -     |_|"); 
			System.out.println("    |____________________|");
			System.out.println("       (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("            _________");
			System.out.println("           /|   | |  \\");
			System.out.println("       ___/ |___| |___\\____");
			System.out.println("      |_|    -     -     |_|"); 
			System.out.println("      |____________________|");
			System.out.println("         (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("              _________");
			System.out.println("             /|   | |  \\");
			System.out.println("         ___/ |___| |___\\____");
			System.out.println("        |_|    -     -     |_|"); 
			System.out.println("        |____________________|");
			System.out.println("           (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                _________");
			System.out.println("               /|   | |  \\");
			System.out.println("           ___/ |___| |___\\____");
			System.out.println("          |_|    -     -     |_|"); 
			System.out.println("          |____________________|");
			System.out.println("             (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                  _________");
			System.out.println("                 /|   | |  \\");
			System.out.println("             ___/ |___| |___\\____");
			System.out.println("            |_|    -     -     |_|"); 
			System.out.println("            |____________________|");
			System.out.println("               (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                    _________");
			System.out.println("                   /|   | |  \\");
			System.out.println("               ___/ |___| |___\\____");
			System.out.println("              |_|    -     -     |_|"); 
			System.out.println("              |____________________|");
			System.out.println("                 (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                      _________");
			System.out.println("                     /|   | |  \\");
			System.out.println("                 ___/ |___| |___\\____");
			System.out.println("                |_|    -     -     |_|"); 
			System.out.println("                |____________________|");
			System.out.println("                   (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                        _________");
			System.out.println("                       /|   | |  \\");
			System.out.println("                   ___/ |___| |___\\____");
			System.out.println("                  |_|    -     -     |_|"); 
			System.out.println("                  |____________________|");
			System.out.println("                     (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                          _________");
			System.out.println("                         /|   | |  \\");
			System.out.println("                     ___/ |___| |___\\____");
			System.out.println("                    |_|    -     -     |_|"); 
			System.out.println("                    |____________________|");
			System.out.println("                       (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                            _________");
			System.out.println("                           /|   | |  \\");
			System.out.println("                       ___/ |___| |___\\____");
			System.out.println("                      |_|    -     -     |_|"); 
			System.out.println("                      |____________________|");
			System.out.println("                         (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                              _________");
			System.out.println("                             /|   | |  \\");
			System.out.println("                         ___/ |___| |___\\____");
			System.out.println("                        |_|    -     -     |_|"); 
			System.out.println("                        |____________________|");
			System.out.println("                           (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                _________");
			System.out.println("                               /|   | |  \\");
			System.out.println("                           ___/ |___| |___\\____");
			System.out.println("                          |_|    -     -     |_|"); 
			System.out.println("                          |____________________|");
			System.out.println("                             (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                  _________");
			System.out.println("                                 /|   | |  \\");
			System.out.println("                             ___/ |___| |___\\__");
			System.out.println("                            |_|    -     -     |"); 
			System.out.println("                            |___________________");
			System.out.println("                               (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                    _________");
			System.out.println("                                   /|   | |  \\");
			System.out.println("                               ___/ |___| |___\\");
			System.out.println("                              |_|    -     -    "); 
			System.out.println("                              |_________________");
			System.out.println("                                 (__)       (__)");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                      __________");
			System.out.println("                                     /|   | |  |");
			System.out.println("                                 ___/ |___| |__|");
			System.out.println("                                |_|    -     -  "); 
			System.out.println("                                |_______________");
			System.out.println("                                   (__)       (_");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                        ________");
			System.out.println("                                       /|   | | ");
			System.out.println("                                   ___/ |___| |_");
			System.out.println("                                  |_|    -     -"); 
			System.out.println("                                  |_____________");
			System.out.println("                                     (__)       ");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                          ______");
			System.out.println("                                         /|   | ");
			System.out.println("                                     ___/ |___| ");
			System.out.println("                                    |_|    -    "); 
			System.out.println("                                    |___________");
			System.out.println("                                       (__)     ");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                            ____");
			System.out.println("                                           /|   ");
			System.out.println("                                       ___/ |___");
			System.out.println("                                      |_|    -  "); 
			System.out.println("                                      |_________");
			System.out.println("                                         (__)   ");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                              __");
			System.out.println("                                             /| ");
			System.out.println("                                         ___/ |_");
			System.out.println("                                        |_|    -"); 
			System.out.println("                                        |_______");
			System.out.println("                                           (__) ");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println("                                                ");
			System.out.println("                                               /");
			System.out.println("                                           ___/ ");
			System.out.println("                                          |_|   "); 
			System.out.println("                                          |_____");
			System.out.println("                                             (__");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println();
			System.out.println();
			System.out.println("                                             ___");
			System.out.println("                                            |_| "); 
			System.out.println("                                            |___");
			System.out.println("                                               (");

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println();
			System.out.println();
			System.out.println("                                               _");
			System.out.println("                                              |_"); 
			System.out.println("                                              |_");
			System.out.println();

			Thread.sleep(sleepTime);
			clearMacScreen();

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(); 
			System.out.println();
			System.out.println();

			Thread.sleep(sleepTime);
			clearMacScreen();
		}
	}
} */