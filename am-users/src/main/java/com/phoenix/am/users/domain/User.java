package com.phoenix.am.users.domain;

import java.util.List;

public class User {

	private String firstName;
	private String lastName;
	private String bridgeId;
	private List<String> assets;
	
	
	
	public User(String firstName, String lastName, String bridgeId, List<String> assets) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bridgeId = bridgeId;
		this.assets = assets;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBridgeId() {
		return bridgeId;
	}
	public void setBridgeId(String bridgeId) {
		this.bridgeId = bridgeId;
	}
	public List<String> getAssets() {
		return assets;
	}
	public void setAssets(List<String> assets) {
		this.assets = assets;
	}
	
	
}
