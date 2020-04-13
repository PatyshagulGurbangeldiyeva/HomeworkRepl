package com.syntax.repl.home01;

public class Task160Cat extends Task160{

	public Task160Cat (String name){
		super(name);
	}
	void sleep() {
		System.out.println(name+" sleeps");
	}
		
}
class Kitten1 extends Task160Cat{
	Kitten1(String name){
		super(name);
	}
	void eat() {
	System.out.println(name+" eats milk");
	}
	}
class Kitten2 extends Task160Cat{
	Kitten2(String name){
		super(name);
	}
	void eat() {
		System.out.println(name+" eats snack");
	}
}
class Kitten3 extends Task160Cat{
	Kitten3(String name){
		super(name);
	}
	void eat() {
		System.out.println(name+" eats everything");
	}
}
