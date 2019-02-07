package com.vo;

import java.util.Calendar;

public class SoftDrink {

	private Integer id;
	private String name;
	private String size;
	
	private Calendar creationTime = Calendar.getInstance();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Calendar getCreationTime () {
		return creationTime;
	}
	@Override
	public String toString() {
		return "SoftDrink [id=" + id + ", name=" + name + ", size=" + size + "]";
	}
	
}
