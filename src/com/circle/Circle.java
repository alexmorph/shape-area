package com.circle;

import figures.AbstractShape;
import figures.Shape;

public class Circle extends AbstractShape implements Shape{
	
	private int radius;
	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return  Math.PI * Math.pow(radius, 2);
	}

	
	

	
	
}
