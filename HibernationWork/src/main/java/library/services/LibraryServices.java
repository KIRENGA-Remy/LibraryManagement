package library.services;

import org.hibernate.*;
import org.hibernate.query.Query;


import library.model.Library;
import library.utils.HibernateUtil;

public class LibraryServices {

	
	public static LibraryServices libServices;
	protected static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private LibraryServices() {}
	
	public static LibraryServices getInstance() {
		if(libServices == null) {
			return new LibraryServices();
		}
			return null;
	}
	
	public void addLibrary(Library lib) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(lib);
		session.getTransaction().commit();
	}
	
	public Library getAllLibraries(){
		
		session = sessionFactory.openSession();
		Query q = session.createQuery("from Library");
		Library lib = (Library) q.list();
		
		return lib;
		
	}
	
	
	public Library getLibraryById(int id) {
		
		session = sessionFactory.openSession();
		Library lib = session.load(Library.class, id);
		return lib;
		
	}
	

}
