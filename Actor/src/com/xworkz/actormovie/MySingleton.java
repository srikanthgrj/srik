package com.xworkz.actormovie;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySingleton {
	private static SessionFactory factory;
	
	public static SessionFactory getFactory(){
		return factory;
	}
	static{
		Configuration cfg = new Configuration();
		cfg.configure("resources\\mysql.xml");
		factory = cfg.buildSessionFactory();
		}

}
