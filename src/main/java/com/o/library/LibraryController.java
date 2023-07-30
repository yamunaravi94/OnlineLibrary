package com.o.library;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	
	
	@RequestMapping("/books")
	public List<Books> retrieveAllBooks(){
		return Arrays.asList(
				new Books(1,"Alchemist","Paulo"),
				new Books(2,"Harry Potter","JK Rowling"),
				new Books(3,"i too had a love story","Chetan")
				);
		
	}
	

}
