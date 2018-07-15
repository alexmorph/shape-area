package com.ignatenko.test;

import org.junit.Assert;
import org.junit.Test;
import com.ignatenko.triangle.Triangle;

public class TriangleTest {

	@Test
	public void triangleAreaTest() {
		Triangle triangle = new Triangle(2, 4);
		double result = triangle.getArea();
		Assert.assertEquals((Double) 3.872983346207417, (Double) result);
	}
	
	@Test
	public void triangleZeroAreaTest() {
		Triangle triangle = new Triangle(0, 4);
		double result = triangle.getArea();
		Assert.assertEquals((Double)0.0, (Double) result);
	}

}
