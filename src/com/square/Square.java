package com.square;

import figures.AbstractShape;
import figures.Shape;

public class Square extends AbstractShape implements Shape{
	
	private int sideOfSquare;
	
	public Square(int side) {
		this.sideOfSquare = side;
	}

	@Override
	public double getArea() {
		return sideOfSquare * sideOfSquare;
	}


	
}
