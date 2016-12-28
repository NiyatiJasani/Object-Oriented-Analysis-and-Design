package singletonwithenumtest;

import singletonwithenum.Employee;

public class EnumTest {
	public static void main(String[] args) {
		Employee.INSTANCE.setName("Niyati");
		Employee.INSTANCE.setId(10);
		System.out.println("Id " + Employee.INSTANCE.getId());
		System.out.println("Name " + Employee.INSTANCE.getName());
	}
}
