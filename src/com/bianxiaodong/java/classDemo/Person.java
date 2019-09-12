package com.bianxiaodong.java.classDemo;

public class Person {
	String name, weight;
	int age;
	public Person(String name, Integer age, String weight) {
		this.setName(name);
		this.setAge(age);
		this.setWeight(weight);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getWeight() {
		return weight;
	}

	private void setWeight(String weight) {
		this.weight = weight;
	}
	private Integer getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}
	
	private String say() {
		String word = "我叫" + this.getName() + "，今年" +this.getAge().toString() + ", 我的体重有" + this.getWeight(); 
		return word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person sam = new Person("Sam", 33, "160g");
		System.out.println(sam.say());
	}

}
