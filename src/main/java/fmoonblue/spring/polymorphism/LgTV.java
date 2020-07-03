package fmoonblue.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//클래스 이름은 무시하고 id값을 tv로 변경해줌(TVUser에서 쓸 때)
@Component("tv")

public class LgTV implements TV{
	
	
	//Speaker 타입을 자동으로 연결하라는 의미
	@Autowired
//	@Qualifier("apple")
	
//	@Resource(name="apple")
	private Speaker speaker;
	public LgTV() {
		System.out.println("lgTV 생성자");
	}
	@Override
	public void powerOn() {
		System.out.println("LG TV 전원을 켠다");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LG TV 전원을 끈다");
		
	}
	@Override
	public void volumeUp() {
//		System.out.println("LG TV 볼륨을 올린다");
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
//		System.out.println("LG TV 볼륨을 내린다");
		speaker.volumeDown();
		
	}
}
