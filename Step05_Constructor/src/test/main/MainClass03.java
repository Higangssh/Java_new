package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 
		 */
		Cpu cpu=new Cpu();
		Memory memory= new Memory();
		HardDisk hardDisk=new HardDisk();
		MacBook mac1=new MacBook(cpu,memory,hardDisk);
		
		//=MacBook mac1=new MacBook(new Cpu(),new Memory(),new HardDisk());
		
				
	}
}
