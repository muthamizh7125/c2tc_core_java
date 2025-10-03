
package com.tnsif.day_7.overriding.v1;


class Circle extends Shape {
	private double radius;


	public Circle(double radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Drawing a circle with radius " + radius);
	}

	public void erase() {
		System.out.println("Erasing a circle with radius " + radius);
	}
}
