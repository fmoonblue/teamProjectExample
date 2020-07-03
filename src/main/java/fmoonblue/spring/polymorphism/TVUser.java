package fmoonblue.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//1. Spring Container 구동
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//BeanFactory factory = new BeanFactory();
		
		//2. Spring Container로부터 원하는 객체를 얻어옴
//		TV tv = (TV)factory.getBean("tv");
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
		
		//new 부분만 바꿔서 다형성 적용 가능
		//TV tv = new LgTV();
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring Container를 종료
		factory.close();
	}
	
}
