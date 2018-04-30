package test;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SaveClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		//create student object
		
		Student st= new Student();
		st.setId(111);
		st.setName("Raja");
		st.setEmail("ramesh9223@gmail.com");
		st.setAddress("Pune");
		
		int pk=(Integer)session.save(st);// session.save method will resurn primary key
		System.out.println("Primary key Returned---------->"+pk);
		t.commit();
		
		session.close();
		sf.close();
		
		System.out.println("Successfully inserted");

	}

}
