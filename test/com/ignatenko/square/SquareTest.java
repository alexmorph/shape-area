package com.ignatenko.square;

import org.junit.Assert;
import org.junit.Test;

import com.ignatenko.square.Square;

public class SquareTest {

	@Test
	public void squareAreaTest() {
		Square square = new Square(4);
		//square.setSideOfSquare(4);
		int result = square.getArea();
		Assert.assertEquals(16, result);
	}
	
	@Test
	public void squareZeroAreaTest() {
		Square square = new Square(0);
		//square.setSideOfSquare(0);
		int result = square.getArea();
		Assert.assertEquals(0, result);
	}

}
