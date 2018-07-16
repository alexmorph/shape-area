package com.ignatenko.square;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.figures.AbstractShape;
import com.ignatenko.figures.Shape;
import com.ignatenko.main.RunApp;

public class Square extends AbstractShape implements Shape {

	private static final Logger logger = Logger.getLogger(Square.class.getName());
	private int sideOfSquare;

	public int getSideOfSquare() {
		return sideOfSquare;
	}

	public void setSideOfSquare(int sideOfSquare) {
		this.sideOfSquare = sideOfSquare;
	}


	@Override
	public int getArea() {
		 int result = checkSideLength(getSideOfSquare());
		return result * result;
	}
	
	public int checkSideLength(int value) {
		if(value > 0) {
			return value;
		}else {
			logger.log(Level.WARNING, "Side of square can be only above zero!");	
			return 0;
		}
	}

}
