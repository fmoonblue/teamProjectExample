package fmoonblue.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class BeforeAdvice {
	@Before("PointcutCommon.allPointcut()")
//	@Pointcut("execution(* fmoonblue.spring.web..*Impl.*(..))") 
//	public void allPointcut() {
//	}
//	@Before("allPointcut()")
//	public void beforeLog() {
//		System.out.println("[사전처리] : 비즈니스 로직 수행 전 동작");
//	}
	public void beforeLog(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().getName(); 
		Object[] args = joinPoint.getArgs(); 
		System.out.println("[사전처리] : " + method + "() 메서드의 ARGS 정보 : " + args[0].toString());
	}
}
