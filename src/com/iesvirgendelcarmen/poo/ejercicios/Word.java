package com.iesvirgendelcarmen.poo.ejercicios;

public class Word {
	
	private String data;

	public Word(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Word [data=" + data + "]";
	}
	
	public String getDataInUpperCase() {
		return data.toUpperCase();
	}
	
	public String getDataInLowerCase() {
		return data.toLowerCase();
	}
	
	public int getNumberOfCharacterOfData() {
		return data.length();
	}
	
	public String changeCharacterInData(char oldCharacter, char newCharacter) {
		return data.replace(oldCharacter, newCharacter);
	}
	
	public char getFirstCharacterOfData() {
		return data.charAt(0);
	}
	
	public char getLastCharacterOfData() {
		return data.charAt(data.length() -1);
	}
	
	
	
	
}
