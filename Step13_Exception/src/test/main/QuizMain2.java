package test.main;

public class QuizMain2 {

	public static void main(String[] args) {
		int sec = 1;
		int min = 0;
		while(true) {
			//스레드 1초 지연 시키기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(min+"분"+sec+"초");
			//1초증가
			sec++;
			//60이되면 0으로 바꿈
			if(sec>59) {
				min+=1;
				sec=0;
			}
			
			
		}
		
	}
}
