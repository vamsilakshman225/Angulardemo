package cascadetypes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {
public static void main(String[] args) {
	SessionFactory f= new Configuration().configure().buildSessionFactory();
	Session s= f.openSession();
	s.beginTransaction();
	Employee e= new Employee();
	e.setFirstName("kumari");
	e.setLastName("G");
	List<Customer> ac= new ArrayList<Customer>();
	Customer c= new Customer();
	c.setAccountNumber("123456");
	ac.add(c);
	e.setCust(ac);
	s.save(e);
	//s.save(c);
	s.getTransaction().commit();
	s.close();
}
}
