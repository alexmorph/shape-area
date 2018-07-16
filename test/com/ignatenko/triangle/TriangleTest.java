package com.ignatenko.triangle;

import org.junit.Assert;
import org.junit.Test;
import com.ignatenko.triangle.Triangle;

public class TriangleTest {

	@Test
	public void triangleAreaTest() {
		Triangle triangle = new Triangle(2, 4);
		int result = triangle.getArea();
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void triangleZeroAreaTest() {
		Triangle triangle = new Triangle(0, 4);
		int result = triangle.getArea();
		Assert.assertEquals(0, result);
	}

}
