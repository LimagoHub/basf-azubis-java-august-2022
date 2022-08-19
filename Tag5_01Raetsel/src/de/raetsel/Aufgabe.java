package de.raetsel;

public class Aufgabe {

	public static void main(String[] args) {
		new B();
		new B();
	}
	
}

class A {
	
	static {
		System.out.println("A");
	}
	
	public A() {
		System.out.println("Konstruktor von A");
		foo();
	}
	
	public void foo() {
		System.out.println("Foo von A");
	}
	
}

class B extends A{
	
	public B() {
	
		System.out.println("Konstruktor von B");
	}
	
	public void foo() {
		System.out.println("Foo von B");
	}
}
