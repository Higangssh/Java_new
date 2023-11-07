package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();
		
		for(int i=0 ; i <3 ; i++) {
			names.add(scan.nextLine());
			//String name =scan.nextLine();
		}
		
		for(int i=0; i <3 ; i++) {
			System.out.println(names.get(i));
		}
		for(String tmp : names) {
			System.out.println(tmp);
		}
	}
}
