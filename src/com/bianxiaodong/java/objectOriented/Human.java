package com.bianxiaodong.java.objectOriented;

public abstract class Human {
	private String name;
	public Human(String name) {
		this.setName(name);
	}
	
	public abstract void showSex();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
