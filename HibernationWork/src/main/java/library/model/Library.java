package library.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@OneToMany(mappedBy = "library")
	private List<Book> book;

	@OneToMany(mappedBy = "library")
	private List<Customer> customer;

	public Library() {
		super();
	}

	public Library(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> cust) {
		this.customer = cust;
	}
}
