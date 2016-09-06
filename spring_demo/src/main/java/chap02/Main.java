package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		chap02Greeter g = ctx.getBean("greeter", chap02Greeter.class);
		String msg = g.greet("SSSPPPPRRRIIINGG");
		System.out.println(msg);
		
		chap02Greeter g1 = ctx.getBean("greeter", chap02Greeter.class);
		chap02Greeter g2 = ctx.getBean("greeter", chap02Greeter.class);
		System.out.println("(g1 == g2) = " + (g1 == g2)); 	// �̱���
		
		ctx.close();
	}
}
