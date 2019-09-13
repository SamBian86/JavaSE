package com.bianxiaodong.java.objectOriented;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Animal();
		ani.setName("animal!");
		System.out.println(ani.getName());
		System.out.println("Type is " + Animal.type + "!");
		ani.say();
		Animal.sayHi();
		System.out.println("--------以上测试继承----------");
		
		Tiger tiger = new Tiger();
		tiger.setName("tiger!");
		System.out.println(tiger.getName());
		System.out.println("Type is " + Tiger.type + "!");
		// 如果子类没有实现父类的同名方法，则调用父类的方法，此场景的大前提是子类父类在同一包中
		tiger.say();
		Tiger.sayHi();
		System.out.println("--------以上测试继承----------");
		
		
		
	}

}
