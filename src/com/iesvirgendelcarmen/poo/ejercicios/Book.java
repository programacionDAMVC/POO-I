package com.iesvirgendelcarmen.poo.ejercicios;

public class Book {
	
	private String author;
	private String title;
	private String isbn;
	private String editorial;
	
	public Book(String author, String title, String isbn, String editorial) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.editorial = editorial;
	}
	
	public Book() {} //constructor por defecto, ya NO lo crea java porque ya existe uno

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", isbn=" + isbn + ", editorial=" + editorial + "]";
	}
	
}
