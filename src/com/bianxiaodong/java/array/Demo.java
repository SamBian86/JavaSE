package com.bianxiaodong.java.array;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		long i = 1;
		long[] items = new long[]{5,4,3,2,1};
		long[] items2 = new long[]{1,2,3,4,5};
//		Arrays.fill(items, 7);
		Arrays.sort(items);
		for (long item : items) {
			System.out.println(item);
		}
		n = Arrays.binarySearch(items, i);
		System.out.println(i + "的位置:" + n); // 获取位置前必须是排序好的数据
		System.out.println(Arrays.equals(items, items2));
	}
}
