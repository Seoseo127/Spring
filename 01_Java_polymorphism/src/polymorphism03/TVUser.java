package polymorphism03;

import java.util.Arrays;

public class TVUser {

	public static void main(String[] args) {
		System.out.println("args : " + Arrays.toString(args));
		
		BeanFactory factory = new BeanFactory();
		
		// SamsungTV, LgTV 사용
		//TV tv = (TV) factory.getBean("lg");
		
		TV tv = (TV) factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		

	}

}
