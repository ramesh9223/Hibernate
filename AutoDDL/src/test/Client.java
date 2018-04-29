package test;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.cfg.Configuration;

public class Client {

	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		cfg.buildSessionFactory();
		

	}

}
