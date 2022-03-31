package constructorInjection.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp=(Employee)context.getBean("employee");
		emp.display();
	}
}
