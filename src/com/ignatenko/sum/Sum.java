package com.ignatenko.sum;


public class Sum {
	
	private int value = 12345;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


	public int findSumOfNumbers(int value) {
		int x = 0;
		while(value > 0) {
			x += value % 10;
			value /= 10;
		}	
		return x;
	}
	
	public int findSumOfNumbersUsingString(int value) {
		int result = 0;
		char chars [] = String.valueOf(value).toCharArray();
		for (int i = 0; i < chars.length; i++) {
			result = result + Integer.parseInt(String.valueOf(chars[i]) );
		}
	return result;
	}
	

}
