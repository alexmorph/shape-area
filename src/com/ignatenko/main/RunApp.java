package com.ignatenko.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.circle.Circle;
import com.ignatenko.square.Square;
import com.ignatenko.triangle.Triangle;

public class RunApp {
	private static final Logger logger = Logger.getLogger(RunApp.class.getName());

	public static void main(String[] args) {
		
		Circle cirlce = new Circle();
		cirlce.setRadius(5);
		//logger.log(Level.INFO, String.valueOf(cirlce.getArea()));

		Square square = new Square();
		square.setSideOfSquare(0);
		//logger.log(Level.INFO, String.valueOf(square.getArea()));

		Triangle triangle = new Triangle(2, 0);
		logger.log(Level.INFO, String.valueOf(triangle.getArea()));

	}

}
