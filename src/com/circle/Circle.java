package com.circle;

import figures.AbstractShape;
import figures.Shape;

public class Circle extends AbstractShape implements Shape{
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return  Math.PI * Math.pow(radius, 2);
	}

}
