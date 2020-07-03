package fmoonblue.spring.polymorphism;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("삼성티비 객체 생성: 생성자 인젝션 - 다중매핑");
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV(Speaker speaker) {
			System.out.println("삼성티비 객체 생성 : 생성자 인젝션");
			this.speaker = speaker;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public SamsungTV() {
		System.out.println("Samsung TV 객체 생성");
	}
	public void powerOn() {
		System.out.println("Samsung TV 전원을 켠다. (가격 : + " + price + " 원)");
	}
	public void powerOff() {
		System.out.println("Samsung TV 전원을 끈다.");
	}
	public void volumeUp() {
//		System.out.println("Samsung TV 볼륨을 올린다.");
		speaker.volumeUp();
	}
	public void volumeDown() {
//		System.out.println("Samsung TV 볼륨을 내린다.");
		speaker.volumeDown();
	}
//	public void start() {
//	System.out.println("객체 초기화 작업 처리");
//}
//	public void stop() {
//		System.out.println("객체 삭제전에 처리할 로직");
//	}
}	
