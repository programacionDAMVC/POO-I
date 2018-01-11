package com.iesvirgendelcarmen.poo.ejercicios;

public class TestCar {

	public static void main(String[] args) {
		Car carOne = new Car();
		System.out.println(carOne);
		System.out.printf("Autonomy %.2f km%n" , carOne.getAutonomy());
		carOne.addFuel(25);
		System.out.println(carOne);
		System.out.printf("Autonomy %.2f km%n" , carOne.getAutonomy());
		
		Car carTwo = new Car();
		carTwo.setConsumption(5);
		carTwo.setFuelAmount(10);
		System.out.println(carTwo);
		System.out.printf("Autonomy %.2f km%n" , carTwo.getAutonomy());

	}

}
