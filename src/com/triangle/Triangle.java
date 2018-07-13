package com.triangle;

import figures.AbstractShape;
import figures.Shape;

public class Triangle extends AbstractShape implements Shape {
	
	private int side_A, side_B, side_C;
	
	public Triangle(int sideA, int sideB, int sideC) {
		this.side_A = sideA;
		this.side_B = sideB;
		this.side_C = sideC;
	}

	public int getSide_A() {
		return side_A;
	}

	public void setSide_A(int side_A) {
		this.side_A = side_A;
	}

	public int getSide_B() {
		return side_B;
	}

	public void setSide_B(int side_B) {
		this.side_B = side_B;
	}

	public int getSide_C() {
		return side_C;
	}

	public void setSide_C(int side_C) {
		this.side_C = side_C;
	}

	@Override
	public double getArea() {
		double semiperimetr = (side_A + side_B + side_C) / 2.0;  
		 double result = Math.sqrt(semiperimetr * (semiperimetr - side_A) * 
				 (semiperimetr - side_B) * (semiperimetr - side_C)); 
		return result;
	}
	



}
