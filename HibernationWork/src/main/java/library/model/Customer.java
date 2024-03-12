package library.model;

import jakarta.persistence.*;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private int cardCode;
	
	@ManyToOne
	private Library library;
	
	
	
	
	public Customer(String name, int cardCode, Library library) {
		super();
		this.name = name;
		this.cardCode = cardCode;
		this.library = library;
	}
	
	
	public Customer() {
		super();
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
	public int getTel() {
		return cardCode;
	}
	public void setTel(int tel) {
		this.cardCode = tel;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	
	
	
}
