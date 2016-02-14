package com.phoenix.am.assets.domain;

public class Asset {
	
	private String name;
	private String id;
	private String catgory;
	
	public Asset(String name, String id, String catgory) {
		super();
		this.name = name;
		this.id = id;
		this.catgory = catgory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCatgory() {
		return catgory;
	}
	public void setCatgory(String catgory) {
		this.catgory = catgory;
	}
	
}
