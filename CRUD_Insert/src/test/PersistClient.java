package test;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class PersistClient {

	
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
		
		session.persist(st);
		//save can execute without transaction boundary
		//persist can execute within transaction boundary
		
		t.commit();//data will execute here or will be inserted here
		
		session.close();
		sf.close();
		
		System.out.println("Successfully inserted");

	}

}
