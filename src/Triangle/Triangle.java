package Triangle;

import figures.AbstractShape;
import figures.Shape;

public class Triangle extends AbstractShape implements Shape {
	
	private int side_A, side_B, side_C;
	
	public Triangle(int sideA, int sideB, int sideC) {
		this.side_A = sideA;
		this.side_B = sideB;
		this.side_C = sideC;
	}

	@Override
	public double getArea() {
		double semiperimetr = (side_A + side_B + side_C) / 2.0;  
		 double result = Math.sqrt(semiperimetr * (semiperimetr - side_A) * 
				 (semiperimetr - side_B) * (semiperimetr - side_C)); 
		return result;
	}
	



}
