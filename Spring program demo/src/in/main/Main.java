package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.beans.Student;

public class Main
{
	 public static void main(String[] args) 
	{
		 String config_loc= "/in/resources/applicationcontext.xml";
		 ApplicationContext context=new ClassPathXmlApplicationContext();
	
		 Student std=(Student)context.getBean("stdID");
		 std.display();

		 System.out.println("==============================");

		 Student std1=(Student)context.getBean("stdID");
		 std1.display();
	}
}

/*
	Version 
	
	1. spring-beans-xxx.jar
	2. spring-core-xxx.jar
	3. spring-context-xxx.jar
	4. common-logging-xxx.jar
	5. spring-expression-xxx.jar
*/