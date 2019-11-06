package com.hotel.app.domain;

public class Review {
	
	private String name;
	private boolean approved;
	private int rating;
	/**
	 * @param name
	 * @param approved
	 * @param rating
	 */
	public Review(String name, boolean approved, int rating) {
		super();
		this.name = name;
		this.approved = approved;
		this.rating = rating;
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
	 * @return the approved
	 */
	public boolean isApproved() {
		return approved;
	}
	/**
	 * @param approved the approved to set
	 */
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
