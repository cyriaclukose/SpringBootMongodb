package com.hotel.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.app.domain.Hotel;
/**
 * 
 * @author Cyriac Lukose
 *
 */
@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
	
	List<Hotel> findByPricePerNightLessThan(int maxprice);
	
	List<Hotel>findByPricePerNightGreaterThan(int minPrice);
	

	
	@Query(value =" {'address.city':?0}")
	List<Hotel>findByCity(String city);
	
	@Query(value= "{'reviews.rating':{$gt:?0}}")
	List<Hotel>findByRating(int rating);
	
	
	@Query(value="{ 'reviews.rating':{$gt:?0},'pricePerNight':{$gt:?1}}")
	List<Hotel>findByRatingandPrice(int rating,int price);
 
}
