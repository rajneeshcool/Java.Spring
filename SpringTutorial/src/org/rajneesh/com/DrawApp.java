package org.rajneesh.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		Triangle triangle = new Triangle();
		triangle.Draw();
		*/
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:/Users/rajneku3/workspace/SpringTutorial/bin/org/rajneesh/com/spring.xml"));
		Triangle triangle =(Triangle) factory.getBean("triangle");
		triangle.Draw();
	}

}
