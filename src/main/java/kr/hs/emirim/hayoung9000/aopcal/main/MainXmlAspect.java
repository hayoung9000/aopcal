package kr.hs.emirim.hayoung9000.aopcal.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.hayoung9000.aopcal.cal.Calculator;

public class MainXmlAspect {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopAspect.xml");

		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = " + fiveFact);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
	}
}
