package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		List<Car>cars =new  ArrayList<>();
		cars.add(new Car("현대차"));
		cars.add(new Car("삼성차"));
		cars.add(new Car("기아차"));
		for(int i=0;i<cars.size();i++) {
			cars.get(i).drive();
		}
		for(Car car : cars) {
			car.drive();
			
		}
		cars.forEach((tmp)->{
			tmp.drive();
		});
		
		cars.forEach(new Consumer<Car>() {
		
			@Override
			public void accept(Car t) {
				System.out.println(t);
				
			}
		});
	}
}
