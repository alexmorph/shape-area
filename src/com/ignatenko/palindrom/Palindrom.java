package com.ignatenko.palindrom;

public class Palindrom {
	
	
	
	public int check (long result) {
		 String valueToString = String.valueOf(result);	
		 int x = 0;
		 int j = valueToString.length() - 1;
		 for (int i = 0; i < valueToString.length() / 2; i++) {
		 if (valueToString.charAt(i) == valueToString.charAt(j)) {
			 j--;
		 }else {
			result = result - 1;
			check(result);			  //вот тут stackoverflow ERROR
		 }
		x = Integer.valueOf(valueToString);		  
		 }
		 return x;
	}
	
	
	public int findMaxPalindrom(int value1, int value2) {
		boolean b = checkValueSize(value1, value2);
		long result = -1;
		if(b == true) {
		 result = value1 * value2;
      int x = check(result);	 
		return (int) x;
		}else {
			return (int)result;
		}	
	}
	
	
	//проверяем чтобы длину значений чтобы было = 4
	public boolean checkValueSize(int value1, int value2) {
		int value1Size = (int)(Math.log10(value1)+1);
		int value2Size = (int)(Math.log10(value2)+1);
		if(value1Size == 4 && value1 > 0 && value2Size == 4 && value2 > 0 )	
			return true;			
		else 
			return false;		
	}
	
	
	
	

}
