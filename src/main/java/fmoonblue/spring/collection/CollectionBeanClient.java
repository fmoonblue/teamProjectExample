package fmoonblue.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		//list
		List<String> addressList = bean.getAddressList();
		for (String address : addressList) {
		System.out.println(address.toString());
		}
		
		//map
//		Map<String,String> addressList = bean.getAddressList(); 
//		for(String key:addressList.keySet()) {
//		System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)));
//	}
		
		//properties
//		Properties addressList = bean.getAddressList(); 
//		for(String key : addressList.stringPropertyNames()) {
//			System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)));
//		}
		
//		//set
//		Set<String> addressList = bean.getAddressList(); 
//		for(String address:addressList) {
//		System.out.println(address);
//	}
		
		factory.close();
	}
}
