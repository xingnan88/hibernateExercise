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
		StudentPk pk=new StudentPk();
		pk.setId(1);
		pk.setName("dasg");
		
		Student s=new Student();
		s.setPk(pk);
		s.setAge(1);

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
//	
//	public static void main(String[] args)
//	{
//		JunitTest js=new JunitTest();
//		js.beforeClass();
//		js.testTeacherSave();
//		js.afterClass();
//	}
	
}
