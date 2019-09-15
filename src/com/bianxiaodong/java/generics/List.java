package com.bianxiaodong.java.generics;

import java.util.Iterator;

// 泛型接口
public interface List<E> {
	void add(E e);
	Iterator<E> iterator();
}
