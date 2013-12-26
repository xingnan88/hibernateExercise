package com.huang.hibernate.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest
{
	private static SessionFactory sessionFactory;
	
	@BeforeClass
	public static void beforeClass() {
			sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	
	@Test
	public void testTeacherSave() {
	
		Teacher t = new Teacher();
		t.setName("t1");
		t.setTitle("middle");
		t.setBirthday(new Date());
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
	}
	
}
