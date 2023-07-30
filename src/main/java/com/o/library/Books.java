package com.o.library;

public class Books {

	private long id;
	private String name;
	private String author;
	
	public Books(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
