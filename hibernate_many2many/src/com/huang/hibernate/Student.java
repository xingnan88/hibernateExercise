package com.huang.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student
{
	private int id;
	private String name;
	private Set<Teacher> teacher=new HashSet<Teacher>();
	@Id
	@GeneratedValue
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
    @ManyToMany
    @JoinTable(name="ts",
    		joinColumns={@JoinColumn(name="studentId")},
    		inverseJoinColumns={@JoinColumn(name="teacherId")}
    		)
	public Set<Teacher> getTeacher()
	{
		return teacher;
	}
	public void setTeacher(Set<Teacher> teacher)
	{
		this.teacher = teacher;
	}
}
