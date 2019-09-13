package com.bianxiaodong.java.objectOriented;

public class Tiger extends Animal {
	public static String type = "tiger"; 
	
	public Tiger() {
		super();
	}
	
//	重写与重载的区别在于，重写
	protected void say() {
		super.say();
		System.out.println("Say hi " + this.getName());
	}
	
	protected static void sayHi() {
		System.out.println("Tiger say Hi");
	}
	
}
