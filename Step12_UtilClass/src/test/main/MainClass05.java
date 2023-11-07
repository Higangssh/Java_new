package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass05 {

	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<>();
		
		//members.add(new Member(1,"김","성남"));
		//members.add(new Member(2,"손","서울"));
		//members.add(new Member(3,"오","오산"));
		Member m1 = new Member(1,"김","성남");
		Member m2 = new Member(2,"손","서울");
		Member m3 = new Member(3,"오","오산");
		members.add(m1);
		members.add(m2);
		members.add(m3);
		System.out.println(m1);
		for(int i=0; i < members.size(); i++) {
			Member tmp = members.get(i);
			System.out.println(tmp);
		}
		for(Member tmp:members) {
			System.out.println("번호:"+tmp.num+",이름:"+tmp.name+",주소:" +tmp.addr);
		}
		System.out.println("__________");
		members.forEach((tmp)->{
			String result =String.format("번호:%d, 이름:%s , 주소:%s", tmp.num, tmp.name, tmp.addr);
			System.out.println(result);
		});
		
	}
}
