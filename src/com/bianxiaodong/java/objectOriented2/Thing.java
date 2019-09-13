package com.bianxiaodong.java.objectOriented2;

public class Thing {
	private String name;
	protected static String type = "thing";
	public Thing() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected void say() {
		System.out.println("Say " + this.getName());
	}
	
	protected static void sayHi() {
		System.out.println("Thing say Hi");
	}
	
}
