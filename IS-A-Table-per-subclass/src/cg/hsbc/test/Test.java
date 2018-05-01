package cg.hsbc.test;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cg.hsbc.beans.Admin;
import cg.hsbc.beans.HEmployee;
import cg.hsbc.beans.SEmployee;

public class Test {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		Configuration cfg= new Configuration();
		cfg.configure("cg/hsbc/resource/hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction t= session.beginTransaction();
		
		SEmployee se = new SEmployee(111,"abc","abc@gmail.com",5000,"Java");
		HEmployee he = new HEmployee(222, "pqr", "pqr@gmail.com", 10000, 8);
		Admin admin = new Admin(333, "xyz", "xyz@gmail.com", 10000,"CS");
		
		session.save(se);
		session.save(he);
		session.save(admin);
		
		/*session.saveOrUpdate(se);
		session.saveOrUpdate(he);
		session.saveOrUpdate(admin);*/
		
		t.commit();
		session.close();
		sf.close();
		
		System.out.println("Table PER Class Demo Completed");
	}

}
