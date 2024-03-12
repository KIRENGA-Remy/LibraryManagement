package library.model;

import jakarta.persistence.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BookId")
	private int id;
	
	@Column(name = "BookName" , nullable = false)
	private String bookName;
	
	@Column(name = "BookGenre" , nullable = false)
	private String bookGenre;
	
	@JoinColumn(name = "BookAuthor" , nullable = false)
	@ManyToOne
	private Author bookAuthor;
	
	@ManyToOne
	private Library library;
	
	@ManyToOne
	private PublishingCompany publisher;
	
	
	public Book() {
		super();
	}


	public Book(String bookName, String bookGenre, Author bookAuthor, Library lib, PublishingCompany pub) {
		super();
		this.bookName = bookName;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.library = lib;
		this.publisher = pub;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public Author getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(Library lib) {
		this.library = lib;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library lib) {
		this.library = lib;
	}
	public PublishingCompany getPublisher() {
		return publisher;
	}
	public void setPublisher(PublishingCompany pub) {
		this.publisher = pub;
	}
	
	
	
}
