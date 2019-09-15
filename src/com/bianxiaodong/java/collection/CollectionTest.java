package com.bianxiaodong.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sam1 = new String("sam");
		String sam2 = new String("sam");
		Collection<String> list = new ArrayList<String>();
		list.add("张三1");
		list.add("张三2");
		list.add("张三3");
		System.out.println(list.contains("张三1"));
		Iterator<String> it = list.iterator();
		// 使用迭代器输出
		while (it.hasNext()) {
			String its = it.next();
			System.out.println(its);
		}

		// 使用循环输出
		for (String item : list) {
			System.out.println(item);
		}
		
		System.out.println(sam1.equals(sam2));
	}
}
