package Homework;


import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	
	protected String name;
	protected int Age;

	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Employee(String name, int age) {
		//super();
		this.name = name;
		Age = age;
	}
	

}
	