package com.bianxiaodong.java.runtime;

import java.util.Scanner;

public class ScannerTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println("输入:" + sc.next());
		}
	}

}
