package com.bianxiaodong.java.annotation;

@MyTag(age=20)
public class TestDemo {
	public TestDemo() {

	}

	// @Override 强制一个子类必须覆盖父类
	// @Deprecated 已过时
	// @SuppressWarnings 抑制编译器警告
	// @SafeVarargs 堆污染警告 把一个不带泛型的变量赋值给一个带泛型的变量

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTag annotation = (MyTag) TestDemo.class.getAnnotation(MyTag.class);
        System.out.println(annotation.name());
        System.out.println(annotation.age());
	}

}
