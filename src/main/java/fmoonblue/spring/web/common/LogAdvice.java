package fmoonblue.spring.web.common;

import org.aspectj.lang.annotation.Pointcut;

public class LogAdvice {
	@Pointcut("execution(* fmoonblue.spring.web..*Impl.*(..))")
	//pointcut의 아이디는 allPointcut이 되는 것임
	//내용이 있으면 안됨
	public void allPointcut() {
		
	}
	public void getPointcut() {
		
	}
	public void printLog() {
		System.out.println("[로그] : 비즈니스 로직 수행 전 동작");
	}
}
