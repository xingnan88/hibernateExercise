package com.huang.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.huang.hibernate.model.Teacher;

public class TestTeacher
{
	public static void main(String[] args)
	{
		Teacher teacher=new Teacher();
		teacher.setName("dasfd");
		teacher.setTitle("dfs");
		teacher.setBirthday(new Date());
		
		Configuration cfg =new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
