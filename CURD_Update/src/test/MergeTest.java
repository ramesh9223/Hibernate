package test;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class MergeTest {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		session.get(Student.class,111);
		/*main" org.hibernate.NonUniqueObjectException: 
		a different object with the same identifier value was already associated with the session: [beans.Student#111]*/
		
		Student st= new Student();
		st.setId(111);
		st.setName("Raja");
		st.setEmail("RAMESH9223@Ymail.com");
		st.setAddress("Pune");
		
		session.merge(st);
		
		t.commit();
		
		session.close();
		sf.close();
		
		System.out.println("Merge Success");

	}

}
