package com.iesvirgendelcarmen.poo.ejercicios;

import java.util.ArrayList;
import java.util.List;

// a · x ^ 2 + b · x + c = 0
public class SecondGradeEquation {

	private double a;
	private double b;
	private double c;
	
	public SecondGradeEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "SecondGradeEquation: " + a + " · x ^ 2 + " + b + " · x + " + c + " = 0";
	}
	
	private double getSquareRootOfDiscriminate() {
		return Math.sqrt(b * b - 4 * a * c);
	}
	
	public boolean isResoluble() {
		return ! Double.isNaN(this.getSquareRootOfDiscriminate());
	}
	
	public List<Double> getSolutions(){
		List<Double> solutionsList = new ArrayList<>();
		if ( this.getSquareRootOfDiscriminate() == 0)
			solutionsList.add(-b / (2 * a));
		else {
			solutionsList.add((-b + this.getSquareRootOfDiscriminate()) / 
					(2 * a));
			solutionsList.add((-b - this.getSquareRootOfDiscriminate()) / 
					(2 * a));
		}
		return solutionsList;
	}
	
	
	
	
}
