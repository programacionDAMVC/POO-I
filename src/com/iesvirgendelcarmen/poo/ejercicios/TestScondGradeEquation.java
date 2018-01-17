package com.iesvirgendelcarmen.poo.ejercicios;

import java.util.Scanner;

public class TestScondGradeEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce los coeficientes de la ecuación");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		SecondGradeEquation sge = new SecondGradeEquation(a, b, c);
		if (sge.isResoluble()) {
			for (Double d : sge.getSolutions()) {
				System.out.printf("Solución %.2f%n", d);
			}
		}
		else
			System.out.println(sge + " no es resoluble");
	}

}
