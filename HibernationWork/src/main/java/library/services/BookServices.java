package library.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import library.model.Book;
import library.utils.HibernateUtil;


public class BookServices {
	
	
	public static BookServices bookServices;
	protected static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private BookServices() {}
	
	public static BookServices getInstance() {
		if(bookServices == null) {
			return new BookServices();
		}
			return null;
	}
	
	public void addEmployee(Book book) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
	}
	
	public List<Book> getAllBooks(){
		
		session = sessionFactory.openSession();
		Query q = session.createQuery("from Book");
		List<Book> myBook = q.list();
		
		return myBook;
		
	}
	

}
