package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		double[] nums2 = {10.1,12.2,13,14.2,15.6};
		System.out.println(nums[0]);
		System.out.println(nums2[2]);
		boolean[] truth= {true, false ,false , true ,true};
		String[] str= {"성남","서울","인천","부산","강릉"};
		
		int[] result=nums.clone();
		int[] result2=nums;//참조값 복사
		
		//배열의 크기 얻어내기
		int size=nums.length;
		//배열의 순서가 잇는 데이터 이다. 특정 index 의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
		System.out.println(size);
	}
}
