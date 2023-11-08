package test.main;

public class QuizMain2 {

	public static void main(String[] args) {
		int sec =1;
		int min = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(min+"분"+sec+"초");
			sec++;
			if(sec>59) {
				min+=1;
				sec=0;
			}
			
			
		}
		
	}
}
