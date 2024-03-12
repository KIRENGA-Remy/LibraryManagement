package library.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


import library.model.Customer;
import library.utils.HibernateUtil;

public class CustomerServices {

	

	public static CustomerServices customerServices;
	protected static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	protected static Session session;
	
	private CustomerServices() {}
	
	public static CustomerServices getInstance() {
		if(customerServices == null) {
			return new CustomerServices();
		}
			return null;
	}
	
	public void addCustomer(Customer customer) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
	}
	
	public List<Customer> getAllCustomers(){
		
		session = sessionFactory.openSession();
		Query q = session.createQuery("from Customer");
		List<Customer> cust = q.list();
		
		return cust;
		
	}
	
	
}
