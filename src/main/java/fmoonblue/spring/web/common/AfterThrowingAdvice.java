package fmoonblue.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import fmoonblue.spring.web.user.UserVO;
@Service
@Aspect
public class AfterThrowingAdvice {
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "e")
//	@Pointcut("execution(* fmoonblue.spring.web..*Impl.*(..))")
//	public void allPointcut() {
//	}
//	@AfterThrowing(pointcut = "allPointcut()", throwing = "e")
//	public void exceptionLog() {
//		System.out.println("[예외처리] : 비즈니스 로직 수행 중 예외 발생");
//	}

	public void exceptionLog(JoinPoint joinPoint, Exception e) {
		String method = joinPoint.getSignature().getName();
		System.out.println("[예외처리] : " + method + "() 메서드 수행 중 발생된 예외 메세지 : " + e.getMessage());
	}
}
