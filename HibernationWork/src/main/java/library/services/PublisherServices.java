package library.services;

import org.hibernate.*;
import org.hibernate.query.*;

import library.model.PublishingCompany;
import library.utils.HibernateUtil;

public class PublisherServices {

	
	public static PublisherServices pubServices;
	protected static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private PublisherServices() {}
	
	public static PublisherServices getInstance() {
		if(pubServices == null) {
			return new PublisherServices();
		}
			return null;
	}
	
	public void addLibrary(PublishingCompany lib) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(lib);
		session.getTransaction().commit();
	}
	
	public PublishingCompany getAllPublishers(){
		
		session = sessionFactory.openSession();
		Query q = session.createQuery("from Library");
		PublishingCompany pub = (PublishingCompany) q.list();
		
		return pub;
		
	}
	
	
	public PublishingCompany getPublisherById(int id) {
		
		session = sessionFactory.openSession();
		PublishingCompany lib = session.load(PublishingCompany.class, id);
		return lib;
		
	}
	

}
