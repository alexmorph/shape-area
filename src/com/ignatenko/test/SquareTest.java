package com.ignatenko.test;

import org.junit.Assert;
import org.junit.Test;

import com.ignatenko.square.Square;

public class SquareTest {

	@Test
	public void squareAreaTest() {
		Square square = new Square(4);
		double result = square.getArea();
		Assert.assertEquals(Double.valueOf(16), (Double) result);
	}

}
