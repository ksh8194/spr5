package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:init.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pack/init.xml");
		
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:init.xml");  //applicationcontext의 개량종
		
		
		/*
		MessageImpl impl1 = (MessageImpl)context.getBean("mimpl");
		impl1.sayHi();
		MessageImpl impl2 = (MessageImpl)context.getBean("mimpl");
		impl1.sayHi();
		System.out.println(impl1+" " +impl2.toString());
		*/
		
		//다형성 구현
		
		// MessageInter inter = (MessageImpl)context.getBean("mimpl"); // spring 은 우리에게 결과를 object로 돌려줌. 그래서 casting 해줘야됨 세 방법 중 하나로.
		//MessageInter inter = (MessageInter)context.getBean("mimpl"); //2,3번째꺼 쓰는게 좋음
		MessageInter inter = context.getBean("mimpl",MessageInter.class);
		inter.sayHi();
		context.close();
		
	}

}
