package com.calc.service;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Division {
	public void div() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		double num1=sc.nextDouble();
		System.out.println("Enter Second number:");
		double num2=sc.nextDouble();
		System.out.println("Answer="+(num1/num2));
	}
}
