package t_tok01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args)
	{
//		HelloWorld hello = new HelloWorld();
//		hello.setMessage("Hello world"); // class를 직접 수정해야한다 ( 컴파일을 다시해야한다 )
//		
//		System.out.println(hello.getMeseage());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld"); // id를 기반해서 가져옴
		System.out.println(hello.getMeseage());
		
	}

}
