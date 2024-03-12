package library.model;



import library.services.AuthorServices;
import library.services.BookServices;
import library.services.CustomerServices;
import library.services.LibraryServices;
import library.services.PublisherServices;

public class Program {
	
	public static void main(String args[]) {
		
		PublisherServices pub = PublisherServices.getInstance();
		PublishingCompany pub1 = new PublishingCompany("MC Publishers");
		pub.addLibrary(pub1);
		PublishingCompany publisher = pub.getPublisherById(1);
		
		LibraryServices libs = LibraryServices.getInstance();
		Library lib1 = new Library("Kigali Public Library");
		libs.addLibrary(lib1);
		Library lib = libs.getLibraryById(1);
		
		
		CustomerServices cust = CustomerServices.getInstance();
		Customer cust1 = new Customer("Lorie", 1234, lib);
		cust.addCustomer(cust1);
		
		AuthorServices auth = AuthorServices.getInstance();
		Author author1 = new Author("James Hawkling", "Spain", "Male");
		auth.addAuthor(author1);
		Author myAuth = auth.getAuthorById(1);
		
		
		BookServices bks = BookServices.getInstance();
		Book book1 = new Book("Basics of Java", "Studies",myAuth,lib,publisher );
		bks.addEmployee(book1);
	}

}




