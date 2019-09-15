package com.bianxiaodong.java.generics;

// 泛型类
public class Apple<T> {
	private T name;
	public Apple(T name) {
		this.name = name;
	}
	
	protected T getName() {
		return name;
	}
	
	protected void setName(T name) {
		this.name = name;
	}
	
	public static void main(String args[]) {
		Apple<String> a = new Apple<>("蛇果");
		System.out.println(a.getName());
		a.setName("红富士");
		System.out.println(a.getName());
		
		Apple<Integer> b = new Apple<>(1);
		System.out.println(b.getName());
		b.setName(2);
		System.out.println(b.getName());
	}
}
