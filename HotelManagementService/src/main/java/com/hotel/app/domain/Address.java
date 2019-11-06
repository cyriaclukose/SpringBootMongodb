package com.hotel.app.domain;

public class Address {
	
	private String city;
	
	private String country;
	
	

	/**
	 * @param city
	 * @param country
	 */
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
