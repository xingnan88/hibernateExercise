package com.huang.hibernate.model;

public class Student
{
	private StudentPk pk;
	private int age;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public StudentPk getPk()
	{
		return pk;
	}

	public void setPk(StudentPk pk)
	{
		this.pk = pk;
	}



}
