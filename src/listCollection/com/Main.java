package listCollection.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("stringListBean.xml");
		
		Questions que=(Questions)context.getBean("questions");
		que.print();
	}
}
