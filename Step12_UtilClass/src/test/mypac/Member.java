package test.mypac;

public class Member {

	//외부에서 접근이 가능한 공개 필드
	public int num;
	public String name;
	public String addr;
	//디폴트 생성자
	public Member() {}
	//필드에 저장 할 값을 한번에 전달 받는 생성자
	public Member(int num, String name, String addr) {
		this.num= num;
		this.name=name;
		this.addr=addr;
	}
	
	//@Override
	//public String toString() {
//		"{ num: 123, name: 'sdff', addr:' '}"
//		<member>
//			<num>123</num>
//		</member>

		//return "번호: " + num + ", " +
		//		"이름: " + name + ", " +
		//		"주소: " + addr;
	//}
}
