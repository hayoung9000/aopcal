package kr.hs.emirim.hayoung9000.aopcal.main;

import kr.hs.emirim.hayoung9000.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.hayoung9000.aopcal.cal.ImpCalculator;
import kr.hs.emirim.hayoung9000.aopcal.cal.RecCalculator;

public class MainProcxy {

	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttCal1.factorial(num));
		
		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(num));
	}

}
