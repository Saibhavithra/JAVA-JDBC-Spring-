package com.training.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*public class SpringTester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Person pl =(Person)context.getBean("person");
		Person p2 =(Person)context.getBean("person");
		p2.setFirstName("keith");
		
		System.out.println(pl.getPersonDetails());
		//System.out.println(pl.getFirstName()+ pl.getAge()+pl.getLastName());
		((ClassPathXmlApplicationContext)context).close();
	}

}*/





import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.training.spring.config.ApplicationConfig;
 
public class SpringTester {
 
	public static void main(String[] args) {
		//ApplicationContext cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ApplicationContext cont= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Person p1 = (Person)cont.getBean("person");
		Person p1= cont.getBean(Person.class);
		Person p2 = (Person)cont.getBean("person");
		p2.setFirstName("Keith");
		System.out.println(p1.getPersonDetails());
		System.out.println(p2.getFirstName());//singleton -so same object use multiple values
		System.out.println("FirstName :"+p1.getFirstName()+"   LastName :"+p1.getLastName()+"  Age :"+p1.getAge());
		((AnnotationConfigApplicationContext)cont).close();
	}
 
}

