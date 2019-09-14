package com.bianxiaodong.java.objectOriented;

import com.bianxiaodong.java.objectOriented2.*;

public class Animal extends Thing {
	private String name;
	public int age = 100;
	protected static String type = "animal";

	public Animal() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 如果父类在其他包中，那么该类可以访问从父类继承过来的protectod方法，但是无法访问父类的protected实例方法。
	// 访问修饰符就一个protected需要格外关注父子是不是在同一个包中这个问题
	protected void say() {
		System.out.println("Say " + this.getName());
	}

	protected static void sayHi() {
		System.out.println("Animal say Hi");
	}
}
