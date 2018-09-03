package com.learn.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Triangle triangle = new Triangle();
		// triangle.draw();

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("Spring.xml"));
		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("Spring.xml");

		Shape shape = (Shape) context.getBean("circle");

		shape.draw();

	}

}
