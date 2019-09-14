package com.bianxiaodong.java.objectOriented;

public class Person {
	private String name;
	private Animal animal;

	public Person() {

	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void take(Animal animal) {
		this.animal = animal;
	}

	// 多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法
	private void say() {
		System.out.println(this.getName() + " say !!!");
		// 因为age的访问修饰符是public 所以在person类里面可以直接用this.animal.age访问age
		System.out.println("age " + this.animal.age);
		this.animal.say();
	}

	public static void main(String args[]) {
		Person sam = new Person();
		sam.setName("sam");
		Animal animal = new Animal();
		animal.setName("Animal");
		Tiger tiger = new Tiger();
		tiger.setName("Tiger");
		sam.take(animal);
		sam.say();
		sam.take(tiger);
		sam.say();
	}
}
