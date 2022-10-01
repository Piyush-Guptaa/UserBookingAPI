package com.BookingAPIUser.UserBookingAPI.Daolayer;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.BookingAPIUser.UserBookingAPI.Entity.UserDetails;

@Repository
public interface DaoLayer extends MongoRepository<UserDetails, Integer> {
	
	UserDetails findById(int bookingID);

}
