package com;

public class Shape {
	public void calculate(Area areaCalculator) {
        areaCalculator.calculateArea(4);
    }

	public static void main(String[] args) {
		
		 Shape shape = new Shape();
	        
	        shape.calculate((sides) -> {
	            int area = sides * sides;
	            System.out.println("Area: " + area);
	        });
	}

}
