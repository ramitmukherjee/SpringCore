package com.vo;


public class PizzaVO {

	private Integer id;
	private String type;
	private String size;
	private SoftDrink softDrink;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public SoftDrink getSoftDrink() {
		return this.softDrink;
	}
	
	public void setSoftDrink(SoftDrink softDrink) {
		this.softDrink = softDrink;
	}
	
	@Override
	public String toString() {
		return "PizzaVO [id=" + id + ", type=" + type + ", size=" + size + ", softDrink=" + softDrink + "]";
	}
	
}
