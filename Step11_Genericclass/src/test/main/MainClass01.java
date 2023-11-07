package test.main;

import test.mypac.Apple;

import test.mypac.FruitBox;
import test.mypac.Melone;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		FruitBox<Apple> box = new FruitBox<Apple>();
		
		FruitBox<Orange>box2= new FruitBox<Orange>();
		
		box.pack(null);
		
		FruitBox<Melone>box3 = new FruitBox<>();
		
		box.pack(new Apple());
		Apple f1 = box.unpack();
		
		
		Orange f2=box2.unpack();
		box3.unpack();
	}
}
