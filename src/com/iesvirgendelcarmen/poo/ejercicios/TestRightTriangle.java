package com.iesvirgendelcarmen.poo.ejercicios;

import java.util.Scanner;

public class TestRightTriangle {

	public static void main(String[] args) { 
		
		System.out.println("Introduce value sides");
		Scanner sc = new Scanner(System.in);
		double sideOne = sc.nextDouble();
		double sideTwo = sc.nextDouble();
		sc.close();
		
		RightTriangle rt = new RightTriangle(sideOne, sideTwo);
		System.out.println(rt);
		System.out.printf("Hypotenuse: %.2f, area: %.2f and perimeter %.2f%n",
				rt.getHypotenuse(), rt.getArea(), rt.getPerimeter());
		
	}

}
