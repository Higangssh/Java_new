package test.mypac;
/*
 * Member 객체 하나에 회원의 번호 ,이름 ,주소를 담기 위해 Member클래스를 설계하려고 한다.
 */
public class Member {
	public int num;
	public String name; 
	public String addr;
	
	public void showInfo() {
		//this는 나의 참조값을 가르킨다 생략가능)
		String info="번호는"+this.num+"이고 이름은"+this.name+"이고 주소는"+addr+"입니다";
		System.out.println(info);
		
		Member a=this;
	}		
}
