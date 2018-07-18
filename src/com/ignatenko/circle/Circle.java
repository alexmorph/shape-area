package com.ignatenko.circle;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.figures.AbstractShape;
import com.ignatenko.figures.Shape;
import com.ignatenko.square.Square;

public class Circle extends AbstractShape implements Shape {
	
	private static final Logger logger = Logger.getLogger(Circle.class.getName());
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		int myRadius = checkRadius(getRadius());
		return (int) (Math.PI * Math.pow(myRadius, 2));
	}
	
	public int checkRadius(int value) {
		if(value > 0) {
			return value;
		}else {
			logger.log(Level.WARNING, "Radius can be only above zero!");	
			return 0;
		}
	}

}
