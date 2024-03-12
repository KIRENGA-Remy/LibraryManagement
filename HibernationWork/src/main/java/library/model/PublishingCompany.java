package library.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
public class PublishingCompany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;

	@OneToMany(mappedBy = "publisher")
	private List<Book> book;


	public PublishingCompany(String name) {
		super();
		this.name = name;
	}

	public PublishingCompany() {
		super();
	}
	
	public List<Book> getBook() {
		return book;
	}
	
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
