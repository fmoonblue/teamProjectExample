package fmoonblue.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {
	
	//초기화 되기 전 전처리
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		// TODO Auto-generated method stub
//		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
		System.out.println("5. 초기화 되기 전에 빈에 대한 처리를 실행");
		return bean;
	}

	
	//초기화 된 후 후처리 
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
		System.out.println("8. 초기화 된 후에 빈에 대한 처리를 실행");
		return bean;
	}
	
	
}
