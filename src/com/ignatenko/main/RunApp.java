package com.ignatenko.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.ignatenko.FindValues.FindValue;
import com.ignatenko.circle.Circle;
import com.ignatenko.figures.AbstractShape;
import com.ignatenko.figures.Shape;
import com.ignatenko.square.Square;
import com.ignatenko.triangle.Triangle;

public class RunApp {
	private static final Logger logger = Logger.getLogger(RunApp.class.getName());
	private static FindValue findValue;

	public static void main(String[] args) {

		// Circle cirlce = new Circle();
		// cirlce.setRadius(5);
		// logger.log(Level.INFO, String.valueOf(cirlce.getArea()));

		// Square square = new Square();
		// square.setSideOfSquare(0);
		// logger.log(Level.INFO, String.valueOf(square.getArea()));

		Triangle triangle = new Triangle(2, 4);
		// logger.log(Level.INFO, String.valueOf(triangle.getArea()));

		List<Shape> figures = new ArrayList<>();
		figures.add(new Circle(4));
		figures.add(new Circle(2));
		figures.add(new Circle(6));
		figures.add(new Square(4));
		figures.add(new Square(2));
		figures.add(new Square(6));
		figures.add(new Triangle(4, 8));
		figures.add(new Triangle(5, 9));
		figures.add(new Triangle(6, 10));

		// Map<String, Integer> ñircleValues = new HashMap<>();
		// List<Integer> SquareValues = new ArrayList<>();
		// List<Integer> TriangleValues = new ArrayList<>();

		Class<? extends Shape> minimalFigure = null;
		Class<? extends Shape> maximalFigure = null;

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (Shape i : figures) {
			if (i.getArea() > max) {
				max = i.getArea();
				maximalFigure = i.getClass();
			}
			if (i.getArea() < min) {
				min = i.getArea();
				minimalFigure = i.getClass();
			}
		}

		logger.log(Level.INFO, "Min area contain in class: " +minimalFigure.getName() + " area: " + min);
		logger.log(Level.INFO, "Max area contain in class: " +maximalFigure.getName() + " area: " + max);

		// for(Map.Entry<String, Integer> entry : ñircleValues.entrySet() ) {
		// System.out.println(entry.getKey() + " " +entry.getValue());
		// }

		// System.out.println(Collections.max(CircleValues.values()) + " "
		// +CircleValues.getClass());
		// System.out.println(Collections.min(CircleValues));

	}

}
