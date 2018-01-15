package com.iesvirgendelcarmen.poo.ejercicios;

import static java.lang.Math.*; //amplio espacio nombres de la clase con los métodos static de Math

public class Number {

	private double data;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Number [data=" + data + "]";
	}
	
	public double calculateSquareRootOfData() {
		return sqrt(data);
	}
	
	public double calculateCubicRootOfAbsoluteData() {
		return cbrt(abs(data));
	}
	
	public int getRoundAbsoluteData() {
		return (int) round(abs(data));
	}
	
	public int getARandomOfZerotoRoudData() {
		/*int number = getRoundAbsoluteData();
		int randomNumber = (int) (Math.random() * (number + 1)) ;
		return randomNumber;*/
		return (int) (random() * (getRoundAbsoluteData() + 1));
	}
	
	
}
