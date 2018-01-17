package com.iesvirgendelcarmen.poo.ejercicios;
import static java.lang.Math.*;

/**
 * Managed class for right triangle
 * @author Manuel
 * @version 1.0
 */

public class RightTriangle {
	
	private double sideOne;
	private double sideTwo;
	
	
	/**
	 * Constructor
	 * @param sideOne first side of right triangle, type double
	 * @param sideTwo second side of right triangle, type double
	 */
	public RightTriangle(double sideOne, double sideTwo) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
	}
	
	/**
	 * 
	 * @return hypotenuse value of right triangle, type double 
	 */
	public double getHypotenuse() {
		return sqrt(pow(sideOne, 2) + pow(sideTwo, 2));
	}
	
	/**
	 * 
	 * @return area value of right triangle, type double
	 */
	
	public double getArea() {
		return sideOne * sideTwo / 2.0;
	}
	
	/**
	 * 
	 * @return perimeter value of right triangle, type double
	 */
	public double getPerimeter() {
		return sideOne + sideTwo + getHypotenuse();
	}

	
	
	@Override
	public String toString() {
		return "RightTriangle [sideOne=" + sideOne + ", sideTwo=" + sideTwo + ", hypotenuse=" + getHypotenuse()
				+ "]";
	}
	
	
}
