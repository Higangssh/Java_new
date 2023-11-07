package test.main;

import test.mypac.Calc;

public class MainClass05 {
	
	public static void main(String[] args) {
		Calc add1 = new Calc() {
			
			@Override
			public double execute1(double num1, double num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		double result1= add1.execute1(10, 20);//20
		
		Calc add2=(num1, num2) ->{
			return num1+num2;
		};
		
		Calc add3=(num1, num2) -> num1+num2; // 한줄짜리 함수모양 => 람다식
		Calc add=(a,b)->a+b;
		Calc sub=(a,b)->a-b;
		
		double result2=add.execute1(10, 20);
		
	
	}
}
