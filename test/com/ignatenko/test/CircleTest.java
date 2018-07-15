package com.ignatenko.test;

import org.junit.Assert;
import org.junit.Test;

import com.ignatenko.circle.Circle;

public class CircleTest {

	@Test
	public void circleZeroAreaTest() {
		Circle circle = new Circle();
		circle.setRadius(0);
		double result = circle.getArea();
		Assert.assertEquals((Double) 0.0, (Double) result);
	}
	
	@Test
	public void circleValidAreaTest() {
		Circle circle = new Circle();
		circle.setRadius(5);
		double result = circle.getArea();
		Assert.assertEquals((Double)  78.53981633974483, (Double) result);
	}

}
