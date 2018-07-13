package com.ignatenko.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.circle.Circle;
import com.ignatenko.square.Square;
import com.ignatenko.triangle.Triangle;

public class RunApp {
	private static final Logger logger = Logger.getLogger(RunApp.class.getName());

	public static void main(String[] args) {
		Square square = new Square(4);
		Circle cirlce = new Circle();
		cirlce.setRadius(14);
		logger.log(Level.INFO, String.valueOf(cirlce.getArea()));

		square.getArea();

		Triangle triangle = new Triangle(18, 20, 10);
		System.out.println(triangle.getArea());

	}

}
