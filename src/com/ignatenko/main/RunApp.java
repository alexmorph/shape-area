package com.ignatenko.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.square.Square;

public class RunApp {
	private static final Logger logger = Logger.getLogger(RunApp.class.getName());

	public static void main(String[] args) {
		Square square = new Square(4);
		square.getArea();

	}

}
