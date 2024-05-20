package com.abstraction;

public class TestClass {

	public static void main(String[] args) {

		B b1 = new B();
		b1.getData();
		b1.getInfo();

		System.out.println("------------------------------");
		A a1 = new B();
		a1.getInfo();
		a1.getData();

	}

}
