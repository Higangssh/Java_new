package test.mypac;

public class MacBook {
	//외부에서 접근 불가하도록 접근 지정자를 private 로 해서 필드 3개 선언하기
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	public MacBook(Cpu cpu,Memory memory,HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		
	}
}
