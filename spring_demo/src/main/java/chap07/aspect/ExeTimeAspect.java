package chap07.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class ExeTimeAspect {
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.println(joinPoint.getTarget().getClass().getSimpleName()
					+ "." + sig.getName() + "(" + Arrays.toString(joinPoint.getArgs())
					+ ") 실행 시간 : " + (finish - start) + " ns" );
		}
	}

}
