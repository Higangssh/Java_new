package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0 으로 초기화된 방3개짜리 int[] 객체를 만들어서 지역변수 nums 에 담기
		int[] nums = {0,0,0};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		// 0으로 초기화된 방 500개짜리 int[] 객체 만들어서 참조값을 지역변수 num2에 담기
		int[] nums2=new int[500];
		
		
		for(int i=0;i<nums2.length; i++) {
			nums2[i]= i+1;
		}
	}
	}
