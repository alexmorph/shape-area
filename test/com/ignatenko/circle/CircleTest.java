package com.ignatenko.circle;

import org.junit.Assert;
import org.junit.Test;

import com.ignatenko.circle.Circle;

public class CircleTest {

	@Test
	public void circleZeroAreaTest() {
		Circle circle = new Circle();
		circle.setRadius(0);
		int result = circle.getArea();
		Assert.assertEquals( 0, result);
	}
	
	@Test
	public void circleValidAreaTest() {
		Circle circle = new Circle();
		circle.setRadius(5);
		int result = circle.getArea();
		Assert.assertEquals(78, result);
	}

}
