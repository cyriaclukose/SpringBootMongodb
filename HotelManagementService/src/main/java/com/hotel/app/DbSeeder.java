package com.hotel.app;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hotel.app.domain.Address;
import com.hotel.app.domain.Hotel;
import com.hotel.app.domain.Review;
import com.hotel.app.repository.HotelRepository;
/**
 * 
 * @author Cyriac Lukose
 *
 */
@Component
public class DbSeeder implements CommandLineRunner {

	private HotelRepository holtelRepository;

	@Autowired
	public void dbSeeder(HotelRepository holtelRepository) {
		this.holtelRepository = holtelRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Hotel marriot = new Hotel("marriot", 130, new Address("paris", "france"),
				Arrays.asList(new Review("Emily", true, 7), new Review("Jane", false, 8)

				));
		Hotel ibis = new Hotel("marriot", 150, new Address("amsterdam", "denmark"),
				Arrays.asList(new Review("john", true, 7)

				));
		Hotel taj = new Hotel("taj", 95, new Address("delhi", "India"), new ArrayList<>()

		);
		
		this.holtelRepository.deleteAll();
		this.holtelRepository.saveAll(Arrays.asList(marriot,ibis,taj));

	}

}
