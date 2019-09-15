package com.bianxiaodong.java.generics;

public class YellowApple extends Apple<String> {
	public YellowApple(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	protected String getName() {
		return super.getName();
	}

	protected void setName(String name) {
		super.setName(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YellowApple a = new YellowApple("黄苹果");
		System.out.println(a.getName());
		a.setName("红富士");
		System.out.println(a.getName());
	}

}
