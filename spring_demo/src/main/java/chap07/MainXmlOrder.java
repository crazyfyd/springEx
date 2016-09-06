package chap07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXmlOrder {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aopOrder.xml");
		
		Calculator implCal = ctx.getBean("implCal", Calculator.class);
		implCal.factorial(5);
		implCal.factorial(5);
	}

}
