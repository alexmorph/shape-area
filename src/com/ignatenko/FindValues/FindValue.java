package com.ignatenko.FindValues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ignatenko.figures.Shape;
import com.ignatenko.square.Square;

public class FindValue {
	
	public void getMaxValueAndType(Shape list, int maxValue, Class myClass) {
		if (list.getClass() == Square.class)
			if (list.getArea() > maxValue) {
				maxValue = list.getArea();
				myClass = list.getClass();
			}
	}
	
	public void getMinValueAndType(Shape list, int minValue, Class myClass) {
		if (list.getClass() == Square.class)
			if (list.getArea() < minValue) {
				minValue = list.getArea();
				myClass = list.getClass();
			}
	}
	
	
}
