package test.main;

import test.auto.Engine;
import test.auto.SportsCar;


public class MainClass09 {
	public static void main(String[] args) {
		SportsCar car1 = new SportsCar(new Engine());
		car1.drive();
		car1.openDrive();
		
		SportsCar car2 =new SportsCar(null);
		car2.drive();
		car2.openDrive();
		
		
	}
}
