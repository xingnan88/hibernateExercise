package com.huang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.huang.hibernate.model.Student;

public class Test
{

	public static void main(String[] args)
	{
		Student student=new Student();
		student.setId(1);
		student.setName("zhangsan");
		student.setAge(1);
		
		Configuration cfg =new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
