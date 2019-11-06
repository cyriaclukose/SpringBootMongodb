package com.hotel.app.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "hotels")
public class Hotel {

	@Id
	private String id;
	private String  name;
	@Indexed(direction = IndexDirection.ASCENDING)
	private int pricePerNight;
	private Address address;
	private List<Review>reviews;
	/**
	 * @param id
	 * @param name
	 * @param pricePerNight
	 * @param address
	 * @param reviews
	 */
	public Hotel(String name, int pricePerNight, Address address, List<Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.pricePerNight = pricePerNight;
		this.address = address;
		this.reviews = reviews;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pricePerNight
	 */
	public int getPricePerNight() {
		return pricePerNight;
	}
	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}
	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	
	
	
}
