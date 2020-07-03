package fmoonblue.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyLifeBeanImpl implements BeanFactoryAware, BeanNameAware, DisposableBean, InitializingBean, MyLifeBean {
	private String greeting;
	private String beanName;
	private BeanFactory beanFactory;

	//1. 생성자 -> 2. set메소드 -> 3. 이름 설정 -> 4.빈 팩토리 설정 -> 
	//5. 빈 post프로세스로 구현한 전처리 작업-> 6. 프로퍼티 설정 -> 
	//7. 초기화 메소드 수행 -> 8. 초기화 후 후처리 작업
	public MyLifeBeanImpl() {
		System.out.println("1. 빈의 생성자 실행");
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("2. 빈의 setter 메소드 실행");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("3. 빈 이름 설정");
		this.beanName = beanName;
		System.out.println("---> " + this.beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. 빈 팩토리 설정");
		this.beanFactory = beanFactory;
		System.out.println("---> " + this.beanFactory.getClass());
	}

	@Override
	public void sayHello() {
		System.out.println(greeting + beanName + "!!!");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("6. Property 설정 완료");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("종료");
	}


	public void init() {
		System.out.println("7. 초기화 메소드 수행");
	}

}
