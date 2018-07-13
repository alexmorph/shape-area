package com.ignatenko.test;

import org.junit.Assert;
import org.junit.Test;
import com.ignatenko.triangle.Triangle;

public class TriangleTest {

	@Test
	public void triangleAreaTest() {
		Triangle triangle = new Triangle(18, 20, 10);
		double result = triangle.getArea();
		System.out.println(result);
		Assert.assertEquals((Double) 89.7997772825746, (Double) result);
	}

}
