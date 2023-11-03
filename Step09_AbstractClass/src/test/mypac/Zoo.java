package test.mypac;

public class Zoo {
	public class Monkey{
		//Zoo.Monkey type
		
		public void say() {
			System.out.println("안녕! 나는 원숭이야");
		}
	}
		public Monkey getMonkey() {
			return new Monkey();
		
	}
	
	public class Tiger{
		public void say ( ) {
			System.out.println("안녕! 나는 호랑이야");
		}
	}
	public Tiger getTiger() {
		return new Tiger();
	}
	
}
