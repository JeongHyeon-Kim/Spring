package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Object result = invocation.proceed(); 
		/* 위의 부분은 이전 코드의 method.invoke() 호출 부분과 동일한 지점 */
		/* 주업무 로직을 호출하는 중요한 지점이기도 함 */
		long end = System.currentTimeMillis();
		String message = (end - start) + "ms 시간이 걸렸습니다.";
		System.out.println(message);
		return result;
	}

}