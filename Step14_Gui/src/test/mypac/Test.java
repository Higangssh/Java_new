package test.mypac;

public class Test {
	public void test(String str)throws NumberFormatException{
		Double d1 = Double.parseDouble(str);
		System.out.println(str + " 는 잘못된 입력입니다.");
	}

}
