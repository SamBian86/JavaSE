package com.bianxiaodong.java.generics;

public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 类型通配符? List<?> 表示各种泛型List的父类 
		// 设定类型通配符的上限 List<? extends Shape> 表示所有Shape泛型List的父类，遍历的时候如果实例是Shape的子类实例可以这么使用，用于方法形参的设定
		// 设定类型形参的上限 用于类和接口定义 public class Apple<T extends Number>
		// 设定类型通配符的下限 <? super Type> 表示必须是Type本身，或者是Type的父类
		// 泛型方法 在声明方法时定义一个或多个类型形参
		
		
		// 泛型方法 泛型类 泛型接口 泛型形参 泛型构造器
	}

}
