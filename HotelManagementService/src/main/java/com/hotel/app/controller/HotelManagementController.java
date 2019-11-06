package com.hotel.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.domain.Hotel;
import com.hotel.app.repository.HotelRepository;

/**
 * 
 * @author Cyriac Lukose
 *
 */
@RestController
public class HotelManagementController {
	
	
	private HotelRepository hotelRepository;
	
	
	HotelManagementController(HotelRepository hotelRepository)
	{
		this.hotelRepository=hotelRepository;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/hotels")
	private List<Hotel> getAllHotels()
	{
		return hotelRepository.findAll();
	}
	
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("/hotels/price/lesser/{price}")
	private List<Hotel> getAllHotels(@PathVariable int price)
	{
		return hotelRepository.findByPricePerNightLessThan(price);
	}
	

	/**
	 * 
	 * @return
	 */
	@GetMapping("/hotels/price/greater/{price}")
	private List<Hotel> getAllHotels1(@PathVariable int price)
	{
		return hotelRepository.findByPricePerNightGreaterThan(price);
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/hotels/city/{city}")
	private List<Hotel> getAllHotels(@PathVariable String city)
	{
		return hotelRepository.findByCity(city);
	}
	
	@GetMapping("/hotels/rating/{rating}")
	
	private List<Hotel> findByCityAndRating(@PathVariable int rating)
	{
		return hotelRepository.findByRating(rating);
	}
	
      @GetMapping("/hotels/rating/{rating}/price/{price}")
	private List<Hotel> findByRatingAndPrice(@PathVariable int rating,@PathVariable int price)
	{
		return hotelRepository.findByRatingandPrice(rating, price);
	}

}
