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

	public static void main(String[] args) {

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

		Shape minimalFigure = null;
		Shape maximalFigure = null;

if (!figures.isEmpty()) {
	minimalFigure = figures.get(0);
	maximalFigure = figures.get(0);
}

for (int i = 0; i < figures.size(); i++) {
	if( maximalFigure.getArea() < figures.get(i).getArea())
		maximalFigure = figures.get(i);
	if( i >= 1 && minimalFigure.getArea() > figures.get(i).getArea())
		minimalFigure = figures.get(i);
}

		logger.log(Level.INFO, "Min area contain in class: " +minimalFigure.getClass().getSimpleName() + " area: " + minimalFigure.getArea());
		logger.log(Level.INFO, "Max area contain in class: " +maximalFigure.getClass().getSimpleName() + " area: " + maximalFigure.getArea());



	}

}
