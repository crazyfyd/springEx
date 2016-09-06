package chap07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlPojo {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator implCal = ctx.getBean("implCal", Calculator.class);
//		ImplCalculator implCal = ctx.getBean("implCal", ImplCalculator.class);
		long fiveFact1 = implCal.factorial(5);
		System.out.println("implCal.factorial(5) = " + fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
	}

}
