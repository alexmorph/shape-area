package com.ignatenko.test;

import org.junit.Assert;
import org.junit.Test;

import com.ignatenko.circle.Circle;

public class CircleTest {

	@Test
	public void circleAreaTest() {
		Circle circle = new Circle();
		circle.setRadius(14);
		double result = circle.getArea();
		Assert.assertEquals((Double) 615.7521601035994, (Double) result);
	}

}
