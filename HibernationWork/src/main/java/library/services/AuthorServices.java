package library.services;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;

import library.model.Author;
import library.utils.HibernateUtil;

public class AuthorServices {
	
	
	public static AuthorServices authorServices;
	protected static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private AuthorServices() {}
	
	public static AuthorServices getInstance() {
		if(authorServices == null) {
			return new AuthorServices();
		}
			return null;
	}
	
	public void addAuthor(Author auth) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(auth);
		session.getTransaction().commit();
	}
	
	public List<Author> getAllAuthors(){
		
		session = sessionFactory.openSession();
		Query q = session.createQuery("from Author");
		List<Author> author = q.list();
		
		return author;
		
	}
	
	public Author getAuthorById(int id) {
		
		session = sessionFactory.openSession();
		Author auth = session.load(Author.class, id);
		return auth;
		
	}
	
	

}
