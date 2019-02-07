package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vo.PizzaVO;
import com.vo.SoftDrink;

public class MainClass {

	public static void main (String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		PizzaVO p = (PizzaVO) context.getBean("pizza");
		
		System.out.println(p.getSoftDrink().getCreationTime().getTime());
		Thread.sleep(2000);
		System.out.println();
		System.out.println(p.getSoftDrink().getCreationTime().getTime());
		
		
		
	}
	
}
