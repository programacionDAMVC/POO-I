package com.iesvirgendelcarmen.poo.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

	public static void main(String[] args) {
		
		Book book1 = new Book("Cervantes", "El quijote", "9788467016901", "S.L.U. ESPASA LIBROS");
		
		Book book2 = new Book();
		book2.setAuthor("F. Rojas");
		book2.setTitle("La Celestina");
		book2.setIsbn("9788431615116");
		book2.setEditorial("Vicen Vives");
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(book1);
		bookList.add(book2);
		
		System.out.println(bookList);
		
		
		

	}

}
