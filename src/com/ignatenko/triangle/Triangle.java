package com.ignatenko.triangle;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.figures.AbstractShape;
import com.ignatenko.figures.Shape;
import com.ignatenko.square.Square;

public class Triangle extends AbstractShape implements Shape {
	
	
	private static final Logger logger = Logger.getLogger(Triangle.class.getName());
	private int side_A, side_B, side_C;
	

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
	
	public Triangle(int sideA, int sideB) {
		setSide_A(sideA);
		setSide_B(sideB);
	}

//	@Override
//	public double getArea() {
//		double semiperimetr = (side_A + side_B + side_C) / 2.0;  
//		 double result = Math.sqrt(semiperimetr * (semiperimetr - side_A) * 
//				 (semiperimetr - side_B) * (semiperimetr - side_C)); 
//		return result;
//	}
	
	@Override
	public double getArea() {
		int sideA = getSide_A();
		int sideB = getSide_B();
		boolean flag = checkTriangleSide(sideA,sideB);
		if(flag == true) {
		double semiperimetr = (sideA + sideB + getSide_C()) / 2.0;  
		 double result = Math.sqrt(semiperimetr * (semiperimetr - sideA) * 
				 (semiperimetr - sideB) * (semiperimetr - getSide_C())); 
		return result;
		}else {
			return 0.0;
		}
	}
	
	public boolean checkTriangleSide(int a, int b) {
		if(a <= 0 || b <= 0 ) {
			logger.log(Level.WARNING, "Side can be only above zero!");	
			return false;
		}else {
			int side = findSideCOfRectangular(a, b);
			setSide_C(side);
			return true;
		}	
	}
	
	public int findSideCOfRectangular(int a, int b) {
		//c2 = a2 + b2
		int c =   (int) (Math.pow(a, 2) + Math.pow(b, 2));
		return (int) Math.sqrt(c);	
	}



}
