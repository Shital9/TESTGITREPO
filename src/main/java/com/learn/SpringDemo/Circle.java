package com.learn.SpringDemo;

public class Circle implements Shape {

	private Point center;

	public void draw() {

		System.out.println("Circle point is: " + center.getX() + "," + center.getY());
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

}
