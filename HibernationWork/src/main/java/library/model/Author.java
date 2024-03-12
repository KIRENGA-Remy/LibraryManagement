package library.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String nationality;
	
	@Column
	private String gender;
	
	//@Column
	@OneToMany(mappedBy = "bookAuthor")
	private List<Book> bookName;

	
	
	public Author() {
		super();
	}
	
	
	public Author(String name, String nationality, String gender) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.gender = gender;
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Book> getBookName() {
		return bookName;
	}
	public void setBookName(List<Book> bookName) {
		this.bookName = bookName;
	}


}
