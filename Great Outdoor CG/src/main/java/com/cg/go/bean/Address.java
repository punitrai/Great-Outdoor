package com.cg.go.bean;

public class Address {
	
	private String city;
	private String state;
	private String country;
	
	public Address()
	{
		
	}
	
	public Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public String setCity(String city) {
		return this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public String setCountry(String country) {
		return this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
