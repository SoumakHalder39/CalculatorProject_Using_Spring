package com.calc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.calc.service.Addition;
import com.calc.service.Division;
import com.calc.service.Multiplication;
import com.calc.service.Subtraction;

@SpringBootApplication
public class WorkingCaluclatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(WorkingCaluclatorApplication.class, args);
		Addition a=container.getBean(Addition.class);
		Subtraction s=container.getBean(Subtraction.class);
		Multiplication m=container.getBean(Multiplication.class);
		Division d=container.getBean(Division.class);
		
		System.out.println("Welcome to the Calculator");
		System.out.println("-------------------------");
		boolean flag=true;
		while(flag) {
		System.out.println("What you want to do");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Logout");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
			case 1:a.add();
				   break;
			case 2:s.sub();
					break;
			case 3:m.mul();
					break;
			case 4:d.div();
					break;
			case 5:System.out.println("thanks for choosing us");
				flag=false;
				   break;
			default:System.out.println("Invalid choice");
		}
		
	}
	}

}
