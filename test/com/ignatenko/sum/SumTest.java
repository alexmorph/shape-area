package com.ignatenko.sum;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {
	
	@Test
	public void findSumOfNumbers() {
		Sum sum = new Sum();
		int result = sum.findSumOfNumbers(12345);
		Assert.assertTrue(result < 20);
	}
	
	@Test
	public void SumOfNumbersIfValueZero() {
		Sum sum = new Sum();
		int result = sum.findSumOfNumbers(0);
		Assert.assertTrue(result == 0);
	}
	
	@Test
	public void findSumOfNumbersFromString() {
		Sum sum = new Sum();
		int result = sum.findSumOfNumbersUsingString(12345);
		Assert.assertTrue(result < 20);
	}
	
	

}
