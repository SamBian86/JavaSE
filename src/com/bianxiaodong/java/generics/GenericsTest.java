package com.bianxiaodong.java.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java的参数化类型被称为泛型
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("王五");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
