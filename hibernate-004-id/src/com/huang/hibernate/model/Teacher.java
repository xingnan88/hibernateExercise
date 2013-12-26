package com.huang.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="_teacher")
public class Teacher
{
	private int id;
	private String name;
	private String title;
	private Date birthday;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	@Column(name="_name")
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Transient
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	@Temporal(TemporalType.TIME)
	public Date getBirthday()
	{
		return birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}
}
