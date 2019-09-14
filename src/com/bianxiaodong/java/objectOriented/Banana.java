package com.bianxiaodong.java.objectOriented;

public class Banana implements BananaInterface {
	private String color;
	public Banana() {}

	@Override
	public void setFruitColor(String color) {
		// TODO Auto-generated method stub
		this.setColor(color);
	}

	@Override
	public void whoLikeEat() {
		// TODO Auto-generated method stub
		System.out.println("monkey's favourite fruit. color is " + this.getColor());
	}
	
	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public static void main(String args[]) {
		Banana banana = new Banana();
		banana.setFruitColor("yellow");
		System.out.println("Banana max: " + Banana.max);
		System.out.println("Banana min: " + Banana.min);
		banana.whoLikeEat();
	}

}
