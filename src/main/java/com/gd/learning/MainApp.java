package com.gd.learning;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
 
        session.beginTransaction();
        User user = new User();
 
        user.setUserId(1);
        user.setUsername("Asraf");
        user.setCreatedBy("Google");
        user.setCreatedDate(new Date());
 
        session.save(user);
        session.getTransaction().commit();
 
    }
 

	
	
	
}
