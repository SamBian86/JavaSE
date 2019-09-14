package com.bianxiaodong.java.objectOriented;

public class Woman extends Human {
	public Woman(String name) {
		super(name);
	}
	
	public void showSex() {
		System.out.println("sex is female.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human woman = new Woman("Jane");
		woman.showSex();
	}
}
