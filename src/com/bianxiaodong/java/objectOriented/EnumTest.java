package com.bianxiaodong.java.objectOriented;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
			System.out.println(s.ordinal());
		}

	}

}
