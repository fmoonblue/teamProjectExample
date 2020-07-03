package fmoonblue.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import fmoonblue.spring.web.user.UserVO;

@Service
@Aspect
public class AfterAdvice {
	@After("PointcutCommon.allPointcut()")	
//	@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")
//	public void allPointcut() {
//	}
//
//	@After("allPointcut()")
	public void finallyLog() {
		System.out.println("[사후처리] : 비즈니스 로직 수행 후 무조건 동작");
	}
}
