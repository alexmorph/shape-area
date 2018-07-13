package com.square;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.main.RunApp;

import figures.AbstractShape;
import figures.Shape;

public class Square extends AbstractShape implements Shape{
	
	private static final Logger logger = Logger.getLogger(Square.class.getName());
	
	private int sideOfSquare;
	
	public int getSideOfSquare() {
		return sideOfSquare;
	}

	public void setSideOfSquare(int sideOfSquare) {
		this.sideOfSquare = sideOfSquare;
	}

	public Square(int side) {
		this.sideOfSquare = side;
	}

	@Override
	public double getArea() {
		logger.log(Level.INFO, String.valueOf(sideOfSquare * sideOfSquare));
		return sideOfSquare * sideOfSquare;	
	}


	
}
