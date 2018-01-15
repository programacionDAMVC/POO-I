package com.iesvirgendelcarmen.poo.ejercicios;

import java.util.Scanner;

public class TestWord {
	public static void main(String[] args) {
		System.out.println("INTRODUCE UNA PALABRA");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		sc.close();
		Word word = new Word(data);
		System.out.println(word);
		System.out.printf("Palabra en mayúscula es %s y en minúscula %s%n", 
				word.getDataInUpperCase(), word.getDataInLowerCase());
		System.out.printf("Nº caracteres de la palabra %d%n",
				word.getNumberOfCharacterOfData());
		char oldChar = 'o';
		char newChar = 'u';
		System.out.printf("Cambiando caracter %c por %c queda %s%n", 
				oldChar, newChar, word.changeCharacterInData(
						oldChar, newChar));
		System.out.printf("Primera letra de la palabra %c y última %c%n",
				word.getFirstCharacterOfData(), word.getLastCharacterOfData());
	}
}
